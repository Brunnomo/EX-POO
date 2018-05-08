import Foundation
 
 public class Constelacao{
 
	private var nommeConstelacao : String = ""
    var estrela : Array<Estrela> = Array()
	
	
     
    init(nomeConstelacao : String) {
        self.nomeConstelacao = nomeConstelacao
    }
  
	func mostrar( ) {
		print("Nome: \(nomeEstrela)")
		print("Temperatura: \(temperatura)")
		print("Cor: \(cor)")
	}
	
	public func getTemperatura() -> Double{
      return temperatura
    }
	
}