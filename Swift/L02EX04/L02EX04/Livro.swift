// Livro.swift  L02EX04
/* 	Exercício 1.4. Uma loja vende livros de vários formatos a preço fixo. Um EPUB custa 20 reais, um pdf 40 reais e um físico 80 reais. A informação de preco e de tipo devem ser retornados por métodos. Uma loja pode vender qualquer um deles. A loja deverá poder exibir as informações de seus produtos, caso os tenha disponível. Implemente todas as classes envolvidas nessa situação, lembre-se de usar construtores e metodos get, se necessário. Implemente também alguns testes. É proíbido usar conceitos que ainda não foram abordados. */

import Foundation

public class Livro {
    private var nomeLivro : String = ""
    private var tipoLivro : Tipo
    private var valorLivro : Double
    private let epub: Double = 20
    private let pdf: Double = 40
    private let fisico: Double = 80
    
    
    
    init (nomeLivro: String, tipoLivro: Tipo) {
        self.nomeLivro = nomeLivro
        self.tipoLivro = tipoLivro
        
        if tipoLivro == Tipo.EPUB{
            self.valorLivro = epub
             }else if tipoLivro == Tipo.PDF{
                self.valorLivro = pdf
             }  else{
                    self.valorLivro = fisico
                }
    }
    
    
    func mostraLivro(){
        print("Dados do Livro:")
        print(" Nome: \(nomeLivro)")
        print(" Tipo: \(tipoLivro)")
        print(" Valor: \(valorLivro)")
    }
}
