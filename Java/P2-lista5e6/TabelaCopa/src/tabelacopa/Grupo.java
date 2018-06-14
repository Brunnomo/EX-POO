
package tabelacopa;

import java.util.ArrayList;

public class Grupo {
    private String nome;
    public ArrayList<Selecao> selecoes = new ArrayList();
    private ArrayList<Partida> partidas = new ArrayList();
    public ArrayList<Selecao> classificacao = new ArrayList();

    public Grupo(String nome,Selecao time1,Selecao time2,Selecao time3,Selecao time4){
        this.nome = nome;
        selecoes.add(time1);
        selecoes.add(time2);
        selecoes.add(time3);
        selecoes.add(time4);
    }
    
    public void addPartida(Partida partida1,Partida partida2,Partida partida3,
            Partida partida4,Partida partida5,Partida partida6){
        partidas.add(partida1);
        partidas.add(partida2);
        partidas.add(partida3);
        partidas.add(partida4);
        partidas.add(partida5);
        partidas.add(partida6);
    }
    
    public Partida getPartidaEntre(Selecao time1,Selecao time2){
        
        for(int i=0;i<partidas.size();i++){
                  
            Partida partida = partidas.get(i);           
            
            if(partida.getTime1() == time1 && partida.getTime2() == time2 || 
                partida.getTime1() == time2 && partida.getTime2() == time1){
             return partida;   
            }            
        }       
        return null;
    }
    
    private Selecao CompararSelecoes(Selecao time1,Selecao time2,Partida partidaEntreTimes1e2){
        
        if(time1==null){
            return time2;
        }
        
        if(time2==null){
            return time1;
        }
        
        if(time1.getPontos()==time2.getPontos()){
            
            if(time1.getSaldoGols()==time2.getSaldoGols()){
                
                if(time1.getGolsMarcados()==time2.getGolsMarcados()){
                    
                    if(partidaEntreTimes1e2.getVencedor()==null){
                        
                        if(time1.getPais().getOrdemDeClassificacao()>time2.getPais().getOrdemDeClassificacao()){
                            return time2;
                        }else{
                            return time1;
                        }
                        
                    }else{
                        return partidaEntreTimes1e2.getVencedor();
                    }
                    
                }else{
                    return time2;
                }
            
            }else if(time1.getSaldoGols()>time2.getSaldoGols()){
                return time1;
            }else{
                return time2;
            }
            
        }else if(time1.getPontos()>time2.getPontos()){
            return time1;
        }else{
            return time2;
        }
    }      
    
    public void organizarClassificacao(){
        Selecao selecao,melhor=null;
        
        while(this.classificacao.size()<4){           
            for(int i=0;i<selecoes.size();i++){
                selecao=this.selecoes.get(i);
                melhor=this.CompararSelecoes(melhor, selecao, this.getPartidaEntre(melhor, selecao));
            }
            for(int i=0;i<selecoes.size();i++){
                selecao=this.selecoes.get(i);
                if(melhor.getPais()==selecao.getPais()){
                     this.selecoes.remove(i);
                     break;
                }
            }
            this.classificacao.add(melhor);
            melhor=null;
        }
        selecoes=classificacao;
    }
    
    public void mostraClassificacao(){
        Selecao selecao=null;
        this.organizarClassificacao();
        
        System.out.println("-----------------------------------------------------");
        System.out.println("[ GRUPO "+this.nome+":]");
        System.out.println(" \t\t Pt | Pj | Vi | Em | De | Gm | Gs | SG |");
        for(int i=0;i < classificacao.size();i++){
            selecao=classificacao.get(i);
            selecao.exibirSelecao();
        }
        
        System.out.println("");
        this.mostrarPartidas();
        System.out.println("");
        this.organizarClassificacao();
        
        if(partidas.get(5).getStatus()==1){
            this.organizarClassificacao();
            System.out.println("CLASSIFICADOS");
            System.out.println("1)" + this.classificacao.get(0).getPais().getNomeEsq());
            System.out.println("2)" + this.classificacao.get(1).getPais().getNomeEsq());
            System.out.println("");
            
        }
    }
    
    public ArrayList<Selecao> getClassificadas(){
        ArrayList<Selecao> classificadas = new ArrayList();
        classificadas.add(this.classificacao.get(0));
        classificadas.add(this.classificacao.get(1));
        return classificadas;
    }
    
    private void mostrarPartidas(){
        this.partidas.get(0).descricao();
        System.out.println("");
        this.partidas.get(1).descricao();
        System.out.println("");
        this.partidas.get(2).descricao();
        System.out.println("");
        this.partidas.get(3).descricao();
        System.out.println("");
        this.partidas.get(4).descricao();
        System.out.println("");
        this.partidas.get(5).descricao();
    }
    
}
