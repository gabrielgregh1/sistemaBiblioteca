
package model.bean;


public class Livro {
    
    private String titulo;
    private String isbr;
    private int qtdExemplares;
    private Autor autor;
    private Editora editora;

    public Livro(String titulo) {
        this.titulo = titulo;
    } 
    public Livro() {}
    public Livro(String titulo, String isbr) {
        this.titulo = titulo;
        this.isbr = isbr;
    }  
    
    public Livro(String titulo, String isbr, int qtdExemplares, Autor autor, Editora editora) {
        this.titulo = titulo;
        this.isbr = isbr;
        this.qtdExemplares = qtdExemplares;
        this.autor = autor;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbr() {
        return isbr;
    }

    public int getQtdExemplares() {
        return qtdExemplares;
    }

    public Autor getAutor() {
        return autor;
    }

    public Editora getEditora() {
        return editora;
    }
    
    
    
}
