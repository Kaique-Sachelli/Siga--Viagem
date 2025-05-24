package Persistencia;

import java.sql.PreparedStatement;

public class PessoaDAO { //data access object
    public void cadastrar(Pessoa p) throws Exception{
        
        //1. Obter uma conexão com o SGBD
        var fabricaDeConexoes = new ConnectionFactory();
        var conexao = fabricaDeConexoes.obterConexao();
        
        //2. Definir o comando SQL (INSERT)
        var sql = "INSERT INTO tb_pessoa (nome, fone, email) VALUES (?, ?, ?)";
        
        //3. Preparar o comando por meio da conexão
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        //4. Substituir os eventuais placeholders
        ps.setString(1, p.getNome());
        ps.setString(2, p.getFone());
        ps.setString(3, p.getEmail()); 
        
        //5. Executar o comando
        ps.execute();
        
        //6. Fechar os recursos
        ps.close();
        conexao.close();
    }
    
}
