
package exl2_2.pkg1;

public class Candidato {
    
   private String nome;
   private PartidoPolitico partidoPolitico;

    public Candidato(String nome, PartidoPolitico partidoPolitico) {
        this.nome = nome;
        this.partidoPolitico = partidoPolitico;
    }
    
    public void apresentaCandidato(){
        System.out.println(this.nome + "\n" +this.partidoPolitico.getNome() +"\n"
                + this.partidoPolitico.getSigla() +"\n"+this.partidoPolitico.getIdeologia()+"\n");    
    }
    public String getNome() {
        return nome;
    }

    public PartidoPolitico getPartidoPolitico() {
        return partidoPolitico;
    }

    
}
