// Premium.swift - L03EX02

import Foundation

public class Premium: Conta{
    
  
    public func getTarPremium() -> Double{
      return (self.getSaldo() * 0.02)
    }
  
    public func printTarPremium(){
        print("A tarifa Premuim (2%) do(a) \(self.getNome()): R$ \(self.getTarPremium())\n")
    }
    
    public func mostraClientePremium(){
         print("Conta Número: \(self.getNumConta())")
         print("Nome Cliente: \(self.getNome())")
         print("saldo: R$ \(self.getSaldo())")
         print("A tarifa Premuim (2%): R$ \(self.getTarPremium())\n")
    }
    
}



		
