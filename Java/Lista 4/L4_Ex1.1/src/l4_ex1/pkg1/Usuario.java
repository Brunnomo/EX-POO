
package l4_ex1.pkg1;

import java.util.Scanner;

public class Usuario {
    private String login;

    public Usuario(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
    
    public int menu(){
        int opcao = 0;
        Scanner ler = new Scanner( System.in );
        System.out.println("Menu");
        return opcao;
    }
    
    public void boasvindas(){
        System.out.println("Bem-vindo " + this.login );
    }
}
    
