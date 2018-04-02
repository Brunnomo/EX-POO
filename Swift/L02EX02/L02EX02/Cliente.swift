// Cliente.swift  L02EX02

/* Exercício 1.2. Implemente a classe Cliente que possua os atributos nome, saldo e limite. Esta deve conter os métodos sacar(double val), depositar(double val), e gets para nome, saldo e limite. Sabe-se que só é possível sacar se o saldo+limite forem superiores a quan- tia. O método checar saldo deve retornar o valor saldo mais o limite limite. Implemente, também, uma classe Doc que possui o método transferir(Cliente c1, Cliente c2, double quantia) que saca uma quantia de c1, se este tiver saldo, e deposita na conta de c2. Implemente também alguns testes. É proíbido usar conceitos que ainda não foram abordados. */

import Foundation

public class Cliente{
    
    private var nome: String
    private var saldo: Double
    private var limite: Double
    
    init(nome: String, saldo: Double, limite: Double) {
        self.nome = nome
        self.saldo = saldo
        self.limite = limite
    }
    
    
    public func sacar(saque: Double){
        
        if saque < saldo + limite{
           print("\(nome), o saque de R$ \(saque) foi realizado com sucesso\n")
           saldo -= saque
        }else{
           print("Saldo Insuficiente  saque não autorizado\n")
        }

    }//fim da funcão saque
    
    
    public func deposito(deposito: Double){
         saldo += max(0,deposito)
            
         if deposito > 0{
            print("\(nome), o deposito de R$ \(deposito) foi realizado com sucesso\n")
         }
   
    }//fim da funcão deposito
    
    
    
    public func getNome() -> String{
        return nome
    }
    
    public func getSaldo() -> Double{
        return saldo
    }
    
    public func getLimite() -> Double{
        return limite
    }
    
    
    public func checarSaldo(){
        print("Cliente: \(nome)")
        print("Saldo (R$): \(saldo)")
        print("Limite (R$): \(limite)")
        print("Saldo Total (R$): \(saldo + limite)\n")
    }
    
}
