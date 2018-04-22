
public class Usuario {
    private String login;

    public Usuario(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
    
    public void boasvindas(){
        System.out.println("Bem-vindo " + this.login );
    }        
     
}
