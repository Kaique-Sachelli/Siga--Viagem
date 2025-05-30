package Persistencia;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Persistencia.Usuario;

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
    

    
    
}
