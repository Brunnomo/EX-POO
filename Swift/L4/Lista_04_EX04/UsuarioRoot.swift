import Foundation
 
 public class UsuarioRoot : Usuario{
 
	override func descricao(){
		print("O usuario Root tem todas as permissões")
	}
	
	func excluirTodos(){
		print("O usuario Root pode excluir qualquer usuario")
	}
	
	func despedidaRoot( ) {
		print("Até logo \(login)!")
	}
	
}