
package exl2_2.pkg3;

public class ExL2_23 {

    public static void main(String[] args) {
        Bateria b1 = new Bateria(); //essa linha instancia um novo objeto Bateria com o nome de b1.
        Bateria b2 = new Bateria(); //essa linha instancia um novo objeto Bateria com o nome de b2.
        
        Celular c1 = new Celular(0001, "Alexsandro Neri", b1); ////essa linha instancia um novo objeto Celular com o nome de c1.
        
        c1.desligar();
        
        
        c1.ligar(); //liga o Celular c1
        c1.mostraCarga();// mostra a carga da batria (b1 que esta no celular)
        
        c1.tocarSom();
        b2.carregar();
        b2.carregar();
        b2.carregar();
        b2.carregar();
        
        c1.trocarBateria(b2);//troca a bateria b1 pela b2, agora o metodo tocarSom funciona 
        
        c1.mostraCarga();
        c1.tocarSom();
        c1.desligar();
    }
    
}
