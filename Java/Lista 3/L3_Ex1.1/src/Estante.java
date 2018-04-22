
import java.util.ArrayList;


public class Estante {
    private String nome; 
    private CategoriaEnum categoria; 
    private ArrayList<Livro> livros = new ArrayList();

    public Estante(String nome, CategoriaEnum categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public CategoriaEnum getCategoria() {
        return categoria;
    }
    
    public void inserirLivro(Livro livro){
        livros.add(livro);
    }
    
    public void removerLivro(Livro livro){
        livros.remove(livro);
    }
    public Livro getLivros(int i){
      return livros.get(i);
    }
    
    public int gtdLivros(){
        return livros.size();
    }
}
