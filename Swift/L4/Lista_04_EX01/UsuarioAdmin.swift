Public class UsuarioAdmin : Usuario {
    
    Override func int menu(){
        var opcao = 0
        
        println("----------MENU---------");
        println("(1)listarAutores");
        println("(2)contarCiencia");
        println("(3)listarFilosofia");
        println("(4)listarTudo");
        println("(5)inserirLivro");
        println("(6)inserirEstante");
        println("(7)removerLivro");
        println("");
        printf("Digite uma opcao:");
        
        if(opcao<1 || opcao>7){
            opcao=0
        }        
        return opcao
    }
    
}