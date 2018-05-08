//  main.swift  L02EX01
/*  Exercício 1.1. Todo partido político é composto por um nome, uma ideologia, uma sigla e um número. Um candidato é composto por nome e um partido. Um candidato pode mudar de partido (neste caso se qual- quer regra), e suas informações deverão sempre ser mostradas na tela junto com as informações do partido. Todo candidato deverá sempre ter um partido (caso Brasileiro). Implemente todas as classes envolvidas nessa situação, lembre-se de usar construtores e metodos get, se ne- cessário. Implemente também alguns testes. É proíbido usar conceitos que ainda não foram abordados.  */

import Foundation


let partido1 = Partido (nome: "Partido dos Trabalhadores", ideologia: "Esquerda", sigla: Sigla.PT, numero: 13)
let partido2 = Partido (nome: "PARTIDO DO MOVIMENTO DEMOCRÁTICO BRASILEIRO", ideologia: "Centro", sigla: Sigla.PMDB, numero: 15)
let partido3 = Partido (nome: "PARTIDO DA SOCIAL DEMOCRACIA BRASILEIRA", ideologia: "Centro Esquerda", sigla: Sigla.PSDB, numero: 45)


var politico1 = Politico(nome: "Lula", brasileiro: true, partido: partido1)
politico1.mostraPolitico()
politico1.setPartido(partido: partido2)
politico1.mostraPolitico()

var politico2 = Politico(nome: "Kim Jong-un", brasileiro: false, partido: partido3)
politico2.mostraPolitico()
politico2.setPartido(partido: partido2)
politico2.mostraPolitico()

var politico3 = Politico(nome: "Geraldo Alckmin", brasileiro: true, partido: partido3)
politico3.mostraPolitico()
