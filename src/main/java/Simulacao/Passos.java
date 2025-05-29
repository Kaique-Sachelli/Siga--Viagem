package Simulacao;

public class Passos {
    public static Passos instance = new Passos();
    private boolean pegouFita = false;
    
    private Passos(){}
    
    public static Passos getInstance(){
        return instance;
    }
    
    public boolean isPegouFita() {
        return pegouFita;
    }
    
    public void setPegouFita(boolean pegouFita) {
        this.pegouFita = pegouFita;
    }
    
    /* 
    Botao sair
    
     if pegouFita = false ;
          Simulacao.Passos.getInstance().setPegouFita(true);
          pontacao -1 ;
    */      

}
