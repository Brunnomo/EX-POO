
package pooex1;

public class PooEx1 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.setIdade(20);
        p1.setNome("Carlos");
        p1.setSexo("Masculino");
        p1.setVegetariana(false);
        
        Pessoa p2 = new Pessoa();
        p2.setIdade(18);
        p2.setNome("Ana");
        p2.setSexo("Feminino");
        p2.setVegetariana(false);
        
        Pessoa p3 = new Pessoa();
        p3.setIdade(22);
        p3.setNome("Thiago");
        p3.setSexo("Masculino");
        p3.setVegetariana(true);
        
        Pessoa p4 = new Pessoa();
        p4.setIdade(2);
        p4.setNome("José");
        p4.setSexo("Masculino");
        p4.setVegetariana(false);
        
        Churrasco c1 = new Churrasco();
        
        c1.verificarConsumo(p1);
        c1.verificarConsumo(p2);
        c1.verificarConsumo(p3);
        c1.verificarConsumo(p4);
        
        c1.informaQtd();
    }
    
}
