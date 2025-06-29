package Persistencia;

import Modelo.Estatistica;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Modelo.Usuario;
import Modelo.UsuarioLogado;
import java.time.LocalDateTime;

public class DAO {
    public boolean existe (Usuario u) throws Exception {
        //try-with-resources 
        //1.Definir o comando SQL
        var sql = "SELECT id_usuario, nome, login, senha, instrutor FROM usuario WHERE login=? AND senha = ?";
        //2. Estabelecer uma conexão com o SQBD (MySQL)
        
        //3.Preparar o comando 
        try(
            var conexao = new ConnectionFactory().obterConexao();  
            var ps = conexao.prepareStatement(sql);
            
        ){
           //4. Substituir os eventuais placeholders 
            ps.setString(1,u.getLogin());
            ps.setString(2, u.getSenha());
             //5. Executar o comando 
             try(
                 ResultSet rs = ps.executeQuery();
                     
            ){
                 if (rs.next()){
                    u.setInstrutor(rs.getBoolean("instrutor"));
                    u.setId(rs.getInt("id_usuario"));
                    u.setNome(rs.getString("nome"));
                    return true;
                 }
                 return false;
            }
             //6. Fechar os recursos
        }
       
    }
    public boolean cadastrar (Usuario u) throws Exception{
        var sql = "INSERT INTO usuario (nome, login, senha) VALUES (?, ?, ?)";
        try(
                
            var conexao = new ConnectionFactory().obterConexao();  
            var ps = conexao.prepareStatement(sql)
        ){
            ps.setString(1, u.getNome());
            ps.setString(2, u.getLogin());
            ps.setString(3, u.getSenha());        
            int linhasAfetadas = ps.executeUpdate();
            return linhasAfetadas > 0; // true = cadastrou, false = não cadastrou

        }
    
    }
    public List <Usuario> obterUsuarios() throws Exception{
        var usuarios = new ArrayList<Usuario>();
        var sql = "SELECT * FROM usuario";
        try(
                var conexao = new ConnectionFactory().obterConexao();
                var ps = conexao.prepareStatement(sql);
                var rs = ps.executeQuery();
        ){
                while(rs.next()){
                    var id = rs.getInt("id_usuario");
                    var nome = rs.getString("nome");
                    var login = rs.getString("login");
                    var senha = rs.getString("senha");
                    var instrutor = rs.getBoolean("instrutor");
                    var usuario = new Usuario(id, nome, login, senha, instrutor);
                    usuarios.add(usuario);
                }
            
                return usuarios;
            }   
    }
    public Usuario buscarUsuario(int id) throws Exception{
        
        
        var sql = "SELECT id_usuario, nome, login, senha, instrutor FROM usuario WHERE id_usuario = ?";
    
        try(
            var conexao = new ConnectionFactory().obterConexao();
            var ps = conexao.prepareStatement(sql);
        ){
            ps.setInt(1,id);
            try(
                ResultSet rs = ps.executeQuery();
            
            ){
                if (rs.next()){
                    return new Usuario(
                        rs.getInt("id_usuario"),
                        rs.getString("nome"),
                        rs.getString("login"),
                        rs.getString("senha"),
                        rs.getBoolean("instrutor")
                    );
                }   
            }
            return null;
        }
    }
    public boolean atualizaSenha(String senha, int id) throws Exception{
        var sql = "UPDATE usuario SET senha = ? WHERE id_usuario = ?";
        try(
                
            var conexao = new ConnectionFactory().obterConexao();  
            var ps = conexao.prepareStatement(sql)
        ){
            ps.setString(1, senha);
            ps.setInt(2, id);
            
            int atualizou = ps.executeUpdate();
            return atualizou > 0; 
        }
    }
    public boolean atualizaCategoria(boolean instrutor, int id) throws Exception{
        var sql = "UPDATE usuario SET instrutor = ? WHERE id_usuario = ?";
        try(
            var conexao = new ConnectionFactory().obterConexao();  
            var ps = conexao.prepareStatement(sql)
        ){
            ps.setBoolean(1, instrutor);
            ps.setInt(2, id);
            
            int atualizou = ps.executeUpdate();
            return atualizou > 0; 
        }
    }
    public boolean deletaUsuario(int id) throws Exception{
        var sql = "DELETE FROM usuario WHERE id_usuario = ?";
        
        try(
                var conexao = new ConnectionFactory().obterConexao();
                var ps = conexao.prepareStatement(sql);
        ){
            ps.setInt(1, id);
            
            int atualizou = ps.executeUpdate();
            return atualizou > 0;
        }
        
        
        
        
    }
    public List <Estatistica> obterEstatistica(int id) throws Exception{
        var estatisticas = new ArrayList<Estatistica>();
        
        var sql = "SELECT\n" +
                "e.tentativa,\n" +
                "e.data_simulacao,\n" +
                "e.erros,\n" +
                "e.acertos,\n" +
                "e.erro_fatal,\n" +
                "e.abandonada,\n" +
                "e.pontuacao\n" +
                "FROM estatistica e\n" +
                "JOIN usuario u ON (e.id_usuario = u.id_usuario)\n" +
                "WHERE u.id_usuario = ? ;";
        
        try(
            var conexao = new ConnectionFactory().obterConexao();
            var ps = conexao.prepareStatement(sql);       
        ){
            ps.setInt(1, id);
            try(
                    ResultSet rs = ps.executeQuery();     
            ){
                while(rs.next()){

                    var tentativa = rs.getInt("tentativa");
                    var dataSimulacao = rs.getObject("data_simulacao", LocalDateTime.class);
                    var erros = rs.getInt("erros");
                    var acertos = rs.getInt("acertos");
                    var pontuacao = rs.getInt("pontuacao");
                    var errosFatais = rs.getBoolean("erro_fatal");
                    var abandonada = rs.getBoolean("abandonada");
                    var estatistica = new Estatistica(tentativa, dataSimulacao, erros, acertos, pontuacao,errosFatais, abandonada);
                    estatisticas.add(estatistica);
                }
            return estatisticas;
            }
        }
    }
    public int obterRanking(int tentativa, int id)throws Exception{
        var sql = "SELECT posicao\n" +
        "FROM\n" +
        "(SELECT\n" +
        "e.id_usuario,\n" +
        "DENSE_RANK() OVER (ORDER BY e.pontuacao DESC) as posicao\n" +
        "FROM\n" +
        "estatistica e\n" +
        "JOIN\n" +
        "usuario u ON e.id_usuario = u.id_usuario\n" +
        "WHERE\n" +
        "e.tentativa = ? AND u.instrutor = false\n" +
        ") AS ranking\n" +
        "WHERE\n" +
        "id_usuario = ?;";
        
        try(
                var conexao = new ConnectionFactory().obterConexao();
                var ps = conexao.prepareStatement(sql);
        ){
            ps.setInt(1, tentativa);
            ps.setInt(2, id);
            try(
                    ResultSet rs = ps.executeQuery();
            ){
                if(rs.next()){
                    
                int rank = rs.getInt("posicao");
                return rank;
                
                }
                return 0;
            }
            
        }
        

    }
    public int obterProximaTentativa(int idUsuario)throws Exception{
        var sql = "SELECT IFNULL(MAX(tentativa), 0) + 1 AS proxima_tentativa FROM estatistica WHERE id_usuario = ?";
        try(
                var conexao = new ConnectionFactory().obterConexao();
                var ps = conexao.prepareStatement(sql);         
        ){
            ps.setInt(1, idUsuario);
            try(
                    ResultSet rs = ps.executeQuery();
            ){  if(rs.next()){
                return rs.getInt("proxima_tentativa");
                }
            return 0;
            }
            
        }
    }
    public boolean salvarEstatistica(Estatistica e)throws Exception{
        var sql = "INSERT INTO estatistica (id_usuario, tentativa, data_simulacao, erros, acertos, pontuacao, erro_fatal, abandonada) VALUES"
                + "(?, ?, CURRENT_TIMESTAMP(), ?, ?, ?, ?, ?)";
        var idUsuario = UsuarioLogado.getUsuario().getId();
        try(
                var conexao = new ConnectionFactory().obterConexao();
                var ps = conexao.prepareStatement(sql);
        ){
            ps.setInt(1, idUsuario);
            ps.setInt(2, this.obterProximaTentativa(idUsuario));
            ps.setInt(3, e.getErros());
            ps.setInt(4, e.getAcertos());
            ps.setInt(5, e.getPontuacao());
            ps.setBoolean(6, e.getErroFatal());
            ps.setBoolean(7, e.isAbandonada());
            int atualizou = ps.executeUpdate();
            return atualizou > 0;
        }
    }
}
