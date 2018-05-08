public class Livro {
    private var nome: String
    private var autor: String
    private var anoPublicacao: String

    init(nome: String, autor: String, anoPublicacao: String) {
        self.nome = nome
        self.autor = autor
        self.anoPublicacao = anoPublicacao
    }

    func getNome() -> String {
        return nome
    }

    func getAutor() -> String  {
        return autor
    }

    func getAnoPublicacao() -> String {
        return anoPublicacao
    }
}