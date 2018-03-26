// main.swift L02EX03
/* Exercício 1.3. Uma bateria é composto por um número que representa sua carga (de 0 a 100). Toda bateria pode ser descarregada a cada momento em 10 unidades e carregada em 5. Um celular é composto de um número (identificador), um nome de usuário e uma bateria. Cada vez que um celular liga, dever-se-á mostrar na tela o nome do usuá- rio e seu nome na tela, porém se não houver bateria (ou esta estiver sem carga) nada deverá ser mostrado e se a carga estiver abaixo de 20 a mensagem bateria fraca deverá ser mostrada. Para desligar, uma mensagem de despedida deverá ser mostrada na tela, caso não haja	bateria (ou a bateria estiver com carga baixa), nada deverá ser mos- trado. Cada vez que liga, 20 unidades de bateria deverão ser gastos (se houver menos, nada deverá ser feito) e quando desliga 10. Um celu- lar só desliga se estiver ligado e vice-versa. Um celular também pode tocar um som se estiver ligado e com bateria com carga suficiente (ao menos 10 unidades). Podemos também trocar a bateria de um celu- lar quando quisermos. Implemente todas as classes envolvidas nessa situação, lembre-se de usar construtores e metodos get, se necessário. Implemente também alguns testes. É proíbido usar conceitos que ainda não foram abordados. */

import Foundation



var bat1 = Bateria(carga: 100)
var bat2 = Bateria(carga: 80)
var bat3 = Bateria(carga: 50)

bat1.carregaBateria()
bat3.descarregaBateria()
bat3.mostraCarga()

print("\n")

var cel1 = Celular(numeroCel: "9975612633", nomeUser: "Paulo", bateriaCel: bat1, temBat: true)
cel1 = Celular(numeroCel: "997561263", nomeUser: "Paulo", bateriaCel: bat1, temBat: true)

var cel2 = Celular(numeroCel: "981165568", nomeUser: "Maria", bateriaCel: bat3, temBat: false)

print("\n")

cel1.getStatusCel()
cel1.ligarCel()
cel1.getStatusCel()
cel1.desligaCel()
cel1.getStatusCel()

print("\n")

cel2.getStatusCel()
cel2.ligarCel()
cel2.insereBat()
cel2.getStatusCel()
cel2.ligarCel()
cel2.getStatusCel()
cel2.desligaCel()
cel2.getStatusCel()
cel2.ligarCel()
bat3.descarregaBateria()
cel2.getStatusCel()
bat3.mostraCarga()
print("")

for i in 0...2{
bat3.carregaBateria()
}

bat3.mostraCarga()
cel2.getStatusCel()
cel2.ligarCel()
for i in 0...4{
    bat3.carregaBateria()
}
cel2.getStatusCel()
cel2.ligarCel()
cel2.getStatusCel()
bat3.descarregaBateria()
cel2.getStatusCel()
print("")
cel2.trocaBat(celular: cel2, baterianova: bat2)
cel2.getStatusCel()
cel2.ligarCel()
cel2.getStatusCel()
