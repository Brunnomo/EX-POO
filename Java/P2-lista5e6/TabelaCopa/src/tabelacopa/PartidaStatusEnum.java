
package tabelacopa;

public enum PartidaStatusEnum {
    
    REALIZADA( 1 , "Realizada" ),
    NAO_REALIZADA( 2 , "Não Realizada" );
    
    private int status;
    private String descricao;

    private PartidaStatusEnum(int status, String descricao) {
        this.status = status;
        this.descricao = descricao;
    }
    
    public int getStatus() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public static String getDescricao(int status){
        return status == 1 ? PartidaStatusEnum.REALIZADA.getDescricao() : PartidaStatusEnum.NAO_REALIZADA.getDescricao();
    }
}
