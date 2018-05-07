import Foundation
 
 public class UsuarioGroup : Usuario{
 
	func descricaoGroup(){
		print("O usuario Group, pode add e remover usuarios de grupos. ")
	}
	
	func groupBoard(){
		print("Esse usuario Group poderá apagar usuários de seu grupo. ")
	}
	
	func despedidaGroup( ) {
		print("Até logo \(login)!")
	}
	
}