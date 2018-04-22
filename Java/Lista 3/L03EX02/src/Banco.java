
import java.util.ArrayList;

public class Banco {
	
	private String nome_banco;
	private ArrayList<Premium> premium;
	private ArrayList<Vip> vip;
	private ArrayList<Regular> regular;
	
	
    
	public Banco(String nome_banco) {
		this.nome_banco = nome_banco;
		this.premium = new ArrayList<Premium>();
		this.vip = new ArrayList<Vip>();
		this.regular = new ArrayList<Regular>();
	}
	
			
	public String getNomeBanco() {
		return nome_banco;
	}

	public void novoPremium(Premium novo) {
	    if(novo != null) {
    	premium.add(novo);
	    }
   }
	
	public void novoVip(Vip novo) {
	    if(novo != null) {
    	vip.add(novo);
	    }
   }
	
	public void novoRegular(Regular novo) {
	    if(novo != null) {
    	regular.add(novo);
	    }
   }
	
	
    public void lucroDoBanco() {
    	double lucros = 0.0;
    	
    	for(Premium taxa: premium) {
    		lucros += taxa.getTarPremium();
    	}
    	
    	for(Vip taxa: vip) {
    		lucros += taxa.getTarVip();
    	}
    	
    	for(Regular taxa: regular) {
    		lucros += taxa.getTarRegular();
    	}
    	
    	System.out.println("O Lucro Total do " + this.getNomeBanco() + ": R$ " + lucros);
    }
	
	
    
    public void mostraClientes() {
    	 
    	if(premium.isEmpty()) {
    		System.out.println("Não há Clientes Premium");   	

    		
    	}else {
     	      	      
              for(int i = 0; i < premium.size(); i++){
                  Premium cp;
                  cp = premium.get(i);
                  cp.mostraPremium();
                  System.out.println("");
              }
       	      
    	 }//FIM PREMIUM
    	
    	
    	if(vip.size() > 0) {
    		
    	   for(Vip cv: vip) {
    		   cv.mostraVip();
    		   System.out.println("");
    	   }
	    }else {
		System.out.println("Não há Clientes Vip.");
		}//FIM VIP
    	
    	
    	
    	if(regular.size() > 0) {
    		
    	    for(Regular cr: regular) {
    		    cr.mostraRegular();
    		    System.out.println("");
    	    }
    	}else {
    		System.out.println("Não há Clientes Regulares.");
    	}//FIM REGULAR
    	
     }//fim mostrar cliente


}
