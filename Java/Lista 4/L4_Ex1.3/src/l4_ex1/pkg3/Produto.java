
package l4_ex1.pkg3;

public class Produto {
    private String nome;
    private Double preço;
    private ImpostoEnum imposto;

    public Produto(String nome, Double preço, ImpostoEnum imposto) {
        this.nome = nome;
        this.preço = preço;
        this.imposto = imposto;
    }
    
    public Double precoImpsoto(){
        return this.preço + (this.preço/100)*imposto.getValor();
    }
    public Double valorImposto(){
        return (this.preço/100)*imposto.getValor();
    }
    
    public void mostraProduto(){
        System.out.println("--------------------");
        System.out.println("Nome:  " + this.nome);
        System.out.println("Preço: R$" + this.preço);
        System.out.println( this.imposto.getNome() + ":   %" + imposto.getValor()+" (" +this.valorImposto()+ ")");
        System.out.println("Total: R$" + this.precoImpsoto());
        System.out.println("--------------------");
    }
 
}