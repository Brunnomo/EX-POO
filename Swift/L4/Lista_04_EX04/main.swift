import Foundation

var opc: Int = 1

var usuRegular = UsuarioRegular("Carlos")
var usuRoot = UsuarioRoot("Paulo")
var usuGuest = UsuarioGuest("Guest")
var usuGroup = UsuarioGroup("Group")


print("Entre com a opção: < 1 >")
print("<1> Para mostra Usuario Regular")
print("<2> Para mostra Usuario Root")
print("<3> Para mostra Usuario Guest")
print("<4> Para mostra Usuario Group")


switch opc {
    
case 1:
    usuRegular.descricao()
	usuRegular.despedidaRegular()
case 2:
    usuRoot.descricao()
	usuRoot.despedidaRoot()
case 3:
    usuGuest.descricao()
	usuGuest.despedidaGuest()
case 4:
    usuGroup.descricao()
	usuGroup.despedidaGroup()
default:
    print("Opção Inválida.")
}
