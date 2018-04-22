
public class Estrela {
    
    private String nome;
    private Double temperatura;
    private String cor;

    public Estrela(String nome, Double temperatura, String cor) {
        this.nome = nome;
        this.temperatura = temperatura;
        this.cor = cor;
    }
    
    public void mostar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Temperatura: " + this.temperatura+"C");
        System.out.println("Cor: " + this.cor);    
    } 

    public Double getTemperatura() {
        return temperatura;
    }
     
}
