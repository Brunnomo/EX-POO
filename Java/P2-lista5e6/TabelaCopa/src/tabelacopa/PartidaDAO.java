
package tabelacopa;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PartidaDAO {
    
    private Connection conn;

    public PartidaDAO()throws SQLException, ClassNotFoundException{
        conn = ConnectionFactory.getConnection();
    }
    
    public void updatePartidaGrupo(Partida partida) throws SQLException{
        String sql = "UPDATE partidaGrupo SET golsselecao1 = ?, golsselecao2 = ?, status = ? WHERE partidaid = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, partida.getGolsTime1());
        ps.setInt(2, partida.getGolsTime2());
        ps.setInt(3, partida.getStatus());
        ps.setInt(4, partida.getPartidaId());
        ps.execute();   
    }
    
    public void updateListPartidaGrupo(ArrayList<Partida> partidas) throws SQLException{
        for(Partida partida : partidas){
            this.updatePartidaGrupo(partida);
        }
    }
    
    public Partida getPartida(int partidaId,ArrayList<Selecao> selecoes) throws SQLException{
        Partida partida = null;
        String sql = "Select * from partidagrupo where partidaid = ?";
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
        }
        return selecao;
    }
    
    public ArrayList<Partida> getListPartida(ArrayList<Selecao> selecoes) throws SQLException{
        ArrayList<Partida> partidas = new ArrayList();
        for(int i=1;i<49;i++){
            partidas.add(getPartida(i,selecoes));
        }
        return partidas;
    }
}
