import Foundation
 
 public class UsuarioGroup : Usuario{
 
 	override func descricao() {
        print("O usuario Group, pode add e remover usuarios de grupos")
		print("Esse usuario Group poderá apagar usuários de seu grupo")
    }
	
	func despedidaGroup( ) {
		print("Até logo \(login)!")
	}
	
}