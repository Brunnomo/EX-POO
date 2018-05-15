
package l4_ex1.pkg4;

public class UsuarioRegular extends Usuario{
    
    public UsuarioRegular(String login) {
        super(login);
    }
    
    @Override
    public void descricao(){
        System.out.println("O usuario regular pode ler arquivos e auterar arquivos");
        System.out.println("Area de usuário cadastrado");
    }
    
    public void despedidaRegular(){
        System.out.println("Até logo " + this.getLogin() + "!");
    }
    
}
