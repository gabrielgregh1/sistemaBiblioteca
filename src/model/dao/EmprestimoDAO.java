
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Emprestimo;
import model.bean.Livro;


public class EmprestimoDAO {
    
    public void create(Emprestimo novo){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            if(controleEmprestimo(novo)){                   
                stmt = con.prepareStatement("INSERT INTO emprestimo(id, responsavel, cargoResponsavel,dataEmprestimo, dataDevolucao, statusLivro, livro) VALUES (DEFAULT, ?, ?, ?, ?, ?, ?)");
                
                stmt.setString(1, novo.getResponsavel());
                stmt.setString(2, novo.getCargoResponsavel());            
                stmt.setString(3, novo.getDataEmprestimo());   
                stmt.setString(4, novo.getDataDevolucao()); 
                stmt.setString(5, novo.getStatus());  
                stmt.setString(6, novo.getLivro().getIsbr());  
            
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso.");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar inserir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Emprestimo> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Emprestimo> vetorEmprestimo = new ArrayList();
        try{
            stmt = con.prepareStatement("SELECT id, responsavel, cargoResponsavel, dataEmprestimo, dataDevolucao, statusLivro, titulo FROM emprestimo, livro"
                    + "                 WHERE livro = isbr");
            rs = stmt.executeQuery();
            Livro livro;
            
            while(rs.next()){
               int id = rs.getInt(1);
               String responsavel = rs.getString(2);
               String cargo = rs.getString(3);
               String dataEmprestimo = rs.getString(4);
               String dataDevolucao = rs.getString(5);
               String statusLivro = rs.getString(6);
               String titulo = rs.getString(7);
               livro = new Livro(titulo);
               Emprestimo emprestimo = new Emprestimo(id, responsavel, statusLivro, dataEmprestimo, dataDevolucao, cargo, livro);
               vetorEmprestimo.add(emprestimo);
            }  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar exibir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return vetorEmprestimo;
    } 
    
    public boolean controleEmprestimo(Emprestimo emp){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
    try{
            stmt = con.prepareStatement("UPDATE livro SET qtdExemplares = qtdExemplares - 1 WHERE isbr = ?");
            stmt.setString(1, emp.getLivro().getIsbr());
            
            if(stmt.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Livro Emprestado com Sucesso");
                ConnectionFactory.closeConnection(con, stmt);
                return true; 
            }
            JOptionPane.showMessageDialog(null, "Livro Invalido");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar exibir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    return false;
    }
}
