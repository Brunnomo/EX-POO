
package pooex2;

public class Lampada {
    
    //atributos
    private boolean estado ;
    private int maxClicks;
    private int cont;

    //Metodo Construtor
    public Lampada(int maxClicks) {
        this.estado = false;
        this.maxClicks = maxClicks ;
        this.cont = 0;
    }
    
    public void interruptorClick(){
        if(this.isEstado()==false && this.maxClicks > this.cont){
            this.setEstado(true);
            System.out.println("Lâmpada ligada...\n");
        }else if(this.isEstado()==true&& this.maxClicks > this.cont){
            this.setEstado(false);
            this.setCont(cont+1);
            System.out.println("Lâmpada desligada...\n");
        }else if(this.maxClicks==this.cont){
            System.out.println("\nLâmpada queimada\n");                
        }
    }   
    //gets e sets
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getMaxClicks() {
        return maxClicks;
    }

    public void setMaxClicks(int maxClicks) {
        this.maxClicks = maxClicks;
    }
        public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
}
