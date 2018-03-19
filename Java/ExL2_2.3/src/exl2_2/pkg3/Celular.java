
package exl2_2.pkg3;

public class Celular {
    
    private int identificador;
    private String nomeUsuario;
    private Bateria bateria;
    private boolean estado;

    public Celular(int identificador, String nomeUsuario, Bateria bateria){
        this.identificador = identificador;
        this.nomeUsuario = nomeUsuario;
        this.bateria = bateria;
        this.estado = false;
    }
    
    public void ligar(){
        if(this.estado == false){
            if(bateria.getCarga()>20){
            System.out.println("Bem vindo " + this.nomeUsuario);
            }else if(this.bateria.getCarga()<20 && this.bateria.getCarga()>0){
            System.out.println("Bateria Fraca");
            }
            this.setEstado(true);
            bateria.descarregar();
            bateria.descarregar();
        }    
    }
    
    public void desligar(){
        if(this.estado == true){
            System.out.println("Ate Logo!");
            bateria.descarregar();
            this.setEstado(false);
        }
    }
    
    public void tocarSom(){
        if(this.estado=true && bateria.getCarga()>=10){
            System.out.println("Tocando Som!!!!");
        }
    }
    
    public void trocarBateria(Bateria bateria){
        this.bateria = bateria;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }


    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    public void mostraCarga(){
        this.bateria.mostraCarga();
    }
    
}
