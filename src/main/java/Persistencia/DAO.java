
package Persistencia;

import java.sql.ResultSet;

public class DAO {
    public boolean existe (Usuario u) throws Exception {
        //try-with-resources 
        //1.Definir o comando SQL
        var sql = "SELECT login, senha FROM usuario WHERE login=? AND senha = ?";
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
                 return rs.next ();
            }
             //6. Fechar os recursos
        }
       
    }
}
