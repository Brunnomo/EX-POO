
package exl2_2.pkg1;

public class ExL2_21 {

    public static void main(String[] args) {
        PartidoPolitico PT = new PartidoPolitico("Partido dos trabalhadores","Socialista","PT",13);
        PartidoPolitico PSDB = new PartidoPolitico("Partido da Social Democracia Brasileira","Social-Democracia","PSDB",45);
        
        Candidato c1 = new Candidato("Lula",PT);
        Candidato c2 = new Candidato("Alexsandro",PSDB);
        
        c1.apresentaCandidato();
        c2.apresentaCandidato();
        
    }
    
}
