
public class Regular extends Conta {

	public Regular(String nome, String nun_conta, Double saldo) {
		super(nome, nun_conta, saldo);
	}
	
	
	public Double getTarRegular() {
		return (this.getSaldo() * 0.01);
	}
	
    public void mostraTarRegular() {
    	System.out.println("Tarifa: R$ " + this.getTarRegular());
    }
    
    
    public void mostraRegular() {
    	System.out.println("Numero da Conta........: " + this.getNun_conta());
    	System.out.println("Nome...................: " + this.getNome());
    	System.out.println("Saldo..................: R$ " + this.getSaldo());
    	System.out.println("Tarifa Regular (1%)....: R$ " + this.getTarRegular());
     	
    }

	
}
