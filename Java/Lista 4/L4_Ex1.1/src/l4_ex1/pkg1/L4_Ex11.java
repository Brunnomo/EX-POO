
package l4_ex1.pkg1;

import java.util.ArrayList;
import java.util.Scanner;

public class L4_Ex11 {

    public static void main(String[] args) {
        
        ArrayList<Livro> al;
        Livro[] livrosVetor;
        Livro livro;
        Scanner ler = new Scanner(System.in); 
           
        ///////////////////////////////////////////    
        
        //Lista de Usuarios
        ArrayList<Usuario> usuarios = new ArrayList();
        
        //Usuarios
        UsuarioAdmin uA = new UsuarioAdmin("admin");
        UsuarioBibliotecario uB = new UsuarioBibliotecario("bibliotecario");
        UsuarioConvidado uC = new UsuarioConvidado("convidado");
        
        //add Usuarios na lista
        usuarios.add(uA);
        usuarios.add(uB);
        usuarios.add(uC);
    
        ////////////////////////////////////////////
        
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
        
        System.out.println("[---SISTEMA DE USUARIOS---]");
        System.out.println("[---- DIGITE SEU LOGIN ---]");
        System.out.printf("LOGIN: ");
        
        String login = ler.next();
        Usuario u = null;
        
        try{
            for(int i=0;i<usuarios.size();i++){
                u = usuarios.get(i);
                if(login.equals(u.getLogin())){
                    u.boasvindas();  
                    break;
                }
            }
            if(u==null){
                throw new Exception(); 
            }
        }catch(Exception e){
            System.out.println("Usuario não encontrado"); 
        }        
        
        while(!"n".equals(opcaoString)&&!"N".equals(opcaoString)){
            
            
            opcaoInt=u.menu();
            System.out.println("");
            
            switch (opcaoInt){
                case 1:{
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
                case 2:{
                   //usando contarCiencia();
                    int numero=biblioteca.contarCiencia();
                    System.out.println("A Biblioteca tem " + numero +"livros de Ciencia");
                    System.out.println("");
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
                    System.out.println("---Todos os Livros---");
                    biblioteca.listarTudo();
                    System.out.println(""); 
                    break;
                }
                case 5:{
                    
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
                case 6:{
                    
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
                case 7:{
                    
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
                default:
                    System.out.println("Esta opcao não é válida!");
            }
        System.out.printf("Continuar?(S/N):");
        opcaoString=ler.next();
        System.out.println("");
        } 
    }
    
}
