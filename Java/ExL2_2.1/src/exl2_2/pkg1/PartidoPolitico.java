
package exl2_2.pkg1;

public class PartidoPolitico {
    
private String nome;
private String ideologia;
private String sigla;
private int numero;

    public PartidoPolitico(String nome, String ideologia, String sigla, int numero) {
        this.nome = nome;
        this.ideologia = ideologia;
        this.sigla = sigla;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getIdeologia() {
        return ideologia;
    }

    public String getSigla() {
        return sigla;
    }

    public int getNumero() {
        return numero;
    }
	
}
