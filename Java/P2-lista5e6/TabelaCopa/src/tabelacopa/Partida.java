
package tabelacopa;

import java.util.Date;

public class Partida {
    private int partidaId;
    private Selecao time1;
    private Selecao time2;
    private Date data;
    private int golsTime1;
    private int golsTime2;
    private int status;

    public Partida(int partidaId, Selecao time1, Selecao time2, Date data, int golsTime1, int golsTime2, int status) {
        this.partidaId = partidaId;
        this.time1 = time1;
        this.time2 = time2;
        this.data = data;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
        this.status = status;
    }
    
    public void addTimes(Selecao time1, Selecao time2){
        this.time1=time1;
        this.time2=time2;
    }

    public int getPartidaId() {
        return partidaId;
    }

    public int getGolsTime1() {
        return golsTime1;
    }

    public int getGolsTime2() {
        return golsTime2;
    }

    public int getStatus() {
        return status;
    }

    public Selecao getTime1() {
        return time1;
    }

    public Selecao getTime2() {
        return time2;
    }
       
    public void addResultado(int golsTime1,int golsTime2){
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
        this.time1.realizarPartida(golsTime1, golsTime2);
        this.time2.realizarPartida(golsTime2, golsTime1);
        this.status = PartidaStatusEnum.REALIZADA.getStatus();
    }
    
    public void descricao(){
        System.out.println(this.data);
        System.out.println(this.time1.getPais().getNomeEsq()+" "+this.golsTime1+" X "+
                this.golsTime2+" "+this.time2.getPais().getNome() + "\t" + PartidaStatusEnum.getDescricao(this.status));
    }
    
    public Selecao getVencedor(){
        if(golsTime1>golsTime2){
            return time1;
        }else
        if(golsTime1<golsTime2){
            return time2;
        }else{
            return null;
        }       
    }
    
    public Selecao getPerdedor(){
        if(golsTime1>golsTime2){
            return time2;
        }else
        if(golsTime1<golsTime2){
            return time1;
        }else{
            return null;
        }       
    }
}
