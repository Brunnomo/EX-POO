//  main.swift
//  Lista_04_EX03
/* Exercício 1.3. Um produto é composto por nome e preço.
 * Sabe-se que todo produto tem um imposto apenas.
 * IPI e ICMS são impostos possíveis
 * (um produto pode ter apenas um deles para facilitar).
 * IPI e ICMS possuem aliquotas de 5% e 10% (valores ﬁctícios) respectivamente.
 * Todo produto deve ter a funcionalidade de mostrar
 * o nome e o preço já descontado o imposto.
 * Use o máximo de orientação a objetos possível para codiﬁcar as classes.
 */

import Foundation


var p1 = Produto(nome: "Laranja", preco:  2.50, imposto: ImpostoEnum.ICMS)
var p2 = Produto(nome: "Abacate", preco:  4.25, imposto: ImpostoEnum.IPI)
var p3 = Produto(nome: "Maça",    preco: 15.85, imposto: ImpostoEnum.IPI)

p1.mostraProduto()
p2.mostraProduto()
p3.mostraProduto()
