//
//  Pessoa.swift
//  EXE1.1
//
//  Created by Naldinho0707 on 04/03/18.
//  Copyright © 2018 Orientação a Objeto. All rights reserved.
//

import Foundation

class Pessoa {
    
    var nome: String = ""
    var sexo: String = ""
    var idade: Int = 0
    var vegetariana: Bool = true
    
    init(nome: String, sexo: String, idade: Int, vegetariana: Bool) {
        self.nome = nome
        self.sexo = sexo
        self.idade = idade
        self.vegetariana = vegetariana
    }
        
}
