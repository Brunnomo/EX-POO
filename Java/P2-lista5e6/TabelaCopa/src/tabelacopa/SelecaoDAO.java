
package tabelacopa;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SelecaoDAO {
    
    private Connection conn;

    public SelecaoDAO() throws SQLException, ClassNotFoundException {
        conn =  ConnectionFactory.getConnection();
    }
    
    public void updateSelecao(Selecao selecao) throws SQLException{
        String sql = "UPDATE Selecao SET pontos = ?, empates = ?, jogos = ?, vitoria = ?, derrota = ?, "
                + "saldogols = ?, golssofridos = ?, golsmarcados = ? WHERE selecaoid = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, selecao.getPontos());
        ps.setInt(2, selecao.getEmpates());
        ps.setInt(3, selecao.getJogos());
        ps.setInt(4, selecao.getVitoria());
        ps.setInt(5, selecao.getDerrota());
        ps.setInt(6, selecao.getSaldoGols());
        ps.setInt(7, selecao.getGolsSofridos());
        ps.setInt(8, selecao.getGolsMarcados());
        ps.setInt(9, selecao.getSelecaoId());
        ps.execute();
    }
    
    public void updateListSelecao(ArrayList<Selecao> selecoes) throws SQLException{
        for(Selecao selecao:selecoes){
            this.updateSelecao(selecao);
        }
    }
    
    public Selecao getSelecaoBySelecaoId(int selecaoId) throws SQLException{ //mudarparaselecao
        Selecao selecao = null;
        
        String sql = "select * from selecao where selecaoid = ?";
        
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, selecaoId);
        
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            selecao = new Selecao(rs.getInt("selecaoid"),
                    PaisesEnum.PaisesEnumById(rs.getInt("selecaoid")),
                        rs.getInt("pontos"),
                            rs.getInt("empates"),
                                rs.getInt("jogos"),
                                    rs.getInt("vitoria"),
                                        rs.getInt("derrota"),
                                            rs.getInt("saldogols"),
                                                rs.getInt("golssofridos"),
                                                    rs.getInt("golsmarcados"));
        }
        return selecao;
    }
    public ArrayList<Selecao> getListSelecao() throws SQLException{
        ArrayList<Selecao> selecoes = new ArrayList();
        for(int i=1;i<33;i++){
            selecoes.add(this.getSelecaoBySelecaoId(i));
        }
        return selecoes;
    }
}