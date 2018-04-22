
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Exercício 1.1. (Obrigatório) Crie a classe Biblioteca que possui nome
 * e varias Estantes. Uma Estante possui um nome, uma categoria (Ciência,
 * Literatura ou Filosofia) e vários livros. Um livro é composto por
 * nome, autor e ano de publicação. Todas as classes possuirão get’s para
 * seus atributos e construtores. Faça os métodos (é requisito de avaliação
 * a correta implementação dos métodos abaixo em sua respectiva classe):
 *
 * (1) void inserirEstante(Estante estante): Insere uma Estante em uma Biblioteca
 * (2) void inserirLivro(Livro livro): Insere um Livro em uma Estante
 * (3) Livro[] listarFilosofia(): Retorna uma lista com todos os livros de filosofia
 * (4) int contarCiencia(): Retorna a quantidade de livros de Ciência na biblioteca
 * (5) void listarTudo(): Mostra na tela todos os livros de todas as estantes
 * (6) void removerLivro(Livro livro): Remove de uma estante o livro em questão.
 * (7) ArrayList<String> listarAutores(Categoria cat): Retorna um lista de autores de acordo com a categoria desejada.
 * (8) Crie dois métodos que achar necessário que difiram dos listados acima.
 * (9) Crie um menu para o controle da biblioteca.
 *
 * @author 
 */
public class L3_Ex1_1 {

