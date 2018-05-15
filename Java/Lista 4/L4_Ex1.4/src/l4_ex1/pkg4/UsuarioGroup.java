
package l4_ex1.pkg4;

public class UsuarioGroup extends Usuario{
    
    public UsuarioGroup(String login) {
        super(login);
    }
    
    @Override
    public void descricao(){
        System.out.println("O usuario Group, pode add e remover usuarios de grupos");
        System.out.println(" Esse usuario Group poderá apagar usuários de seu grupo");
    }
           
    public void despedidaGroup(){
        System.out.println("Até logo " + this.getLogin() + "!");
    }
    
}
