
package tabelacopa;

public class Selecao {
    private int selecaoId;
    private PaisesEnum pais;
    private int pontos;
    private int empates;
    private int jogos;
    private int vitoria;
    private int derrota;
    private int saldoGols;
    private int golsSofridos;
    private int golsMarcados;

    public Selecao(int selecaoId, PaisesEnum pais, int pontos, int empates, int jogos, 
            int vitoria, int derrota, int saldoGols, int golsSofridos, int golsMarcados) {
        
        this.selecaoId = selecaoId;
        this.pais = pais;
        this.pontos = pontos;
        this.empates = empates;
        this.jogos = jogos;
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.saldoGols = saldoGols;
        this.golsSofridos = golsSofridos;
        this.golsMarcados = golsMarcados;
    }

    public int getSelecaoId() {
        return selecaoId;
    }
    
    public int getPontos() {
        return pontos;
    }

    public PaisesEnum getPais() {
        return pais;
    }

    public int getJogos() {
        return jogos;
    }

    public int getVitoria() {
        return vitoria;
    }

    public int getDerrota() {
        return derrota;
    }
    
    public int getEmpates() {
        return empates;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public int getGolsSofridos() {
        return golsSofridos;
    }

    public int getGolsMarcados() {
        return golsMarcados;
    }

    private void addVitoria() {
        this.vitoria++;
        this.jogos++;
        this.pontos = this.pontos+3;
    }
    
     private void addEmpates() {
        this.empates++;
        this.jogos++;
        this.pontos = this.pontos+1;
    }

    private void addDerrota() {
        this.derrota++;
        this.jogos++;
    }

    public void addGolsSofridos(int gols) {
        this.golsSofridos = this.golsSofridos + gols;
        this.saldoGols = this.saldoGols - gols;
    }

    public void addGolsMarcados(int gols) {
        this.golsMarcados = this.golsMarcados + gols;
        this.saldoGols = this.saldoGols + gols;
    }
    
    public void realizarPartida(int golsMarcados, int golsSofridos){
        this.addGolsMarcados(golsMarcados);
        this.addGolsSofridos(golsSofridos);
        if(golsMarcados>golsSofridos){
            this.addVitoria();
        }
        if(golsMarcados==golsSofridos){
            this.addEmpates();
        }    
        if(golsMarcados<golsSofridos){
            this.addDerrota();
        }
    }
    
    public void exibirSelecao(){
        System.out.print(this.pais.getNomeEsq());
        System.out.printf("\t");
        System.out.println(" "
                + this.pontos + "  | "
                    + this.jogos + "  | "
                        + this.vitoria + "  | "
                            + this.empates + "  | "
                                + this.derrota + "  | "
                                    + this.golsMarcados + "  | "
                                        + this.golsSofridos + "  | "
                                            + this.saldoGols + "  | ");
    }
}
