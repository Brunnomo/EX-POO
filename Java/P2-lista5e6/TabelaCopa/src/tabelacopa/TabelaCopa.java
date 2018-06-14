
package tabelacopa;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Grupo 4 - Brunno Oliveira
 */
public class TabelaCopa {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner ler = new Scanner(System.in);
        SelecaoDAO sdao = new SelecaoDAO(); 
        PartidaDAO pdao = new PartidaDAO();
        PartidaFinaisDAO pfdao = new PartidaFinaisDAO();
        
        Menu menu = new Menu();
        
        ArrayList<Selecao> selecoes = new ArrayList();
        ArrayList<Partida> partidas = new ArrayList();
        ArrayList<Partida> partidasFinais = new ArrayList();
        Finais finais = null;
        
        try{
            selecoes = sdao.getListSelecao();
            partidas = pdao.getListPartida(selecoes);
            partidasFinais = pfdao.getListPartidaFinais(selecoes);
        }catch(Exception e){
            System.out.println("Não foi possivel conectar com banco de dados!");   
        }
         
        String opcaoString = " ";
        
        while(!"n".equals(opcaoString)&&!"N".equals(opcaoString)){
        
        Grupo grupoA = new Grupo("A",selecoes.get(0),selecoes.get(7),selecoes.get(14),selecoes.get(21));
        grupoA.addPartida(partidas.get(0), partidas.get(1), partidas.get(16), partidas.get(18), partidas.get(32), partidas.get(33));
        
        Grupo grupoB = new Grupo("B",selecoes.get(18),selecoes.get(10),selecoes.get(24),selecoes.get(2));
        grupoB.addPartida(partidas.get(2), partidas.get(3), partidas.get(17), partidas.get(19), partidas.get(34), partidas.get(35));
         
        Grupo grupoC = new Grupo("C",selecoes.get(17),selecoes.get(30),selecoes.get(31),selecoes.get(29));
        grupoC.addPartida(partidas.get(4), partidas.get(6), partidas.get(20), partidas.get(21), partidas.get(36), partidas.get(37));
        
        Grupo grupoD = new Grupo("D",selecoes.get(19),selecoes.get(15),selecoes.get(27),selecoes.get(11));
        grupoD.addPartida(partidas.get(5), partidas.get(7), partidas.get(22), partidas.get(24), partidas.get(38), partidas.get(39));
        
        Grupo grupoE = new Grupo("E",selecoes.get(1),selecoes.get(26),selecoes.get(12),selecoes.get(16));
        grupoE.addPartida(partidas.get(8), partidas.get(10), partidas.get(23), partidas.get(25), partidas.get(42), partidas.get(43));
        
        Grupo grupoF = new Grupo("F",selecoes.get(8),selecoes.get(4),selecoes.get(28),selecoes.get(6));
        grupoF.addPartida(partidas.get(9), partidas.get(11), partidas.get(27), partidas.get(28), partidas.get(40), partidas.get(41));
        
        Grupo grupoG = new Grupo("G",selecoes.get(5),selecoes.get(22),selecoes.get(25),selecoes.get(9));
        grupoG.addPartida(partidas.get(12), partidas.get(13), partidas.get(26), partidas.get(29), partidas.get(46), partidas.get(47));
        
        Grupo grupoH = new Grupo("H",selecoes.get(13),selecoes.get(23),selecoes.get(20),selecoes.get(3));
        grupoH.addPartida(partidas.get(14), partidas.get(15), partidas.get(30), partidas.get(31), partidas.get(44), partidas.get(45));
    
            if(menu.setFimPrimeiraFase(partidas)){
                grupoA.organizarClassificacao();
                grupoB.organizarClassificacao();
                grupoC.organizarClassificacao();
                grupoD.organizarClassificacao();
                grupoE.organizarClassificacao();
                grupoF.organizarClassificacao();
                grupoG.organizarClassificacao();
                grupoH.organizarClassificacao();
            
                finais = new Finais(grupoA.classificacao.get(0),grupoA.classificacao.get(1),
                                        grupoB.classificacao.get(0),grupoB.classificacao.get(1),
                                            grupoC.classificacao.get(0),grupoC.classificacao.get(1),
                                                grupoD.classificacao.get(0),grupoD.classificacao.get(1),
                                                    grupoE.classificacao.get(0),grupoE.classificacao.get(1),
                                                        grupoF.classificacao.get(0),grupoF.classificacao.get(1),
                                                            grupoG.classificacao.get(0),grupoG.classificacao.get(1),
                                                                grupoH.classificacao.get(0),grupoH.classificacao.get(1),
                                                                    partidasFinais);
                if(finais.partidas.get(7).getStatus()==1)
                    finais.quartasDeFinal();
        
                if(finais.partidas.get(11).getStatus()==1)
                    finais.semiFinal();
        
                if(finais.partidas.get(13).getStatus()==1)
                    finais.Final();
            }
        
            int opcao = menu.memuPrincipal();
            switch (opcao){
                case 1 :{
                    menu.addResultado(partidas, partidasFinais);
                    break;
                }
                case 2 :{
                    menu.visualizarGrupos(grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoH, grupoH);
                    break;
                }
                case 3:{
                    System.out.println("");
                    if(menu.setFimPrimeiraFase(partidas)){
                        finais.visualizar();
                    }else{
                        System.out.println("FINAIS AINDA NÃO DEFINIDAS!");
                        System.out.println("");
                    }
                    break;
                }
                case 4:{
                    menu.visualizarTodosGrupos(grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH);
                    if(menu.setFimPrimeiraFase(partidas)){
                        finais.visualizar();
                    }else{
                        System.out.println("FINAIS AINDA NÃO DEFINIDAS!");
                        System.out.println("");
                    }
                    break;
                }
                default:{
                    System.out.println("Esta opcao não é válida!");
                }
            }
        System.out.printf("CONTINUAR?(S/N):");
        opcaoString=ler.next();
        System.out.println("");
        }    
            
        sdao.updateListSelecao(selecoes);
        pdao.updateListPartidaGrupo(partidas);
        pfdao.updateListPartidaFinais(partidasFinais);
        
    }
    
}
