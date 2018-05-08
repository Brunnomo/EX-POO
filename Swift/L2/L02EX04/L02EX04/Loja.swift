// Loja.swift  L02EX04

/* 	Exercício 1.4. Uma loja vende livros de vários formatos a preço fixo. Um EPUB custa 20 reais, um pdf 40 reais e um físico 80 reais. A informação de preco e de tipo devem ser retornados por métodos. Uma loja pode vender qualquer um deles. A loja deverá poder exibir as informações de seus produtos, caso os tenha disponível. Implemente todas as classes envolvidas nessa situação, lembre-se de usar construtores e metodos get, se necessário. Implemente também alguns testes. É proíbido usar conceitos que ainda não foram abordados. */
 
import Foundation
 
 public class Loja{
 
    public var livro: Livro
    public var qtdLivro : Int
 
    init(livro: Livro, qtdLivro: Int) {
        self.livro = livro
        self.qtdLivro = qtdLivro
    }
    

 
   func mostraLivroQTD(){
    
     if qtdLivro > 0{
        livro.mostraLivro()
        print(" Quantidade Disponível: \(getQTDLivro()) unidade(s)")
     }     else{
             print(" Desculpe, No momento não temos nenhuma unidade deste Livro")
         }
   }
    
    
    public func vendeLivro(qtd: Int){
        
        if qtd <= qtdLivro && qtd > 0{
           qtdLivro -= qtd
           print("Sua compra foi realizada com sucesso!!")
        }    else{
               print("Quantidade de Estoque Insuficienta, temos")
               print("apenas \(qtdLivro) unidade(s) deste livro.")
             }
    }
    
    
    public func compraLivro(qtd: Int){
        
        if qtd > 0{
          qtdLivro += qtd
          print("Seu estoque foi aumentado em \(qtd) unidade(s)")
        }
    }
    
    
    public func getQTDLivro() -> Int{
      return qtdLivro
    }
    
    
 }
 

