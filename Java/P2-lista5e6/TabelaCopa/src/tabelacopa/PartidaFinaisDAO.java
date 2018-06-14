
package tabelacopa;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PartidaFinaisDAO {

    private Connection conn;

    public PartidaFinaisDAO() throws SQLException, ClassNotFoundException {
        conn = ConnectionFactory.getConnection(); 
    }
    
    public void updatePartidaFinais(Partida partida) throws SQLException{
        String sql = "UPDATE partidafinais SET selecao1id = ?, selecao2id = ?, golsselecao1 = ?, golsselecao2 = ?, status = ? WHERE partidaid = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, partida.getTime1().getSelecaoId());
        ps.setInt(2, partida.getTime2().getSelecaoId());
        ps.setInt(3, partida.getGolsTime1());
        ps.setInt(4, partida.getGolsTime2());
        ps.setInt(5, partida.getStatus());
        ps.setInt(6, partida.getPartidaId());
        ps.execute();   
    }
    
    public void updateListPartidaFinais(ArrayList<Partida> partidas) throws SQLException{
        for(Partida p:partidas){
            updatePartidaFinais(p);
        }
    }
    
    public Partida getPartidaFinais(int partidaId,ArrayList<Selecao> selecoes) throws SQLException{
        Partida partida = null;
        String sql = "Select * from partidafinais where partidaid = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, partidaId);
        
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            partida = new Partida(rs.getInt("partidaId"),
                    getSelecaoById(selecoes,rs.getInt("selecao1id")),
                        getSelecaoById(selecoes,rs.getInt("selecao2id")),
                            rs.getDate("datapartida"),
                                rs.getInt("golsselecao1"),
                                    rs.getInt("golsselecao2"),
                                        rs.getInt("status"));
        }
        return partida;
    }
    
    private Selecao getSelecaoById(ArrayList<Selecao> selecoes, int selecaoId){
        Selecao selecao = null;
        for(int i=0;i<selecoes.size();i++){
            selecao = selecoes.get(i);
            if(selecao.getSelecaoId()==selecaoId)
                break;
            else{
                selecao = new Selecao(999,PaisesEnum.VAZIO,0,0,0,0,0,0,0,0);
            }
        }
        return selecao;
    }
    
    public ArrayList<Partida> getListPartidaFinais(ArrayList<Selecao> selecoes) throws SQLException{
        ArrayList<Partida> partidas = new ArrayList();
        for(int i=1;i<16;i++){
            partidas.add(getPartidaFinais(i,selecoes));
        }
        return partidas;
    }
}
