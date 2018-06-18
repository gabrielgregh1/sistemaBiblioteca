
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Autor;


public class AutorDAO {
    
    public void create(Autor novo){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO autor(idDoAutor, autorNome, sobrenome) VALUES (?, ?, ?)");
            stmt.setInt(1, novo.getId());
            stmt.setString(2, novo.getNome());   
            stmt.setString(3, novo.getSobrenome()); 
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar inserir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Autor> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Autor> vetorAutores = new ArrayList();
        try{
            stmt = con.prepareStatement("SELECT * FROM autor");
            rs = stmt.executeQuery();
            
            while(rs.next()){
               int id = rs.getInt(1);
               String nome = rs.getString(2);
               String sobrenome = rs.getString(3);
               
               Autor autor = new Autor(id, nome, sobrenome);
               vetorAutores.add(autor);
            }  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar exibir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return vetorAutores;
    }
}
