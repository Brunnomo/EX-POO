
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Exercício 1.4. (Obrigatório) Em Desenvolvimento Web, autenticação
 * e autorização são conceitos fundamentais. Em um sistema, um Guest,
 * Regular, Group e Root são tipos de Usuário. Um usuário possui uma
 * string que representa seu login. Cada um desses vai possuir métodos de
 * despedida e descrição da permissão (o que cada um deles fazem. Aqui
 * você é livre para criar). Os métodos descritos devem possuir a convenção
 * acaoUsuario (por exemplo, despedidaRegular()). Um regular
 * terá um método chamado void dashboard() (imitação de uma área de
 * usuário cadastrado), o usuário de grupo terá um void groupBoard()
 * que avisará que ele poderá apagar usuários de seu grupo (apenas a
 * mensagem). O super usuário terá um método void excluirTodos()
 * que avisa que ele poderá excluir todos os usuários (apenas mensagem).
 * Sabe-se que todos esses usuários mostrarão uma mensagem de boasvindas
 * ao ínicio do sistema. A mensagem será: Bem-vindo <seuloginaqui>.
 * Implemente as classes envolvidas e esboce um diagrama de classes. Crie
 * um menu de testes a partir da descrição do problema acima.
 *
 * @author 
 */
public class L3_Ex1_4 {

    public static void main(String[] args) {
        
        ArrayList<Usuario> usuarios = new ArrayList();
        Scanner ler = new Scanner( System.in );
        String login;
         
        UsuarioRoot uRoot = new UsuarioRoot("root"); //criei um usuario Root com Login de root
        UsuarioRegular uRegular = new UsuarioRegular("regular"); //criei um usuario Regular com login regular
        UsuarioGuest uGuest = new UsuarioGuest("guest"); //criei um usuario Guest com login de guest
        UsuarioGroup uGroup = new UsuarioGroup("group"); //criei um usuario Group com login de group
        
        //add todos os usuarios em uma lista usuarios
        usuarios.add(uRoot);
        usuarios.add(uRegular);
        usuarios.add(uGuest);
        usuarios.add(uGroup);
        
        
        System.out.println("[---SISTEMA DE USUARIOS---]");
        System.out.println("[---- DIGITE SEU LOGIN ---]");
        System.out.printf("LOGIN: ");
        login=ler.next();
        
        Usuario u=null;
        
        //o for ve se existe um usuario com um login igual
        for(int i=0;i<usuarios.size();i++){
            
            u=usuarios.get(i);
            if(login.equals(u.getLogin())){
                break;
            }else{
                u=null;
            }
        }
        
        if(u==null){
            System.out.println("Esse usuario não existe");
        }else{
           u.boasvindas();  
        }
       
        
        if(u instanceof UsuarioRoot ){
           uRoot.descricaoRoot();
           uRoot.excluirTodos();
           uRoot.despedidaRoot();
        }
        
        if(u instanceof UsuarioRegular ){
           uRegular.dashboard();
           uRegular.descricaoRegular();
           uRegular.despedidaRegular();
        }
        
        if(u instanceof UsuarioGuest){
            uGuest.descricaoGuest();
            uGuest.despedidaGuest();
        }
        
        if(u instanceof UsuarioGroup){
            uGroup.descricaoGroup();
            uGroup.despedidaGroup();
        }
    
    }    
}
