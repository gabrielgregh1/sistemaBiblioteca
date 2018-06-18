
package model.bean;


public class Editora {
    private int id;
    private String nome;
    private String cidadeOrigem;

    public Editora(int id) {
        this.id = id;
    }
    public Editora(String nome, String cidadeOrigem) {
        this.nome = nome;
        this.cidadeOrigem = cidadeOrigem;
    }
    public Editora(int id, String nome, String cidadeOrigem) {
        this.id = id;
        this.nome = nome;
        this.cidadeOrigem = cidadeOrigem;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }
    
    
}
