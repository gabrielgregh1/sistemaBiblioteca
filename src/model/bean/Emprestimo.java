
package model.bean;
  

public class Emprestimo {
    
    private String responsavel;
    private String cargoResponsavel;
    private String status;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;
    private int id;
    public Emprestimo() {}

    public Emprestimo(int id, String responsavel, String status, String dataEmprestimo, String dataDevolucao,String cargoResponsavel, Livro livro) {
        this.id = id;
        this.responsavel = responsavel;
        this.status = status;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.cargoResponsavel = cargoResponsavel;
        this.livro = livro;
    }
 public Emprestimo(String responsavel, String status, String dataEmprestimo, String dataDevolucao,String cargoResponsavel, Livro livro) {
        this.responsavel = responsavel;
        this.status = status;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.cargoResponsavel = cargoResponsavel;
        this.livro = livro;
    }
    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    
    public String getCargoResponsavel() {
        return cargoResponsavel;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getStatus() {
        return status;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }
    
}
