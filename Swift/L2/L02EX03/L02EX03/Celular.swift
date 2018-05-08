// Celular.swift  L02EX03
/* Exercício 1.3. Uma bateria é composto por um número que representa sua carga (de 0 a 100). Toda bateria pode ser descarregada a cada momento em 10 unidades e carregada em 5. Um celular é composto de um número (identificador), um nome de usuário e uma bateria. Cada vez que um celular liga, dever-se-á mostrar na tela o nome do usuário e seu nome na tela, porém se não houver bateria (ou esta estiver sem carga) nada deverá ser mostrado e se a carga estiver abaixo de 20 a mensagem bateria fraca deverá ser mostrada. Para desligar, uma mensagem de despedida deverá ser mostrada na tela, caso não haja	bateria (ou a bateria estiver com carga baixa), nada deverá ser mostrado. Cada vez que liga, 20 unidades de bateria deverão ser gastos (se houver menos, nada deverá ser feito) e quando desliga 10. Um celular só desliga se estiver ligado e vice-versa. Um celular também pode tocar um som se estiver ligado e com bateria com carga suficiente (ao menos 10 unidades). Podemos também trocar a bateria de um celular quando quisermos. Implemente todas as classes envolvidas nessa situação, lembre-se de usar construtores e metodos get, se necessário. Implemente também alguns testes. É proíbido usar conceitos que ainda não foram abordados. */

import Foundation

public class Celular{
    
    private var numeroCel: String = ""
    private var nomeUser: String = ""
    private var bateriaCel: Bateria? = nil
    private var temBat: Bool = true
    private var statusCel: Bool = false
    
    
    init(numeroCel: String, nomeUser: String, bateriaCel: Bateria, temBat: Bool) {
        
        if (numeroCel.characters.count) == 9 {
            self.numeroCel = numeroCel
            self.nomeUser = nomeUser
            self.bateriaCel = bateriaCel
            self.temBat = temBat
            self.statusCel = false
            print("O Celular \(numeroCel) foi instanciado")
        }else{
            print("Não foi possivel instaciar o celular, verifique o numero do telefone")
        }
    }// fim do contrutor
    
    
    
    public func ligarCel(){
        
        if temBat == true && statusCel == false && bateriaCel!.getCarga() > 20{
            statusCel = true
            bateriaCel!.descarregaBateria()
            bateriaCel!.descarregaBateria()
            print("Ligando Dispositovo, aguarde...")
            print("\(nomeUser): Tel: \(numeroCel)")
        }    else if bateriaCel!.getCarga() <= 20 && statusCel == false{
               print("Bateria com pouca carga, carregue o dipisitovo antes de ligar")
             }
    }// fim do método ligar celular
    
    
    public func desligaCel(){
        
        if temBat == true && statusCel == true && bateriaCel!.getCarga() > 20{
            statusCel = false
            bateriaCel!.descarregaBateria()
            print("Até a proxima! Seu Dispositovo esta desligando...")
        }     else if temBat == true && statusCel == true && bateriaCel!.getCarga() >= 10{
                statusCel = false
                bateriaCel!.descarregaBateria()
              }
    }//fim do método desliga o celular
    
    
    
    public func getStatusCel(){
        if statusCel == true && temBat == true{
            let auxCarga1: Int = bateriaCel!.getCarga()
            print("Status: Celular Ligado, com Bateria @: \(auxCarga1)%")
        }     else if statusCel == false && temBat == false{
                 let auxCarga2: Int = bateriaCel!.getCarga()
                 print("Status: Celular Desligado, sem bateria @: \(auxCarga2)%")
              }     else if statusCel == false && temBat == true{
                        let auxCarga3: Int = bateriaCel!.getCarga()
                        print("Status: Celular Desligado, com bateria @: \(auxCarga3)%")
                    }
        
    }// fim da função que mostar o status e bateria do celular, ligado ou desligado
    
    
    public func trocaBat(baterianova: Bateria){
        desligaCel()
        self.bateriaCel = baterianova
    } //fim da função de substituir a bateria no celular
    
    
    public func insereBat(){
        if temBat == false{
           temBat = true
        }
    }// fim da função inser bateria
   
}
