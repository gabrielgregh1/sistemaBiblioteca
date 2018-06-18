
package model.bean;


public class Professor {
    
    private String nome;
    private String titulacao;
    private int codigo;

    public Professor() {}
    
    public Professor(String nome, String titulacao, int codigo) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public int getCodigo() {
        return codigo;
    }
    
    
    
}
