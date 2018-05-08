//
//  main.swift
//  L03EX02
//
//  Created by naldinho0707 on 24/04/18.
//  Copyright © 2018 naldinho0707. All rights reserved.
//

import Foundation

var opc: Int = 1

var conta1 = Conta(nome: "Reginaldo", num_conta: "001", saldo: 100.0)

conta1.deposito(deposito: 50.0)
conta1.saque(saque: 151.0)
conta1.saque(saque: 32.5)


var conta2 = Premium(nome: "Paulo", num_conta: "002", saldo: 50.0)
conta2.printTarPremium()

var conta3 = Regular(nome: "Maria", num_conta: "003", saldo: 1000.0)
conta3.printTarRegular()

var conta4 = Vip(nome: "Joana", num_conta: "004", saldo: 1560.0)
conta4.printTarVip()

var conta5 = Premium(nome: "Pedro", num_conta: "005", saldo: 500.0)


var  clientesPremium = Array<Premium>()
clientesPremium.append(conta2)
clientesPremium.append(conta5)


for i in clientesPremium{
    
    print(i.mostraClientePremium())
}

print("Entre com a opção: < 1 >")
print("<1> Para mostra Cliente Regular")
print("<2> Para mostra Cliente Vip\n")


switch opc {
    
case 1:
    conta3.mostraClienteRegular()
case 2:
    conta4.mostraClienteVip()
default:
    print("Opção Inválida.")
}

conta4.mostraClienteVip()
