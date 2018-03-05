//
//  main.swift
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
 eternamente em off) e esta depende da lâmpada. Implemente esta si- tuação e seu teste.
*/


import Foundation

var lampada1 = Lampada(codigo: 1, estado: false, numeroClick: 0, vidaLampada: 4)
var lampada2 = Lampada(codigo: 2, estado: true, numeroClick: 1, vidaLampada: 6)

lampada1.interruptor(lampada: lampada1)
lampada1.getNumeroClick()
lampada1.interruptor(lampada: lampada1)
lampada1.getNumeroClick()
lampada1.interruptor(lampada: lampada1)
lampada1.getNumeroClick()
lampada1.interruptor(lampada: lampada1)
lampada1.getNumeroClick()
lampada1.getStatusLampada()
lampada1.interruptor(lampada: lampada1)
lampada1.getNumeroClick()
lampada1.getStatusLampada()

print("\n\n")

lampada2.interruptor(lampada: lampada2)
lampada2.getNumeroClick()
lampada2.interruptor(lampada: lampada2)
lampada2.getNumeroClick()
lampada2.interruptor(lampada: lampada2)
lampada2.getNumeroClick()
lampada2.interruptor(lampada: lampada2)
lampada2.getNumeroClick()
lampada2.getStatusLampada()
lampada2.interruptor(lampada: lampada2)
lampada2.getNumeroClick()
lampada2.getStatusLampada()
lampada2.interruptor(lampada: lampada2)
lampada2.getNumeroClick()
lampada2.getStatusLampada()
lampada2.interruptor(lampada: lampada2)
lampada2.getNumeroClick()
lampada2.getStatusLampada()
