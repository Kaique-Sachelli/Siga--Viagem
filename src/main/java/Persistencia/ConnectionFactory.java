package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String host = "localhost";
    private String port = "3306";
    private String db = "20251_maua_tti101_t3_sub1_pessoas";
    private String user = "root";
    private String password = "123456"; //máquinas da Mauá: imtdb    
    public Connection obterConexao() throws Exception{
        //http://google.com.br:80/search
        //http://github.com:80/professorbossini
        //string de conexão
        var s = String.format(
            "jdbc:mysql://%s:%s/%s",
            host, port, db
        );
        //cláusula: catch or declare
        Connection conexao = DriverManager.getConnection(s, user, password);
        return conexao;
    }
    
    public static void main(String[] args) throws Exception{
        var fabricaDeConexoes = new ConnectionFactory();
        Connection conexao = fabricaDeConexoes.obterConexao();
        if(conexao != null){
            System.out.println("Conectou!");
        }
        else{
            System.out.println("Falhou!");
        }
    }
}
