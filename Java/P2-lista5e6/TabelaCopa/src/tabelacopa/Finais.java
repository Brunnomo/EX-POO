
package tabelacopa;

import java.util.ArrayList;

public class Finais {
    
    ArrayList<Selecao> oitavasFinal = new ArrayList();
    ArrayList<Selecao> quartasFinal = new ArrayList();
    ArrayList<Selecao> semiFinal = new ArrayList();
    ArrayList<Selecao> finalFinal = new ArrayList();
    ArrayList<Partida> partidas = new ArrayList();

    public Finais(Selecao primeiraDoGrupoA, Selecao segundaDoGrupoA,
                    Selecao primeiraDoGrupoB, Selecao segundaDoGrupoB, 
                        Selecao primeiraDoGrupoC, Selecao segundaDoGrupoC,
                            Selecao primeiraDoGrupoD, Selecao segundaDoGrupoD,
                                Selecao primeiraDoGrupoE, Selecao segundaDoGrupoE,
                                    Selecao primeiraDoGrupoF, Selecao segundaDoGrupoF,
                                        Selecao primeiraDoGrupoG, Selecao segundaDoGrupoG,
                                            Selecao primeiraDoGrupoH, Selecao segundaDoGrupoH, 
                                                    ArrayList<Partida> partidas) {
        
        this.oitavasFinal.add(primeiraDoGrupoA); //posição 0 do ArrayList
        this.oitavasFinal.add(segundaDoGrupoA);  //posição 1 do ArrayList
        
        this.oitavasFinal.add(primeiraDoGrupoB); //posição 2 do ArrayList
        this.oitavasFinal.add(segundaDoGrupoB);  //posição 3 do ArrayList  
        
        this.oitavasFinal.add(primeiraDoGrupoC); //posição 4 do ArrayList
        this.oitavasFinal.add(segundaDoGrupoC);  //posição 5 do ArrayList
        
        this.oitavasFinal.add(primeiraDoGrupoD); //posição 6 do ArrayList
        this.oitavasFinal.add(segundaDoGrupoD);  //posição 7 do ArrayList
        
        this.oitavasFinal.add(primeiraDoGrupoE); //posição 8 do ArrayList
        this.oitavasFinal.add(segundaDoGrupoE);  //posição 9 do ArrayList
        
        this.oitavasFinal.add(primeiraDoGrupoF); //posição 10 do ArrayList
        this.oitavasFinal.add(segundaDoGrupoF);  //posição 11 do ArrayList
        
        this.oitavasFinal.add(primeiraDoGrupoG); //posição 12 do ArrayList
        this.oitavasFinal.add(segundaDoGrupoG);  //posição 13 do ArrayList
        
        this.oitavasFinal.add(primeiraDoGrupoH); //posição 14 do ArrayList
        this.oitavasFinal.add(segundaDoGrupoH);  //posição 15 do ArrayList
        
        this.partidas=partidas;
        
        if(partidas.get(0).getTime1().getPais()==PaisesEnum.VAZIO ||   //- vencedor // partidaid-9
                partidas.get(0).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(0).addTimes(primeiraDoGrupoC, segundaDoGrupoD);
        
        if(partidas.get(1).getTime1().getPais()==PaisesEnum.VAZIO ||  // -vencedor // paridaid-9
                partidas.get(1).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(1).addTimes(primeiraDoGrupoA, segundaDoGrupoB);
        
        if(partidas.get(2).getTime1().getPais()==PaisesEnum.VAZIO ||  //  vencedor //partidaId-10
                partidas.get(2).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(2).addTimes(primeiraDoGrupoB, segundaDoGrupoA);
        
        if(partidas.get(3).getTime1().getPais()==PaisesEnum.VAZIO || //  vencedor //partidaId-10
                partidas.get(3).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(3).addTimes(primeiraDoGrupoD, segundaDoGrupoC);
        
        if(partidas.get(4).getTime1().getPais()==PaisesEnum.VAZIO || //  vencedor //partidaId-11
                partidas.get(4).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(4).addTimes(primeiraDoGrupoE, segundaDoGrupoF);
        
        if(partidas.get(5).getTime1().getPais()==PaisesEnum.VAZIO || //  vencedor //partidaId-11
                partidas.get(5).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(5).addTimes(primeiraDoGrupoG, segundaDoGrupoH);
        
        if(partidas.get(6).getTime1().getPais()==PaisesEnum.VAZIO || //  vencedor //partidaId-12
                partidas.get(6).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(6).addTimes(primeiraDoGrupoF, segundaDoGrupoE);
        
        if(partidas.get(7).getTime1().getPais()==PaisesEnum.VAZIO || //  vencedor //partidaId-12
                partidas.get(7).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(7).addTimes(primeiraDoGrupoH, segundaDoGrupoG);
    }
    
    public void quartasDeFinal(){
        quartasFinal.add(partidas.get(0).getVencedor());
        quartasFinal.add(partidas.get(1).getVencedor());
        quartasFinal.add(partidas.get(2).getVencedor());
        quartasFinal.add(partidas.get(3).getVencedor());
        quartasFinal.add(partidas.get(4).getVencedor());
        quartasFinal.add(partidas.get(5).getVencedor());
        quartasFinal.add(partidas.get(6).getVencedor());
        quartasFinal.add(partidas.get(7).getVencedor());
        
        if(partidas.get(8).getTime1().getPais()==PaisesEnum.VAZIO || //9
                partidas.get(8).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(8).addTimes(quartasFinal.get(0), quartasFinal.get(1)); 
        
        if(partidas.get(9).getTime1().getPais()==PaisesEnum.VAZIO || //10
                partidas.get(9).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(9).addTimes(quartasFinal.get(4), quartasFinal.get(5));
        
        if(partidas.get(10).getTime1().getPais()==PaisesEnum.VAZIO || //11
                partidas.get(10).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(10).addTimes(quartasFinal.get(2), quartasFinal.get(3));
        
        if(partidas.get(11).getTime1().getPais()==PaisesEnum.VAZIO || //12
                partidas.get(11).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(11).addTimes(quartasFinal.get(6), quartasFinal.get(7));
        
    }
    
    public void semiFinal(){
        semiFinal.add(partidas.get(8).getVencedor());
        semiFinal.add(partidas.get(9).getVencedor());
        semiFinal.add(partidas.get(10).getVencedor());
        semiFinal.add(partidas.get(11).getVencedor());
        
        if(partidas.get(12).getTime1().getPais()==PaisesEnum.VAZIO || 
                partidas.get(12).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(12).addTimes(semiFinal.get(0), semiFinal.get(1));
        
        if(partidas.get(13).getTime1().getPais()==PaisesEnum.VAZIO || 
                partidas.get(13).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(13).addTimes(semiFinal.get(2), semiFinal.get(3));
        
    }
    
    public void Final(){
        finalFinal.add(partidas.get(12).getVencedor());
        finalFinal.add(partidas.get(13).getVencedor());
        
        if(partidas.get(14).getTime1().getPais()==PaisesEnum.VAZIO || 
                partidas.get(14).getTime2().getPais()==PaisesEnum.VAZIO)
        partidas.get(14).addTimes(finalFinal.get(0), finalFinal.get(1));
              
    }
    public void visualizar(){
        System.out.println("-----------------------------------------------------");
        System.out.println("OITAVAS DE FINAL");
        System.out.println("-----------------------------------------------------");
        partidas.get(0).descricao();
        System.out.println("");
        partidas.get(1).descricao();
        System.out.println("");
        partidas.get(2).descricao();
        System.out.println("");
        partidas.get(3).descricao();
        System.out.println("");
        partidas.get(4).descricao();
        System.out.println("");
        partidas.get(5).descricao();
        System.out.println("");
        partidas.get(6).descricao();
        System.out.println("");
        partidas.get(7).descricao();
        System.out.println("");
        
        if(partidas.get(7).getStatus()==1){ 
            System.out.println("-----------------------------------------------------");
            System.out.println("QUARTAS DE FINAL");
            System.out.println("-----------------------------------------------------");
            partidas.get(8).descricao();
            System.out.println("");
            partidas.get(9).descricao();
            System.out.println("");
            partidas.get(10).descricao();
            System.out.println("");
            partidas.get(11).descricao();
            System.out.println("");
        }
        
        if(partidas.get(11).getStatus()==1){
            System.out.println("-----------------------------------------------------");
            System.out.println("SEMIFINAL");
            System.out.println("-----------------------------------------------------");
            partidas.get(12).descricao();
            System.out.println("");
            partidas.get(13).descricao();
            System.out.println("");
        }
        
        if(partidas.get(13).getStatus()==1){
            System.out.println("-----------------------------------------------------");
            System.out.println("FINAL");
            System.out.println("-----------------------------------------------------");
            partidas.get(14).descricao();

        }
    }  
}
