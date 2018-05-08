public class Biblioteca {
    
    private var nome: String
    private var arrayEstantes = [Estante]() 

    init(nome: String) {
        self.nome = nome
    }

    func getNome() -> String{
        return nome
    }

    func getEstantes() -> [Estante](){
        return arrayEstantes
    }
    
    func inserirEstante(estante: Estante){
        arrayEstantes.append(estante)
    }
    
    func listarFilosofia() -> Livro[] 
        
        var ArrayList = [Estante]() 
        var cont = 0
        var e: Estante

        for(int i=0;i<estantes.size();i++){
            e=estantes.get(i)
            if(e.getCategoria()==CategoriaEnum.FILOSOFIA){
                for(int y=0;y<e.gtdLivros();y++){
                    al.add(e.getLivros(y))
                } 
                
            }
        }
        var l = new Livro[al.size()] 
        for(int x=0;x<al.size();x++){
            l[x]=al.get(x)
        }
        return l    
    }
    
    func contarCiencia() -> int{ 
        var qtd = 0
        var e: Estante
        for(int i=0;i<estantes.size();i++){
            e=estantes.get(i)
            if(e.getCategoria()==CategoriaEnum.CIENCIA){
                qtd=e.gtdLivros()+qtd
            }
        }
        return qtd    
    }
    
    public void listarTudo(){ //Mostra na tela todos os livros de todas as estantes
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
    
    public ArrayList<String> listarAutores(CategoriaEnum cat){ //Retorna um lista de autores de acordo com a categoria desejada.
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