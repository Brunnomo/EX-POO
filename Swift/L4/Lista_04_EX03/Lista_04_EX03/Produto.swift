//  Produto.swift
//  Lista_04_EX03

import Foundation

public class Produto {
    
    private var nome: String
    private var preco: Double
    private var imposto: ImpostoEnum
    

    init(nome: String, preco: Double, imposto: ImpostoEnum) {
        self.nome    = nome
        self.preco   = preco
        self.imposto = imposto
    }
    
    public func mostraProduto() {
    print("*********************************")
    print("Nome do Produto....: \(self.nome)")
    print("Tipo do Imposto....: \(self.imposto)")
    print("Preço sem Imposto..: R$ \(self.preco)")
    print("Alíquota do Imposto: \( (self.imposto.rawValue - 1)*100) %")
    print("Preço com Imposto..: R$ \( (( self.imposto.rawValue * self.preco * 100).rounded())/100)" )
    print("*********************************\n")
    }//fim func mostra produto
    
}//fim class produto

