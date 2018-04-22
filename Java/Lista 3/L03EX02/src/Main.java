
/* Exercício 1.2.
*Sabe-se que VIP, Premium e Regular são tipos de Cliente.
*Em cada cliente, há a necessidade de controle de conta corrente.
*Em uma conta, há dados como nome, e saldo.
*Para cada tipo de conta uma tarifa deve ser calculada:
*1% do saldo para Regular, 2% para Premium e 4% para VIP.
*Use Herança. Aqui,  proíbido usar conceitos que não foram vistos em aula.
* Nome: Reginaldo Luiz Formoso Junior - ADS - Noite 4° Ciclo - 2018.
*/

public class Main {

	public static void main(String[] args) {
		
				
		Banco b1 = new Banco("NuBank");
		
		Tela1 t1 = new Tela1("BancoNacionais");
		
		t1.novoBanco(b1);
		
		t1.menu();
		
		
		/*
		Regular c1 = new Regular("Paulo", "001", 200.0);
		c1.deposito(300.0);
		*/
	

	}

}
