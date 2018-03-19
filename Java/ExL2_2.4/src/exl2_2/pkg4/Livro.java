
package exl2_2.pkg4;

public class Livro {

    private String formato;
    private Double preço;

    public Livro(String formato, Double preço) {
        this.formato = formato;
        this.preço = preço;
    }
    
    public void exibirInfoLivro(){
        System.out.println("Livro \n  - Formato:" + this.getFormato() + "\n  - Perço:" + this.getPreço());
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }
    
    
}    