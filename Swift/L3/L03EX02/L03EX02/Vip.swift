// Vip.swift - L03EX02

import Foundation

public class Vip: Conta{
    
    
    public func getTarVip() -> Double{
        return (self.getSaldo() * 0.04)
    }
    
    public func printTarVip(){
        print("A tarifa VIP     (4%) do(a) \(self.getNome()): R$ \(self.getTarVip())\n")
    }
    
    
    public func mostraClienteVip(){
        print("Conta Número: \(self.getNumConta())")
        print("Nome Cliente: \(self.getNome())")
        print("saldo: R$ \(self.getSaldo())")
        print("A tarifa VIP (4%): R$ \(self.getTarVip())\n")
    }
    
}
