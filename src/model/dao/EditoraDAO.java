    
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Editora;


public class EditoraDAO {
    
    public void create(Editora novo){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO editora(idDoEditora, editoraNome, cidadeOrigem) VALUES (?, ?, ?)");
            stmt.setInt(1, novo.getId());
            stmt.setString(2, novo.getNome());   
            stmt.setString(3, novo.getCidadeOrigem());  
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar inserir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Editora> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Editora> vetorEditora = new ArrayList();
        try{
            stmt = con.prepareStatement("SELECT * FROM editora");
            rs = stmt.executeQuery();
            
            while(rs.next()){
               int id = rs.getInt(1);
               String nome = rs.getString(2);
               String cidadeOrigem = rs.getString(3);
               
               Editora editora = new Editora(id, nome, cidadeOrigem);
               vetorEditora.add(editora);
            }  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar exibir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return vetorEditora;
    }
}
