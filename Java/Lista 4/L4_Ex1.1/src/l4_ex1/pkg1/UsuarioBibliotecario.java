
package l4_ex1.pkg1;

import java.util.Scanner;


public class UsuarioBibliotecario extends Usuario {
    
    public UsuarioBibliotecario(String login) {
        super(login);
    }
    
    @Override
    public int menu(){
        int opcao = 0;
        Scanner ler = new Scanner( System.in );
        System.out.println("----------MENU---------");
        System.out.println("(1)listarAutores");
        System.out.println("(2)contarCiencia");
        System.out.println("(3)listarFilosofia");
        System.out.println("(4)listarTudo");
        System.out.println("(5)inserirLivro");
        
        System.out.println("");
        System.out.printf("Digite uma opcao:");
        opcao=ler.nextInt();
        
        if(opcao<1 || opcao>5){
            opcao=0;
        }        
        return opcao;
    }
    
}
