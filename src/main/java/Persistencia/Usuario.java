package Persistencia;


public class Usuario {
    private int id;
    private String nome, login, senha;
    boolean instrutor ; 
    
     public Usuario(int id, String nome, String login, String senha, boolean instrutor){
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.instrutor = instrutor;
    }
    
    public Usuario(String nome, String login, String senha, boolean instrutor){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.instrutor = instrutor;
    }
    
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
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
    public void setInstrutor(boolean instrutor) {
        this.instrutor = instrutor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString(){
        return String.format(
            "%s - %s", id, nome
        );
    }
}
    