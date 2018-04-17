import java.util.ArrayList;
import java.util.Scanner;


public class Tela1 {

	private Scanner entra;
	private ArrayList<Banco> banco;
	private String nome;
	
	
	public Tela1(String nome){
		entra = new Scanner(System.in);
		this.nome = nome;
		this.banco = new ArrayList<Banco>();
	}
	
		
	public String getNome() {
		return nome;
	}


	public void menu() {
		
	   int opt  = 0;
	   	 
	   while(opt != 6) {
		 System.out.println("*************** BANCO " + this.banco.get(0).getNomeBanco() + " ***************");
		 System.out.println("1. ABRIR NOVA CONTA.");
		 System.out.println("2. MOSTRAR TARIFAS.");
		 System.out.println("3. MOSTRAR CLIENTES.");
		 System.out.println("4. MOSTRAR INDICES DOS BANCOS.");
		 System.out.println("5. MOSTRAR LUCRO DOS BANCOS.");
		 System.out.println("6. SAIR.");
		 System.out.println("Digite a opção: ");
		 opt = entra.nextInt();
		 System.out.println("\n");
		 
		   switch(opt){
		   
			   case 1: 
				   this.criarConta();
			       break;
			         
			   case 2:
				   this.mostraTarifas();
			       break;
			       
			   case 3:
				   this.mostraTodosClientes();				     
			       break;
			      
			   case 4:
				   this.mostrarBancos();				     
			       break;
			       
			   case 5:
				   this.mostraLucroTotal();				     
			       break;
			       
			   case 6: 
				   this.sair();
			       break;
			           
			   default:
				   this.erro();
				   
		 }//fim do switc case. 
	  }//fim do while opção.		
	}//fim da função menu.
	

	
	public void criarConta() {
		
		int opt2 = 0;
			
		   while(opt2 != 4) {
				 System.out.println("**** ESCOLHA O TIPO DE CONTA ****");
				 System.out.println("1. CONTA REGULAR.");
				 System.out.println("2. CONTA PREMIUM.");
				 System.out.println("3. CONTA VIP.");
				 System.out.println("4. VOLTAR AO MENU PRINCIPAL.");
				 System.out.println("5. SAIR.");
				 System.out.println("Digite a opção: ");
				 opt2 = entra.nextInt();
				 System.out.println("\n");
				 
				   switch(opt2){
				   
					   case 1: 
						   
						  	System.out.println("Nome do Cliente: ");
							String nome = entra.next();
							System.out.println("Numero da Conta: ");
							String numero = entra.next();
							System.out.println("Saldo Inicial: ");
							double saldo = entra.nextDouble();
							Regular c1 = new Regular(nome, numero, saldo);
							
												
							System.out.println("Entre Indice do Banco: ");
							int numero4 = entra.nextInt();
							
							if(numero4 > this.banco.size()-1) {
							  System.out.println("Indice inválido");
							  this.criarConta();
							}
							else{
								System.out.println("O Banco escolhido é: " + this.banco.get(numero4).getNomeBanco());
								this.banco.get(numero4).novoRegular(c1);
							}
							
							break;
					        
							
					   case 2: 
						   
						  	System.out.println("Nome do Cliente: ");
							String nome2 = entra.next();
							System.out.println("Numero da Conta: ");
							String numero2 = entra.next();
							System.out.println("Saldo Inicial: ");
							double saldo2 = entra.nextDouble();
							Premium c2 = new Premium(nome2, numero2, saldo2);
							
							
							System.out.println("Entre Indice do Banco: ");
							int numero5 = entra.nextInt();
							
							if(numero5 > this.banco.size()-1) {
							  System.out.println("Indice inválido");
							  this.criarConta();
							}
							else{
								System.out.println("O Banco escolhido é: " + this.banco.get(numero5).getNomeBanco());
								this.banco.get(numero5).novoPremium(c2);
							 }
							 break;
					           
				
					   case 3:
						  	System.out.println("Nome do Cliente: ");
							String nome3 = entra.next();
							System.out.println("Numero da Conta: ");
							String numero3 = entra.next();
							System.out.println("Saldo Inicial: ");
							double saldo3 = entra.nextDouble();
							Vip c3 = new Vip(nome3, numero3, saldo3);
							
							
							System.out.println("Entre Indice do Banco: ");
							int numero6 = entra.nextInt();
							
							if(numero6 > this.banco.size()-1) {
							  System.out.println("Indice inválido");
							  this.criarConta();
							}
							else{
								System.out.println("O Banco escolhido é: " + this.banco.get(numero6).getNomeBanco());
								this.banco.get(numero6).novoVip(c3);;
				
							 }	
					        break;

					         
					   case 4:
						   this.menu();
					       break;
					       					           
					   case 5:
						   this.sair();
			               break;
			                   
					   default:
						   this.erro();
						   
				    }//fim do switc case. 
			}//fim do while opção.		
	}//fim da função menu.
		
	
	
	public void mostraTarifas() {
		System.out.println("Tarifas:\n 1 - Cliente Regular: 1% sobre o saldo.");
		System.out.println(" 2 - Cliente Premium: 2% sobre o saldo.");
		System.out.println(" 3 - Cliente VIP....: 4% sobre o saldo.\n");	
	}
	
	public void mostrarBancos() {
		
		for(Banco i: banco) {
		int cont = 0;	
		System.out.println("Indice: " + cont + ", Bando: " + i.getNomeBanco());
		cont += 1;
		}
		
	}
	
	
	public void sair() {
		System.out.println("Fim do Programa");
		entra.close();
	}
	
	
	public void erro() {
		System.out.println("Opção Inválida");
	}
	
	
	public void novoBanco(Banco novo) {
	    if(novo != null) {
    	banco.add(novo);
	    }
   }
	
	public void mostraTodosClientes() {
		System.out.println("Indice do Banco: ");
		int numero = entra.nextInt();
		
		if(numero > this.banco.size()-1) {
		   System.out.println("Indice inválido ou Banco Sem Cliente");
		   this.menu();
		}
		else{
		  this.banco.get(numero).mostraClientes();
		  this.menu();
		}
		
	}
	
	public void mostraLucroTotal() {
		System.out.println("Indice do Banco: ");
		int numero = entra.nextInt();
		
		if(numero > this.banco.size()-1) {
		   System.out.println("Indice inválido!!");
		   this.menu();
		}
		else{
		  this.banco.get(numero).lucroDoBanco();
		  this.menu();
		}
		
	}

	
}//fim da classe tela1
