//main.swift  L02EX02

/* Exercício 1.2. Implemente a classe Cliente que possua os atributos nome, saldo e limite. Esta deve conter os métodos sacar(double val), depositar(double val), e gets para nome, saldo e limite. Sabe-se que só é possível sacar se o saldo+limite forem superiores a quan- tia. O método checar saldo deve retornar o valor saldo mais o limite limite. Implemente, também, uma classe Doc que possui o método transferir(Cliente c1, Cliente c2, double quantia) que saca uma quantia de c1, se este tiver saldo, e deposita na conta de c2. Implemente também alguns testes. É proíbido usar conceitos que ainda não foram abordados. */

import Foundation

var cliente1 = Cliente(nome: "Paulo", saldo: 500, limite: 200)
var cliente2 = Cliente(nome: "Maria", saldo: 1000, limite: 300)


cliente1.sacar(saque: 550)
cliente1.checarSaldo()
cliente1.deposito(deposito: 400)
cliente1.checarSaldo()

var doc1 = Doc()
doc1.transferir(cliente1: cliente1, cliente2: cliente2, doc: 100)

cliente1.checarSaldo()
cliente2.checarSaldo()

var doc2 = Doc()
doc2.transferir(cliente1: cliente2, cliente2: cliente1, doc: 2000)
