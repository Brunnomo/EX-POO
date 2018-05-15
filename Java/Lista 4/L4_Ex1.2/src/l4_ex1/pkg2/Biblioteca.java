package l4_ex1.pkg2;

import java.util.ArrayList;

public class Biblioteca {
    
    private String nome;
    private ArrayList<Estante> estantes = new ArrayList();

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Estante> getEstantes() {
        return estantes;
    }
    
    public void inserirEstante(Estante estante){
        estantes.add(estante);
    }
    
    public Livro[] listarFilosofia()throws BookNotFoundException{ //Retorna uma lista com todos os livros de filosofia
        ArrayList<Livro> al = new ArrayList(); 
        int cont=0;
        Estante e;
        for(int i=0;i<estantes.size();i++){
            e=estantes.get(i);
            if(e.getCategoria()==CategoriaEnum.FILOSOFIA){
                for(int y=0;y<e.gtdLivros();y++){
                    al.add(e.getLivros(y));
                } 
                
            }
        }
        Livro[] l = new Livro[al.size()]; 
        for(int x=0;x<al.size();x++){
            l[x]=al.get(x);
        }
        return l;    
    }
    
    public int contarCiencia()throws BookNotFoundException{ //Retorna a quantidade de livros de Ciência na biblioteca
        int qtd = 0;
        Estante e;
        for(int i=0;i<estantes.size();i++){
            e=estantes.get(i);
            if(e.getCategoria()==CategoriaEnum.CIENCIA){
                qtd=e.gtdLivros()+qtd;
            }
        }
        return qtd;    
    }
    
    public void listarTudo()throws BookNotFoundException{ //Mostra na tela todos os livros de todas as estantes
        Estante e;
	Livro l;
	for(int i=0;i<estantes.size();i++){
            e=estantes.get(i);
            System.out.println("_____________________________________");
            System.out.println("Estante : " + e.getNome());
            System.out.println("Categoria :" + e.getCategoria());
            for(int x=0;x<e.gtdLivros();x++){
                l=e.getLivros(x);
                System.out.println("*****************************");
                System.out.println("Livro : " + l.getNome() + "  (" + l.getAnoPublicacao() + ")"  ) ;
                System.out.println("Autor :" + l.getAutor());
            }
            System.out.println("______________________________________");
            System.out.println("");
            System.out.println("");
	}
    }
    
    public ArrayList<String> listarAutores(CategoriaEnum cat) 
            throws BookNotFoundException{ //Retorna um lista de autores de acordo com a categoria desejada.
        Estante e;
	Livro l;
        ArrayList<String> autores = new ArrayList();
        for(int i=0;i<estantes.size();i++){
            e=estantes.get(i);
            if(e.getCategoria()==cat){
                for(int x=0;x<e.gtdLivros();x++){
                    l=e.getLivros(x);
                    autores.add(l.getAutor());
                }
            }
        }
        return autores;
    }
}
