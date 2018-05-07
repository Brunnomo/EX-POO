import Foundation
 
 public class UsuarioRegular : Usuario{
 
	override func descricaoRegular(){
		print("O usuario regular pode ler arquivos e auterar arquivos. ")
		print("Area de usuário cadastrado")
	}
	
	func despedidaRegular( ) {
		print("Até logo \(login)!")
	}
	
}