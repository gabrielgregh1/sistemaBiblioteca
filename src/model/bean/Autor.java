
package model.bean;


public class Autor {
    private int id;
    private String nome;
    private String sobrenome;

    public Autor(int id) {
        this.id = id;
    }
     public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public Autor(int id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    
    
}
