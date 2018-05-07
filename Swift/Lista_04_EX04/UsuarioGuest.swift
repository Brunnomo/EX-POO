import Foundation
 
 public class UsuarioGuest : Usuario{
 
	override func descricaoGuest(){
		print("O usuario Guest so pode ler arquivos. ")
	}
	
	func despedidaGuest() {
		print("Até logo \(login)! ")
	}
	
}