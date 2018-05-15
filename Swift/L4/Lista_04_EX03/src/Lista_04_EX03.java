
public class Lista_04_EX03 {

	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Laranja", 2.5, ImpostoEnum.ICMS);
		Produto p2 = new Produto("Abacate", 4.25, ImpostoEnum.IPI);
		
	    p1.mostraProduto();
	    p2.mostraProduto();
		
	}

}
