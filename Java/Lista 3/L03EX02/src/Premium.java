
public class Premium extends Conta{

	public Premium(String nome, String nun_conta, Double saldo) {
		super(nome, nun_conta, saldo);
	}
	
	
	public Double getTarPremium() {
		return (this.getSaldo() * 0.02);
	}
	
    public void mostraTarPremium() {
    	System.out.println("Tarifa: R$ " + this.getTarPremium());
    }
    
    
    public void mostraPremium() {
    	System.out.println("Numero da Conta........: " + this.getNun_conta());
    	System.out.println("Nome...................: " + this.getNome());
    	System.out.println("Saldo..................: R$ " + this.getSaldo());
    	System.out.println("Tarifa Premium (2%)....: R$ " + this.getTarPremium());
    }
	
}
