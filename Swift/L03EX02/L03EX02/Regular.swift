// Regular.swift - L03EX02


import Foundation

public class Regular: Conta{
    
    
    public func getTarRegular() -> Double{
        return (self.getSaldo() * 0.01)
    }
    
    public func printTarRegular(){
        print("A tarifa Regular (1%) do(a) \(self.getNome()): R$ \(self.getTarRegular())\n")
    }
    
    public func mostraClienteRegular(){
        print("Conta Número: \(self.getNumConta())")
        print("Nome Cliente: \(self.getNome())")
        print("saldo: R$ \(self.getSaldo())")
        print("A tarifa Regular (2%): R$ \(self.getTarRegular())\n")
    }
    
}
