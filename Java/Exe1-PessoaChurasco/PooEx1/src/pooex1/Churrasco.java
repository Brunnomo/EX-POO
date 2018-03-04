
package pooex1;

public class Churrasco {
    
    
    private int qtdCarne;

    public int getQtdCarne() {
        return qtdCarne;
    }
    
    public void setQtdCarne(int qtd_Carne) {
        this.qtdCarne = qtd_Carne;
    }
    public void verificarConsumo(Pessoa pessoa){
        if(true == pessoa.isVegetariana() || pessoa.getIdade()<=3){
           System.out.print("Não consome\n");
        }else if(pessoa.getIdade()<=12||pessoa.getIdade()<=4){
           System.out.print("Consome 1 KILO\n");
           this.setQtdCarne(qtdCarne+1);
        }else{
           System.out.print("Consome 2 KILO\n");
           this.setQtdCarne(qtdCarne+2);
        }
    }      
    public void informaQtd(){
        System.out.printf("voce vai precisar de %d Kilos para o Churras",this.getQtdCarne());
                
    }
    
}
