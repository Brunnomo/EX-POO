//  Politico.swift  L02EX01
/*  Exercício 1.1. Todo partido político é composto por um nome, uma ideologia, uma sigla e um número. Um candidato é composto por nome e um partido. Um candidato pode mudar de partido (neste caso se qual- quer regra), e suas informações deverão sempre ser mostradas na tela junto com as informações do partido. Todo candidato deverá sempre ter um partido (caso Brasileiro). Implemente todas as classes envolvidas nessa situação, lembre-se de usar construtores e metodos get, se ne- cessário. Implemente também alguns testes. É proíbido usar conceitos que ainda não foram abordados. */

import Foundation

public class Politico{
    private var nome: String = ""
    private var brasileiro: Bool = true
    private var partido: Partido
    
    
    init(nome: String, brasileiro: Bool, partido: Partido) {
        self.nome = nome
        self.brasileiro = brasileiro
        self.partido = partido
    }
    
    
    func mostraPolitico() {
        print(nome)

        if(brasileiro == true){
           partido.mostraPartido()
        }else{
           print(" O(A) \(nome) não pode se filiar a um partido, ")
           print(" pois sua nacionalidade não é Brasileira.\n")
        }
    }
    
    
    func setPartido(partido: Partido){
        self.partido = partido
    }
     
    
}
