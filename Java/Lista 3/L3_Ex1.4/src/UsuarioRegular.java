
public class UsuarioRegular extends Usuario{
    
    public UsuarioRegular(String login) {
        super(login);
    }
    public void descricaoRegular(){
        System.out.println("O usuario regular pode ler arquivos e auterar arquivos");
    }
    
    public void dashboard(){
        System.out.println("Area de usuário cadastrado");
    }
    
    public void despedidaRegular(){
        System.out.println("Até logo" + this.getLogin() + "!");
    }
    
}
