
/* Exercício 1.3. Um produto é composto por nome e preço.
 * Sabe-se que todo produto tem um imposto apenas.
 * IPI e ICMS são impostos possíveis
 * (um produto pode ter apenas um deles para facilitar).
 * IPI e ICMS possuem aliquotas de 5% e 10% (valores ﬁctícios) respectivamente.
 * Todo produto deve ter a funcionalidade de mostrar
 * o nome e o preço já descontado o imposto.
 * Use o máximo de orientação a objetos possível para codiﬁcar as classes.
 */

public class Produto {
	
	private String nome;
	private double preco;
	private ImpostoEnum imposto;
	
	
	public Produto(String nome, double preco, ImpostoEnum imposto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.imposto = imposto;
	}//fim construtor
	
	
	public void mostraProduto() {
	System.out.println("*********************************");
	System.out.println("Nome do Produto....: " + this.nome);
	System.out.println("Tipo do Imposto....: " + this.imposto);
	System.out.printf( "Preço Normal.......: R$ %.2f %n", this.preco);
	System.out.printf( "Alíquota do Imposto: %.2f", ( ( this.imposto.getImposto()-1.0 ) *100.0));
	System.out.println(" %");
	System.out.printf( "Preço com Imposto..: R$ %.2f %n", (this.preco * this.imposto.getImposto()));
	System.out.println("*********************************");
	}//fim metodo mostra produto
	
}
