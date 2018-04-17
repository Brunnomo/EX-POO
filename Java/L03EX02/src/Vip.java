
public class Vip extends Conta {
	
	public Vip(String nome, String nun_conta, Double saldo) {
		super(nome, nun_conta, saldo);
	
	}
	
	public Double getTarVip() {
		return (this.getSaldo() * 0.04);
	}
	
    public void mostraTarVip() {
    	System.out.println("Tarifa: R$ " + this.getTarVip());
    }
    
    
    public void mostraVip() {
    	System.out.println("Numero da Conta....: " + this.getNun_conta());
    	System.out.println("Nome...............: " + this.getNome());
    	System.out.println("Saldo..............: R$ " + this.getSaldo());
    	System.out.println("Tarifa VIP (4%)....: R$ " + this.getTarVip());
     	
    }

}

