
public class UsuarioRoot extends Usuario {
    
    public UsuarioRoot(String login) {
        super(login);
    }
    public void descricaoRoot(){
        System.out.println("O usuario Root tem todas as permissões");
    }
    public void excluirTodos(){
        System.out.println("O usuario Root pode excluir qualquer usuario");
    }
    public void despedidaRoot(){
        System.out.println("Até logo" + this.getLogin() + "!");
    }
    
}
