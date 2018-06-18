

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
import model.bean.Editora;
import model.bean.Livro;


public class LivroDAO {
    
     public void create(Livro livroNovo){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO livro(isbr, titulo, qtdExemplares, idAutor, idEditora) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, livroNovo.getIsbr());
            stmt.setString(2, livroNovo.getTitulo()); 
            stmt.setInt(3, livroNovo.getQtdExemplares()); 
            stmt.setInt(4, livroNovo.getAutor().getId()); 
            stmt.setInt(5, livroNovo.getEditora().getId()); 
            
            stmt.executeUpdate();
                     
            JOptionPane.showMessageDialog(null, "Cadastro Efetuado com Sucesso.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar inserir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Livro> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Livro> vetorLivro = new ArrayList();
        try{
            stmt = con.prepareStatement("SELECT isbr, titulo, qtdExemplares, autorNome, sobrenome, editoraNome, cidadeOrigem FROM livro, autor, editora " +
                                        "WHERE idAutor = idDoAutor and idEditora = idDoEditora");
            rs = stmt.executeQuery();
            
            while(rs.next()){
               String isbr = rs.getString(1);
               String titulo = rs.getString(2);
               int quantidade = rs.getInt(3);
               String nomeAutor = rs.getString(4);
               String sobrenome = rs.getString(5);
               String nomeEditora = rs.getString(6);
               String cidadeOrigem = rs.getString(7);
               
               Autor autor = new Autor(nomeAutor, sobrenome);
               Editora editora = new Editora(nomeEditora, cidadeOrigem);
               Livro livro = new Livro(titulo, isbr, quantidade, autor, editora);
               
               vetorLivro.add(livro);
            }  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar exibir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return vetorLivro;
    }
    
    public List<Livro> readBook(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Livro> vetorLivro = new ArrayList();
        try{
            stmt = con.prepareStatement("SELECT titulo, isbr FROM livro");
            rs = stmt.executeQuery();
            
            while(rs.next()){
               String titulo = rs.getString("titulo");
               String isbr = rs.getString("isbr");
               
               Livro livro = new Livro(titulo, isbr);
               
               vetorLivro.add(livro);
            }  
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Houve um erro ao tentar exibir os dados.");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return vetorLivro;
    }
}
