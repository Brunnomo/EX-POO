
package tabelacopa;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    
    private Scanner ler = new Scanner(System.in);
    
    
    public int memuPrincipal(){
        System.out.println("[  TABELA-COPA-2018  ]");
        System.out.println("(1) ADD RESULTADOS  ");
        System.out.println("(2) VISUALIZAR GRUPOS");
        System.out.println("(3) VISUALIZAR FINAIS");
        System.out.println("(4) VISUALIZAR TABELA ");
        System.out.printf("DIGITE UMA OPÇÃO:");

        int opcao = ler.nextInt();
        
        return opcao;
    }
    
    public void addResultado(ArrayList<Partida> partidasGrupo,ArrayList<Partida> partidasFinais){
        String opcao=null;
        
        if(setFimPrimeiraFase(partidasGrupo)){
           
            for(int i=0;i<partidasFinais.size();i++){
                if(partidasFinais.get(i).getStatus()==0){
                    System.out.println("");
                    System.out.println("[PARTIDA NUMERO :" + (partidasFinais.get(i).getPartidaId()+ 48) +"]");
                    partidasFinais.get(i).descricao();
                    System.out.println("");
                    
                    System.out.println("ADD gols " + partidasFinais.get(i).getTime1().getPais().getNomeEsq());
                    System.out.printf("DIGITE:");
                    int gols1 = ler.nextInt();
                    
                    System.out.println("ADD gols " + partidasFinais.get(i).getTime2().getPais().getNomeEsq());
                    System.out.printf("DIGITE:");
                    int gols2 = ler.nextInt();
                    
                    System.out.println("");
                    partidasFinais.get(i).addResultado(gols1, gols2);
                    break;
                    
                }
            }
        }
        
        if(partidasGrupo.get(47).getStatus()==0){
            
            for(int i=0;i<partidasGrupo.size();i++){
                if(partidasGrupo.get(i).getStatus()==0){
                    System.out.println("");    
                    System.out.println("[PARTIDA NUMERO :" + partidasGrupo.get(i).getPartidaId()+"]");
                    System.out.println("");
                    partidasGrupo.get(i).descricao();
                    System.out.println("");
                
                    System.out.println("ADD gols " + partidasGrupo.get(i).getTime1().getPais().getNomeEsq());
                    System.out.printf("DIGITE:");
                    int gols1 = ler.nextInt();
                
                    System.out.println("ADD gols " + partidasGrupo.get(i).getTime2().getPais().getNomeEsq());
                    System.out.printf("DIGITE:");
                    int gols2 = ler.nextInt();
                    
                    System.out.println("");
                    partidasGrupo.get(i).addResultado(gols1, gols2);
                    break;
                }   
            } 
        }
        
        if(partidasFinais.get(14).getStatus()==1){
            System.out.println("");
            System.out.println(partidasFinais.get(14).getVencedor().getPais().getNome() + " é Campeão 2018");
            System.out.println("");
            System.out.println("TODOS OS JOGOS FORAM REALIZADOS!");
            System.out.println("");
        }
        
    }
    
    public void visualizarGrupos(Grupo a,Grupo b,Grupo c,Grupo d,Grupo e,Grupo f,Grupo g,Grupo h){
        
        System.out.println();
        System.out.println("[ VISUALIZAR GRUPOS  ]");
        System.out.println("(1) GRUPO A");
        System.out.println("(2) GRUPO B");
        System.out.println("(3) GRUPO C");
        System.out.println("(4) GRUPO D");
        System.out.println("(5) GRUPO E");
        System.out.println("(6) GRUPO F");
        System.out.println("(7) GRUPO G");
        System.out.println("(8) GRUPO H");
        System.out.println("(9) VISUALIZAR TODOS");
        System.out.printf("DIGITE UMA OPÇÃO:");
       
        int opcao = ler.nextInt();
        
        switch (opcao){
            case 1 :{
                a.mostraClassificacao();
                break;
            }
            case 2 :{
                b.mostraClassificacao();
                break;
            }
            case 3 :{
                c.mostraClassificacao();
                break;
            }
            case 4 :{
                d.mostraClassificacao();
                break;
            }
            case 5 :{
                e.mostraClassificacao();
                break;
            }
            case 6 :{
                f.mostraClassificacao();
                break;
            }
            case 7 :{
                g.mostraClassificacao();
                break;
            }
            case 8 :{
                h.mostraClassificacao();
                break;
            }
            case 9 :{
              a.mostraClassificacao();
              b.mostraClassificacao();
              c.mostraClassificacao();
              d.mostraClassificacao();
              e.mostraClassificacao();
              f.mostraClassificacao();
              g.mostraClassificacao();
              h.mostraClassificacao();
              break;
            }
            default:{
                System.out.println("Esta opcao não é válida!");
            }
        }
        
    }
    
    public void visualizarTodosGrupos(Grupo a,Grupo b,Grupo c,Grupo d,Grupo e,Grupo f,Grupo g,Grupo h){
        a.mostraClassificacao();
        b.mostraClassificacao();
        c.mostraClassificacao();
        d.mostraClassificacao();
        e.mostraClassificacao();
        f.mostraClassificacao();
        g.mostraClassificacao();
        h.mostraClassificacao();
    }
    
    public boolean setFimPrimeiraFase(ArrayList<Partida> partidas){
        boolean fimPrimeiraFase=true;
        
        for(int i=0;i < partidas.size();i++){
            if(partidas.get(i).getStatus()==0){
                fimPrimeiraFase=false;
                break;
            }  
        }
        return fimPrimeiraFase;
    }
}
