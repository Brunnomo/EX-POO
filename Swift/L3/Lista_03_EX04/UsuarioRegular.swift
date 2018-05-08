import Foundation
 
 public class UsuarioRegular : Usuario{
 
	func descricaoRegular(){
		print("O usuario regular pode ler arquivos e auterar arquivos. ")
	}
	
	func dashBoard(){
		print("Area de usuário cadastrado")
	}
	
	func despedidaRegular( ) {
		print("Até logo \(login)!")
	}
	
}