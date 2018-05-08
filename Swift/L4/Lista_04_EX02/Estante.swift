public class Estante {
    private nome: String 
    private categotia: CategoriaEnum 
    private ArrayLivros = [Livro]() 

    init(nome: String,categoria: CategoriaEnum) {
        self.nome = nome
        self.categoria = categoria
    }

    func getNome() -> String{
        return nome
    }

    func getCategoria() -> CategoriaEnum {
        return categoria
    }
    
    func inserirLivro(livro: Livro){
        ArrayLivros.append(livro)
    }
    
    func removerLivro(livro: Livro){
        ArrayLivros.remove(livro)
    }
    
    func getLivros(i: int) -> Livro{
      return ArrayLivros.get(at: i)
    }
}