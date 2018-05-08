// Conta.swift - L03EX02


import Foundation


public class Conta: Cliente{
    
    private var num_conta: String = ""
    private var saldo: Double = 0.0
    
    init(nome: String, num_conta: String, saldo: Double) {
        super.init(nome: nome)
        self.num_conta = num_conta
        self.saldo = saldo
    }
    
    public func getNumConta() -> String{
        return self.num_conta
    }
    
    public func getSaldo() -> Double{
        return self.saldo
    }
    
    
    public func deposito(deposito: Double){
        self.saldo += deposito
        print("Saldo Atual: R$ \(self.getSaldo())")
        print("Deposito R$ \(deposito) efetuado com sucesso.")
        print("Saldo Atual: R$ \(self.getSaldo())\n")
    }//fim da func deposito
    
    
    public func saque(saque: Double){
        if saque <= getSaldo() {
            print("Saldo Atual: R$ \(self.getSaldo())")
            self.saldo -= saque
            print("Saque R$ \(saque) efetuado com sucesso.")
            print("Saldo Atual: R$ \(self.getSaldo())\n")
        } else{
            print("O Saque R$ \(saque), não pode ser realizado.")
            print("Saldo Insuficiente: R$ \(self.getSaldo())\n" )
          }
    }//fim da func saque
    
}
