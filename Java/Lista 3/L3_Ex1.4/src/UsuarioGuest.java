
public class UsuarioGuest extends Usuario {
    
    public UsuarioGuest(String login) {
        super(login);
    }
    
    public void descricaoGuest(){
        System.out.println("O usuario Guest so pode ler arquivos");
    }
    
    public void despedidaGuest(){
        System.out.println("Até logo" + this.getLogin() + "!");
    }
}
