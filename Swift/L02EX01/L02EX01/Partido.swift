//  Partido.swift L02EX01
/*  Exercício 1.1. Todo partido político é composto por um nome, uma ideologia, uma sigla e um número. Um candidato é composto por nome e um partido. Um candidato pode mudar de partido (neste caso se qual- quer regra), e suas informações deverão sempre ser mostradas na tela junto com as informações do partido. Todo candidato deverá sempre ter um partido (caso Brasileiro). Implemente todas as classes envolvidas nessa situação, lembre-se de usar construtores e metodos get, se ne- cessário. Implemente também alguns testes. É proíbido usar conceitos que ainda não foram abordados. */

import Foundation

public class Partido{
    
    private var nome: String = ""
    private var ideologia: String = ""
    private var sigla: Sigla
    private var numero: Int = 0
    
    init(nome: String, ideologia: String, sigla: Sigla, numero: Int) {
        self.nome = nome
        self.ideologia = ideologia
        self.sigla = sigla
        self.numero = numero
    }
    
    func mostraPartido (){
        print(" Dados do Partido")
        print(" Nome: \(nome)\n Ideologia: \(ideologia)")
        print(" Sigla: \(sigla)\n Número: \(numero)\n")
    }
    
}
