
package l4_ex1.pkg4;

import java.util.ArrayList;
import java.util.Scanner;


public class L4_Ex14 {

    public static void main(String[] args) throws l4_ex1.pkg4.UserNotFoundException {
        
       /* Sobescrevi o metodo descrição de todas as classes 
        * add a Excecão UserNotFound
        * usei Try Catch pra ver se o usuarui existe 
        */
        
        ArrayList<Usuario> usuarios = new ArrayList();
        Scanner ler = new Scanner( System.in );
        String login;
         
        UsuarioRoot uRoot = new UsuarioRoot("paulo"); //criei um usuario Root com Login de root
        UsuarioRegular uRegular = new UsuarioRegular("carlos"); //criei um usuario Regular com login regular
        UsuarioGuest uGuest = new UsuarioGuest("guest"); //criei um usuario Guest com login de guest
        UsuarioGroup uGroup = new UsuarioGroup("group"); //criei um usuario Group com login de group
        
        usuarios.add(uRoot);
        usuarios.add(uRegular);
        usuarios.add(uGuest);
        usuarios.add(uGroup);
        
        System.out.println("[---SISTEMA DE USUARIOS---]");
        System.out.println("[---- DIGITE SEU LOGIN ---]");
        System.out.printf("LOGIN: ");
        
        login=ler.next();
        Usuario u = null;
        
        try{
            for(int i=0;i<usuarios.size();i++){
                u = usuarios.get(i);
                if(login.equals(u.getLogin())){
                    u.boasvindas();  
                    break;
                }
            }
            if(u==null){
                throw new UserNotFoundException(); 
            }
        }catch(UserNotFoundException e){
            System.out.println("Usuario não encontrado"); 
        }
        
        if(u instanceof UsuarioRoot ){
           uRoot.descricao();
           uRoot.excluirTodos();
           uRoot.despedidaRoot();
        }else if(u instanceof UsuarioRegular ){
           uRegular.descricao();
           uRegular.despedidaRegular();
        }else if(u instanceof UsuarioGuest){
            uGuest.descricao();
            uGuest.despedidaGuest();
        }else if(u instanceof UsuarioGroup){
            uGroup.descricao();
            uGroup.despedidaGroup();
        }          
    }       
}
