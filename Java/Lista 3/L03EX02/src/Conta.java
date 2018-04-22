
public class Conta extends Cliente {

	private String nun_conta;
	private Double saldo;
	

	public Conta(String nome, String nun_conta, Double saldo) {
		super(nome);
		this.nun_conta = nun_conta;
		this.saldo = saldo;
	}

	public String getNun_conta() {
		return nun_conta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void deposito(Double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Novo Saldo: R$ " + this.saldo);
	}
	
	public void saque(Double valor) {
		this.saldo = this.saldo - valor;
		System.out.println("Novo Saldo: R$ " + this.saldo);
	}
	
}
