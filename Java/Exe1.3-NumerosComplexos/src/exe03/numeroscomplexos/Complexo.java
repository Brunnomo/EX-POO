/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe03.numeroscomplexos;

public class Complexo {
    //Atributos
    private double a;  //Parte real
    private double b;  //parte imaginaria
    
    //Metodos
    public Complexo(double a, double b) { //Construtor
        this.a = a;
        this.b = b;
    }
    public Complexo Soma(Complexo complexo){
        this.setA(a+complexo.a);
        this.setB(b+complexo.b);
        return(this);
    }
    public Complexo multiplica(Complexo complexo){
        
    )

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    
    
}