    public static void main(String[] args) {
        ArrayList<Livro> al;
        Livro[] livrosVetor;
        Livro livro = null;
        Scanner ler = new Scanner(System.in); 
        
        //Biblioteca Municipal
        Biblioteca biblioteca = new Biblioteca("Blibioteca Municipal");
        
        //Estante de Ciencia 
        Estante estante1 = new Estante("Ciência",CategoriaEnum.CIENCIA);
        Livro lc1= new Livro("Uma Breve História do Tempo","Stephen Hawking","1988");
        Livro lc2= new Livro("O Universo Numa Casca de Noz","Stephen Hawking","2001");
        Livro lc3= new Livro("Cosmos","Carl Sagan","1980");
        estante1.inserirLivro(lc1);
        estante1.inserirLivro(lc2);
        estante1.inserirLivro(lc3);
        
        //Estante de Filosofia 1
        Estante estante2 = new Estante("Filosofia",CategoriaEnum.FILOSOFIA);
        Livro l1f1= new Livro("O Príncipe","Nicolau Maquiavel","1532");
        Livro l1f2= new Livro("A República","Platão","século IV a.C");
        Livro l1f3= new Livro("Assim Falou Zaratustra","Friedrich Nietzsche","11891");
        estante2.inserirLivro(l1f1);
        estante2.inserirLivro(l1f2);
        estante2.inserirLivro(l1f3);
        
        //EStante de Filosofia 2     
        Estante estante3 = new Estante("Filosofia2",CategoriaEnum.FILOSOFIA);
        Livro l2f1= new Livro("Além do bem e do mal","Friedrich Nietzsche","1886");
        Livro l2f2= new Livro("Apologia de Sócrates","Platão","399 a.C");
        estante3.inserirLivro(l2f1);
        estante3.inserirLivro(l2f2);
        
        biblioteca.inserirEstante(estante1);
        biblioteca.inserirEstante(estante2);
        biblioteca.inserirEstante(estante3);
        
        String opcaoString = " ";
        int opcaoInt = 0;
        while(!"n".equals(opcaoString)||!"N".equals(opcaoString)){
            System.out.println("----------MENU---------");
            System.out.println("(1)inserirEstante");
            System.out.println("(2)inserirLivro");
            System.out.println("(3)listarFilosofia");
            System.out.println("(4)contarCiencia");
            System.out.println("(5)listarTudo");
            System.out.println("(6)removerLivro");
            System.out.println("(7)listarAutores");
            System.out.println("");
            System.out.printf("Digite uma opcao:");
            opcaoInt=ler.nextInt();
            System.out.println("");
            switch (opcaoInt){
                case 1:{
                    System.out.println("----NOVA ESTANTE----");
                    System.out.println("Escolha uma Categoria");
                    System.out.println("(1)Ciência");
                    System.out.println("(2)Filosofia");
                    System.out.println("(3)Literatura");
                    System.out.println("Digite uma categoria:");
                    int categoriaInt = ler.nextInt();
                    System.out.printf("Digite um nome para a estante:");
                    String nome = ler.next();
                    if(categoriaInt==1){
                        Estante e = new Estante(nome,CategoriaEnum.CIENCIA);
                        biblioteca.inserirEstante(e);
                    }
                    if(categoriaInt==2){
                        Estante e = new Estante(nome,CategoriaEnum.FILOSOFIA);
                        biblioteca.inserirEstante(e);
                    }
                    if(categoriaInt==3){
                        Estante e = new Estante(nome,CategoriaEnum.LITERATURA);
                        biblioteca.inserirEstante(e);
                    }
                    break;
                }
                case 2:{
                    System.out.println("Escolha uma estane:");    
                    ArrayList<Estante> aE=biblioteca.getEstantes();
                    Estante e1;
                    for(int x=0;x<aE.size();x++){
                        e1 = aE.get(x);
                        System.out.println("("+(x+1)+")"+e1.getNome());
                    }
                    System.out.printf("Estante:");
                    int numero=ler.nextInt();
                    System.out.println("");
                    System.out.println("----NOVA LIVRO----");
                    System.out.printf("Nome:");
                    String nome = ler.next();
                    System.out.printf("Autor:");
                    String autor = ler.next();
                    System.out.printf("Ano Publicacao:");
                    String anoPublica = ler.next();
                    Livro livro1 = new Livro(nome,autor,anoPublica);
                        e1 = aE.get(numero-1);
                        e1.inserirLivro(livro1);                     
                    break;   
                    }
                case 3:{
                    System.out.println("----Lista Filosofia----");
                    //usando listarFilosofia
                    livrosVetor = biblioteca.listarFilosofia();
                    for(int i=0;i<livrosVetor.length ;i++){
                        livro=livrosVetor[i];
                        System.out.println("*****************************");
                        System.out.println("Livro : " + livro.getNome() + "  (" + livro.getAnoPublicacao() + ")"  ) ;
                        System.out.println("Autor :" + livro.getAutor());
                        System.out.println("*****************************");
                    }
                    break;
                }
                case 4:{
                    //usando contarCiencia();
                    int numero=biblioteca.contarCiencia();
                    System.out.println("A Biblioteca tem " + numero +"livros de Ciencia");
                    System.out.println("");
                    break;
                }
                case 5:{
                    System.out.println("---Todos os Livros---");
                    biblioteca.listarTudo();
                    System.out.println(""); 
                    break;
                }
                case 6:{
                    System.out.println("Escolha uma estane:");    
                    ArrayList<Estante> aE=biblioteca.getEstantes();
                    Estante e1;
                    Livro l;
                    for(int x=0;x<aE.size();x++){
                        e1 = aE.get(x);
                        System.out.println("("+(x+1)+")"+e1.getNome());
                    }System.out.printf("Estante:");
                    int numeroE=ler.nextInt();
                    
                    System.out.println("");
                    System.out.println("escolha um livro");
                    e1=aE.get(numeroE-1);
                    for(int y=0;y<e1.gtdLivros();y++){
                       l=e1.getLivros(y);
                       System.out.println("("+(y+1)+")"+l.getNome());
                    }
                    System.out.println("Livro:");
                    int numeroL=ler.nextInt();
                    l=e1.getLivros(numeroL); 
                    e1.removerLivro(l);
                    break;
                }
                case 7:{
                    System.out.println("Escolha uma Categoria:");
                    System.out.println("(1)Ciência");
                    System.out.println("(2)Filosofia");
                    System.out.println("(3)Literatura");
                    System.out.printf("Digite uma categoria:");
                    int categoriaInt = ler.nextInt();
                    if(categoriaInt==1){     
                        ArrayList<String> autores=biblioteca.listarAutores(CategoriaEnum.CIENCIA);
                        System.out.println(" ------Autores----- ");
                        for(int i=0;i<autores.size();i++){  
                        System.out.println(autores.get(i));    
                        }
                        System.out.println("--------------------");
                    }
                    if(categoriaInt==2){         
                        ArrayList<String> autores=biblioteca.listarAutores(CategoriaEnum.FILOSOFIA);
                        System.out.println(" ------Autores----- ");
                        for(int i=0;i<autores.size();i++){  
                        System.out.println(autores.get(i));    
                        }
                        System.out.println("--------------------");
                    }
                    if(categoriaInt==3){
                        ArrayList<String> autores=biblioteca.listarAutores(CategoriaEnum.LITERATURA);
                        System.out.println(" ------Autores----- ");
                        for(int i=0;i<autores.size();i++){  
                        System.out.println(autores.get(i));    
                        }
                        System.out.println("--------------------");
                    }
                    break;
                }
                default:
                    System.out.println("Esta opcao não é válida!");
            }
        System.out.printf("Continuar?(S/N):");
        opcaoString=ler.next();
        System.out.println("");
        }      
        
    }
    
}
