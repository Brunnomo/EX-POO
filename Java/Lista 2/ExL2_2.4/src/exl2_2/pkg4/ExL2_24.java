
package exl2_2.pkg4;

public class ExL2_24 {

    public static void main(String[] args) {
        
        Loja livraria = new Loja(5,5,5);
        livraria.exibirInfoProd();
        
        livraria.venderEpub();
        livraria.venderEpub();      
        livraria.venderFisico();
        System.out.println("");
        
        livraria.exibirInfoProd();
        
    }
    
}
