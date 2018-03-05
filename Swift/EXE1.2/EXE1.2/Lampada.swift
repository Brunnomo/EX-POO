//
//  Lampada.swift
//  EXE1.2
//
//  Created by Naldinho0707 on 04/03/18.
//  Copyright © 2018 Orientação a Objeto. All rights reserved.
//

/*
 Exercício 1.2. Implemente uma classe Lâmpada. Toda lâmpada possui um estado (on/off).
 Sabe-se que as lâmpadas podem ter seu estado trocado (click do interruptor).
 Será necessário também uma funcionali- dade para checar o estado atual da lâmpada.
 Uma lâmpada estraga após uma quantidade de clicks (o click não troca mais o estado deixando-a
 eternamente em off) e esta depende da lâmpada. Implemente esta situação e seu teste.
 */


import Foundation

class Lampada {
    
    var codigo: Int = 0
    var estado: Bool = true
    var numeroClick: Int = 0
    var vidaLampada: Int = 0
    
    init(codigo: Int, estado: Bool, numeroClick: Int, vidaLampada: Int) {
        self.codigo = codigo
        self.estado = estado
        self.numeroClick = numeroClick
        self.vidaLampada = vidaLampada
    }
    
    
    func getNumeroClick(){
        print("O número de click's atual da lampada \(self.codigo) é \(self.numeroClick)")
    }
    
    
    func getStatusLampada(){
        
        if(self.numeroClick == self.vidaLampada){
          print("No momento a lampada \(self.codigo) queimou ops!")
        }else if(self.numeroClick > self.vidaLampada){
          print("No momento a lampada \(self.codigo) continua queimada")
        }else if (self.numeroClick < self.vidaLampada && self.estado == false){
           print("No momento a lampada \(self.codigo) está apagada")
        }else{
           print("No momento a lampada \(self.codigo) está acesa")
        }
        
    }
    
    func interruptor (lampada: Lampada) {
       
        
        self.numeroClick += 1
        
        
        if (lampada.numeroClick == lampada.vidaLampada){
            self.estado = false
            print("Click!, A Lâmpada \(self.codigo) queimou, pois ela atingiu o máximo de click's que é \(lampada.vidaLampada)")
        }else if (lampada.numeroClick > lampada.vidaLampada){
            print("Click!, A Lâmpada \(self.codigo) continua queimada pois ainda não foi trocada")
        }else if(lampada.estado == false && lampada.numeroClick < lampada.vidaLampada){
            self.estado = true
            print("Click!, A lampada \(self.codigo) foi apagada")
        }else{
            self.estado = true
            print("Click!, A lampada \(self.codigo) foi acesa")
        }
    }
  
}


