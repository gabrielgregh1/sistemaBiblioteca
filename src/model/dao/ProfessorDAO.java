
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Professor;


public class ProfessorDAO {
    
    public void create(Professor novo){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO professor(codigo, nome, titulacao) VALUES (?, ?, ?)");
            stmt.setInt(1, novo.getCodigo());
            stmt.setString(2, novo.getNome());
            stmt.setString(3, novo.getTitulacao());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Professor Inserido com Sucesso");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir professor");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
 
    public List<Professor> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Professor> vetorProfessor = new ArrayList();
        try{
            stmt = con.prepareStatement("SELECT * FROM professor");
            rs = stmt.executeQuery();
            
            while(rs.next()){
               int codigo = rs.getInt(1);
               String nome = rs.getString(2);
               String titulacao = rs.getString(3);
               
               Professor prof = new Professor(nome, titulacao, codigo);
               vetorProfessor.add(prof);
            }  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar exibir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return vetorProfessor;
    }
    
    
}
