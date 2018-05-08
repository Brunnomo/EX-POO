/* Exercício 1.2. Sabe-se que VIP, Premium e Regular são tipos de Cliente.
Em cada cliente, há a necessidade de controle de conta corrente.
Em uma conta, há dados como nome, e saldo.
Para cada tipo de conta uma tarifa deve ser calculada:
1% do saldo para Regular, 2% para Premium e 4% para VIP.
Use Herança. Aqui,  proíbido usar conceitos que não foram vistos em aula.
Cliente.swift - L03EX02 */


import Foundation

public class Cliente {
    
    private var nome: String = ""
    
    
    init(nome: String) {
        self.nome = nome
    }
    
    
    public func getNome() -> String{
    return self.nome
    }
    
}
