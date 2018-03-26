// DOC.swift L02EX02
/* Exercício 1.2. Implemente a classe Cliente que possua os atributos nome, saldo e limite. Esta deve conter os métodos sacar(double val), depositar(double val), e gets para nome, saldo e limite. Sabe-se que só é possível sacar se o saldo+limite forem superiores a quan- tia. O método checar saldo deve retornar o valor saldo mais o limite limite. Implemente, também, uma classe Doc que possui o método transferir(Cliente c1, Cliente c2, double quantia) que saca uma quantia de c1, se este tiver saldo, e deposita na conta de c2. Implemente também alguns testes. É proíbido usar conceitos que ainda não foram abordados. */

import Foundation

public class Doc{
        
    public func transferir(cliente1: Cliente, cliente2: Cliente, doc: Double){
        
        if doc < cliente1.getSaldo() + cliente1.getLimite(){
            print("\(cliente1.getNome()), o Doc foi relaizado com sucesso, portanto:")
            cliente1.sacar(saque: doc)
            cliente2.Deposito(deposito: doc)
            
        }else{
            print("\(cliente1.getNome()), não foi possível realizar a transferencia...")
            print("seu saldo R$ \(cliente1.getSaldo()) não é suficiente")
        }
        
    }
    
}
