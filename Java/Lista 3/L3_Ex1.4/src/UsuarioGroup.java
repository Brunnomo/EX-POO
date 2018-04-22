
public class UsuarioGroup extends Usuario{
    
    public UsuarioGroup(String login) {
        super(login);
    }
    
    public void descricaoGroup(){
        System.out.println("O usuario Group, pode add e remover usuarios de grupos");
    }
    
    public void groupBoard(){
        System.out.println(" Esse usuario Group poderá apagar usuários de seu grupo");
    }
    
    public void despedidaGroup(){
        System.out.println("Até logo" + this.getLogin() + "!");
    }
    
}
