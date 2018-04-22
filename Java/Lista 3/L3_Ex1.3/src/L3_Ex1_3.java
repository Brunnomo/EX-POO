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
public class L3_Ex1_3 {

    public static void main(String[] args) {
        Estrela e1= new Estrela("Alpha",2000.0,"Amarela");
        Estrela e2= new Estrela("Beta",3000.0,"Azul");
        Estrela e3= new Estrela("Delta",4000.0,"Branca");
        Estrela e4= new Estrela("Upsilon",5000.0,"Amarela");
        Estrela e5= new Estrela("Lota",2000.0,"Azul");
        Estrela e6= new Estrela("Mu",2200.0,"Branca");
        
        Constelacao Andromeda = new Constelacao("Andromeda");
        Andromeda.addEstrela(e1);
        Andromeda.addEstrela(e2);
        Andromeda.addEstrela(e3);
        Andromeda.addEstrela(e6);
        Andromeda.addEstrela(e5);
        Andromeda.addEstrela(e6);
        Andromeda.infoEstrelas();
        System.out.println("TEMPERATURA TOTAL DA CONSTELAÇÂO :" + Andromeda.tempConstelacao() + "C");
    }           
}
