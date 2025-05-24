package Persistencia;

public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;
    
    public Pessoa(String nome, String fone, String email){
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getEmail() {
        return email;
    }
    
    
    
    
}
