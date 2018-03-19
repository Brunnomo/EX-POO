
package exl2_2.pkg4;

public class Loja {
    
    Livro epub = new Livro("EPUB", 20.00);
    Livro pdf = new Livro("PDF", 40.00);
    Livro fisico = new Livro("Fisico", 80.00);
    int qtdEpub, qtdPdf, qtdFisico;

    public Loja(int qtdEpub, int qtdPdf, int qtdFisico) {
        this.qtdEpub = qtdEpub;
        this.qtdPdf = qtdPdf;
        this.qtdFisico = qtdFisico;
    }
    
    public void venderEpub(){
        if(this.qtdEpub>0){
            System.out.println("Livro Vendido");
            this.setQtdEpub(qtdEpub-1);
        }
    }
    
    public void venderPdf(){
        if(this.qtdPdf>0){
            System.out.println("Livro Vendido");
            this.setQtdPdf(qtdPdf-1);
        }
    }
    
    public void venderFisico(){
        if(this.qtdFisico>0){
            System.out.println("Livro Vendido");
            this.setQtdFisico(qtdFisico-1);
        }
    }
    
    public void exibirInfoProd(){
        if(this.qtdEpub>0){
            System.out.println(this.qtdEpub + "x uni---------------------");
            epub.exibirInfoLivro();
            System.out.println("");
        }
        if(this.qtdPdf>0){
            System.out.println(this.qtdPdf+"x uni---------------------");
            pdf.exibirInfoLivro();
            System.out.println("");
        }
        if(this.qtdFisico>0){
            System.out.println(this.qtdFisico+"x uni---------------------");
            fisico.exibirInfoLivro();
            System.out.println("");
        }
    }

    public Livro getEpub() {
        return epub;
    }

    public void setEpub(Livro epub) {
        this.epub = epub;
    }

    public Livro getPdf() {
        return pdf;
    }

    public void setPdf(Livro pdf) {
        this.pdf = pdf;
    }

    public Livro getFisico() {
        return fisico;
    }

    public void setFisico(Livro fisico) {
        this.fisico = fisico;
    }

    public int getQtdEpub() {
        return qtdEpub;
    }

    public void setQtdEpub(int qtdEpub) {
        this.qtdEpub = qtdEpub;
    }

    public int getQtdPdf() {
        return qtdPdf;
    }

    public void setQtdPdf(int qtdPdf) {
        this.qtdPdf = qtdPdf;
    }

    public int getQtdFisico() {
        return qtdFisico;
    }

    public void setQtdFisico(int qtdFisico) {
        this.qtdFisico = qtdFisico;
    }
    
    

}
