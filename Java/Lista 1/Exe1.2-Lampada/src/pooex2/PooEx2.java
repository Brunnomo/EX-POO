
package pooex2;

public class PooEx2 {


    public static void main(String[] args) {
        Lampada l1 = new Lampada(2);
        l1.interruptorClick();
        l1.interruptorClick();
        System.out.println(l1.getCont());
        
        l1.interruptorClick();
        l1.interruptorClick();
        System.out.println(l1.getCont());
        
        l1.interruptorClick();
    }
    
}
