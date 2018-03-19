
package exl2_2.pkg3;

public class Bateria {
    private int carga;
    private int cargaMax;
    private int cargaMin;
    
    public Bateria(){
	this.carga = 25;
	this.cargaMax = 100;
	this.cargaMin = 0;
	}

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getCargaMin() {
        return cargaMin;
    }

    public void setCargaMin(int cargaMin) {
        this.cargaMin = cargaMin;
    }
    
    public void carregar(){
        if(this.carga >= this.cargaMin && this.carga<=this.cargaMax){
	this.setCarga(this.carga+5);
	}
    }
	
    public void descarregar(){
	if(this.carga>=this.cargaMin && this.carga<=this.cargaMax){
	this.setCarga(this.carga-10);
	}
        if(this.carga<0){
            this.setCarga(0);
        }
    }
    
    public void mostraCarga(){
        System.out.println("Bateria com " + this.getCarga() + "%"); //esse Metodo exibe na tela a Carga da Bateria.
    }
}
