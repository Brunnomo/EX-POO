
package l4_ex1.pkg4;

public class Usuario {
    private String login;

    public Usuario(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
    
    public void descricao(){
        System.out.println("Base para os outros Usuarios");
    }
    
    public void boasvindas(){
        System.out.println("Bem-vindo " + this.login );
    }
     
}
