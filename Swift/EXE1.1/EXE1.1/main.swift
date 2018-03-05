//
//  main.swift
//  EXE1.1
//
//  Created by Naldinho0707 on 04/03/18.
//  Copyright © 2018 Orientação a Objeto. All rights reserved.
//

import Foundation

print("Hello, World! \n\n")



//Inicializaçãp dos objetos
var pessoas1 =  Pessoa (nome: "Pedro", sexo: "M", idade: 20, vegetariana: false)
var pessoas2 =  Pessoa (nome: "Joao", sexo: "M", idade: 8, vegetariana: false)
var pessoas3 =  Pessoa (nome: "Maria", sexo: "F", idade: 25, vegetariana: true)
var pessoas4 =  Pessoa (nome: "Ana", sexo: "F", idade: 18, vegetariana: false)
var consulta =  Churrasco (qtdCarne: 0)

consulta.verificarConsumo(pessoa: pessoas1)
consulta.verificarConsumo(pessoa: pessoas2)
consulta.verificarConsumo(pessoa: pessoas3)
consulta.verificarConsumo(pessoa: pessoas4)

print("\n\n")
