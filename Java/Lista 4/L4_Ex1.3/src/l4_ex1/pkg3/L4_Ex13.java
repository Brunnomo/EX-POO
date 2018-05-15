/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4_ex1.pkg3;

public class L4_Ex13 {

    public static void main(String[] args) {
        
        Produto p1 = new Produto("Celular",2500.00,ImpostoEnum.IPI);
        Produto p2 = new Produto("TV",3500.00,ImpostoEnum.ICMS);
        
        p1.mostraProduto();
        p2.mostraProduto();
    }
    
}
