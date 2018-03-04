//
//  Churrasco.swift
//  EXE1.1
//
//  Created by Naldinho0707 on 04/03/18.
//  Copyright © 2018 Orientação a Objeto. All rights reserved.
//

import Foundation

class Churrasco {
    
    var qtdCarne: Int = 0
    
    init(qtdCarne: Int) {
        self.qtdCarne = qtdCarne
    }
    
    
    func verificarConsumo(pessoa: Pessoa) {
        
        if(pessoa.idade <= 3 || pessoa.vegetariana == true){
           self.qtdCarne = 0
            print(" \(pessoa.nome) não consome carne")
        }else if(pessoa.idade > 3 && pessoa.idade <= 12){
            self.qtdCarne = 1
            print(" \(pessoa.nome) ira consumir \(qtdCarne) kg de carne")
        }else{
            self.qtdCarne = 2
            print(" \(pessoa.nome) ira consumir \(qtdCarne) kg de carne")
        }
            
    }
    
}
