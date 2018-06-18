
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Aluno;


public class AlunoDAO {
    
    public void create(Aluno novo){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO aluno(ra,nome) VALUES (?, ?)");
            stmt.setInt(1, novo.getRa());
            stmt.setString(2, novo.getNome());   
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar inserir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Aluno> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Aluno> vetorAlunos = new ArrayList();
        try{
            stmt = con.prepareStatement("SELECT * FROM aluno");
            rs = stmt.executeQuery();
            
            while(rs.next()){
               int ra = rs.getInt(1);
               String nome = rs.getString(2);
               
               Aluno aluno = new Aluno(nome, ra);
               vetorAlunos.add(aluno);
            }  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar exibir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return vetorAlunos;
    }
    
    
}
