// main.swift  L02EX04
/* 	Exercício 1.4. Uma loja vende livros de vários formatos a preço fixo. Um EPUB custa 20 reais, um pdf 40 reais e um físico 80 reais. A infor- mação de preco e de tipo devem ser retornados por métodos. Uma loja pode vender qualquer um deles. A loja deverá poder exibir as informa- ções de seus produtos, caso os tenha disponível. Implemente todas as classes envolvidas nessa situação, lembre-se de usar construtores e me- todos get, se necessário. Implemente também alguns testes. É proíbido usar conceitos que ainda não foram abordados. */


import Foundation

 var livro1 = Livro(nomeLivro: "O Senhor dos Aneis", tipoLivro: Tipo.EPUB)

 var livro2 = Livro(nomeLivro: "50 Tons de Cinza", tipoLivro: Tipo.PDF)

 var livro3 = Livro(nomeLivro: "O Pequeno principe", tipoLivro: Tipo.FÍSICO)

 livro1.mostraLivro()
print("")
 livro2.mostraLivro()
print("")
 livro3.mostraLivro()
print("")

var controleLivro1 = Loja(livro: livro1, qtdLivro: 5)
controleLivro1.mostraLivroQTD()
print("")
var controleLivro2 = Loja(livro: livro2, qtdLivro: 0)
controleLivro2.mostraLivroQTD()
print("")
var controleLivro3 = Loja(livro: livro3, qtdLivro: 1)
controleLivro3.mostraLivroQTD()
print("\n")

controleLivro1.vendeLivro(qtd: 10)
print("")
controleLivro1.compraLivro(qtd: 15)
controleLivro1.vendeLivro(qtd: 10)
controleLivro1.mostraLivroQTD()

print("")

controleLivro2.mostraLivroQTD()

print("")
controleLivro3.mostraLivroQTD()
controleLivro3.vendeLivro(qtd: 3)
print("")
controleLivro3.mostraLivroQTD()
controleLivro3.compraLivro(qtd: 5)
print("")
controleLivro3.mostraLivroQTD()


