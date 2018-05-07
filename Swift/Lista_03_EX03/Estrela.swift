import Foundation
 
 public class Estrela{
 
    private var nommeEstrela : String = ""
	private var cor : String = " "
	private var temperatura : Double
	
     
    init(nomeEstrela : String, cor : String, temperatura : Double ) {
        self.nomeEstrela = nomeEstrela
		self.cor = cor
		self.temperatura = temperatura
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