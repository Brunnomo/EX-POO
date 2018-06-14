
package tabelacopa;


public enum PaisesEnum {

RUSSIA         ("        Rússia","Rússia        ", 1),
BRASIL         ("        Brasil","Brasil        ", 2),
IRA            ("           Irã","Irã           ", 3),
JAPAO          ("         Japão","Japão         ", 4),
MEXICO         ("        México","México        ", 5),
BELGICA        ("       Bélgica","Bélgica       ", 6),
COREIA_DO_SUL  (" Coreia do Sul","Coreia do Sul ", 7),
ARABIA_SAUDITA ("Arábia Saudita","Arábia Saudita", 8),
ALEMANHA       ("      Alemanha","Alemanha      ", 9),
INGLATERRA     ("    Inglaterra","Inglaterra    ", 10),
ESPANHA        ("       Espanha","Espanha       ", 11 ),
NIGERIA        ("       Nigéria","Nigéria       ", 12 ),
COSTA_RICA     ("    Costa Rica","Costa Rica    ", 13 ),
POLONIA        ("       Polônia","Polônia       ", 14 ),
EGITO          ("         Egito","Egito         ", 15 ),
ISLANDIA       ("      Islândia","Islândia      ", 16 ),
SERVIA         ("        Sérvia","Sérvia        ", 17 ),
FRANCA         ("        França","França        ", 18 ),
PORTUGAL       ("      Portugal","Portugal      ", 19 ),
ARGENTINA      ("     Argentina","Argentina     ", 20 ),
COLOMBIA       ("      Colômbia","Colômbia      ", 21 ),
URUGUAI        ("       Uruguai","Uruguai       ", 22 ),
PANAMA         ("        Panamá","Panamá        ", 23 ),
SENEGAL        ("       Senegal","Senegal       ", 24 ),
MARROCOS       ("      Marrocos","Marrocos      ", 25 ),
TUNISIA        ("       Tunísia","Tunísia       ", 26 ),
SUICA          ("         Suíça","Suíça         ", 27 ),
CROACIA        ("       Croácia","Croácia       ", 28 ),
SUECIA         ("        Suécia","Suécia        ", 29 ),
DINAMARCA      ("     Dinamarca","Dinamarca     ", 30 ),
AUSTRALIA      ("     Austrália","Austrália     ", 31 ),
PERU           ("          Peru","Peru          ", 32 ),
VAZIO          ("         VAZIO","VAZIO         ",999);

private final String nome;
private final String nomeEsq;
private int ordemDeClassificacao;

    PaisesEnum(String nome,String nomeGrupo,int ordemDeClassificacao){
        this.nome = nome;
        this.nomeEsq = nomeGrupo;
        this.ordemDeClassificacao=ordemDeClassificacao;
    }

    public String getNomeEsq() {
        return nomeEsq;
    }
    
    public String getNome() {
        return nome;
    }

    public int getOrdemDeClassificacao() {
        return ordemDeClassificacao;
    }
    
    public static PaisesEnum PaisesEnumById(int id){
        if(id==1)
            return PaisesEnum.RUSSIA;
        if(id==2)
            return PaisesEnum.BRASIL;
        if(id==3)
            return PaisesEnum.IRA;
        if(id==4)
            return PaisesEnum.JAPAO;
        if(id==5)
            return PaisesEnum.MEXICO;
        if(id==6)
            return PaisesEnum.BELGICA;
        if(id==7)
            return PaisesEnum.COREIA_DO_SUL;
        if(id==8)
            return PaisesEnum.ARABIA_SAUDITA;
        if(id==9)
            return PaisesEnum.ALEMANHA;
        if(id==10)
            return PaisesEnum.INGLATERRA;
        if(id==11)
            return PaisesEnum.ESPANHA;
        if(id==12)
            return PaisesEnum.NIGERIA;
        if(id==13)
            return PaisesEnum.COSTA_RICA;
        if(id==14)
            return PaisesEnum.POLONIA;
        if(id==15)
            return PaisesEnum.EGITO;
        if(id==16)
            return PaisesEnum.ISLANDIA;
        if(id==17)
            return PaisesEnum.SERVIA;
        if(id==18)
            return PaisesEnum.FRANCA;
        if(id==19)
            return PaisesEnum.PORTUGAL;
        if(id==20)
            return PaisesEnum.ARGENTINA;
        if(id==21)
            return PaisesEnum.COLOMBIA;
        if(id==22)
            return PaisesEnum.URUGUAI;
        if(id==23)
            return PaisesEnum.PANAMA;
        if(id==24)
            return PaisesEnum.SENEGAL;
        if(id==25)
            return PaisesEnum.MARROCOS;
        if(id==26)
            return PaisesEnum.TUNISIA;
        if(id==27)
            return PaisesEnum.SUICA;
        if(id==28)
            return PaisesEnum.CROACIA;
        if(id==29)
            return PaisesEnum.SUECIA;
        if(id==30)
            return PaisesEnum.DINAMARCA;
        if(id==31)
            return PaisesEnum.AUSTRALIA;
        if(id==32)
            return PaisesEnum.PERU;
    return null;
    }
}
