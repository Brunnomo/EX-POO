
package l4_ex1.pkg3;

public enum ImpostoEnum {
    IPI("IPI",5), ICMS("ICMS",10);
        
    private final int valor;
    private final String nome;  
    
    ImpostoEnum(String nome,int valor){
        this.valor=valor;
        this.nome=nome;
    }
    
    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
              
}
