package Persistencia;


public class Usuario {
    private int id;
    String nome, login, senha;
    boolean instrutor ; 
    
    public Usuario(String nome, String login, String senha, String categoria){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
    
    public boolean getInstrutor(){
        return instrutor;
        
    }
}
    