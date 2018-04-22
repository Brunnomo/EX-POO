
/*
 * Exercício 1.3. Uma Estrela é composta por nome, temperatura e cor.
 * Uma Constelação possui um nome e tem várias Estrelas. Toda Estrela
 * possui um método mostrar() que mostra na tela todas as informações
 * sobre ela. Neste sistema, é possível incluir estrelas em uma constelação
 * usando o método void adicionar(Estrela e), mostrar as informações
 * de todas as estrelas com o método void infoEstrelas() e exibir
 * a temperatura total somando-se todas as estrelas da constelação usando
 * o método double tempConstelacao(). Implemente as classes descritas.
 *
 * @author BRUNNOMELODEOLIVEIRA
 */

import java.util.ArrayList;

public class Constelacao {
    private String nome;
    private ArrayList<Estrela> estrelas = new ArrayList();
    
    public Constelacao(String nome) {
        this.nome = nome;
    }

    public void addEstrela(Estrela e){
        this.estrelas.add(e);
    } 
    
    public Double tempConstelacao(){
       Double temp = 0.0;
       Estrela e1;
        for(int i=0;i<this.estrelas.size();i++) {
             e1 = this.estrelas.get(i);
             temp = (e1.getTemperatura()) + temp;
        }  
       return temp; 
    }
    public void infoEstrelas(){
        Estrela e1;
        for(int i=0;i<this.estrelas.size();i++){
            e1 = this.estrelas.get(i);
            System.out.println("ESTRELA :" + (i+1));
            e1.mostar();
            System.out.println("");
        }
    }
}
