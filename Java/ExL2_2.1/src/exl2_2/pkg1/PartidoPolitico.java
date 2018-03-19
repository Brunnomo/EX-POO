
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdeologia() {
        return ideologia;
    }

    public void setIdeologia(String ideologia) {
        this.ideologia = ideologia;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
	
}
