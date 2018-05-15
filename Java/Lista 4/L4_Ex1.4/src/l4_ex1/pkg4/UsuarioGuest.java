
package l4_ex1.pkg4;

public class UsuarioGuest extends Usuario {
    
    public UsuarioGuest(String login) {
        super(login);
    }
    
    @Override
    public void descricao(){
        System.out.println("O usuario Guest so pode ler arquivos");
    }
    
    public void despedidaGuest(){
        System.out.println("Até logo " + this.getLogin() + "!");
    }
}