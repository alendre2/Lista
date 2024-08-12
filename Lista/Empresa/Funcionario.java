package Empresa;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salario;
    
    private static Integer novoID = 1;

    public Funcionario() {
    }

    public Funcionario( String nome, Double salario) {
        this.id = novoID++;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public  void cadastrarFuncionario( String nome, Double salario) {
        new Funcionario( nome, salario);
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Salário: R$ " + String.format("%.2f", getSalario()) + "\n";
    }

    

   

   

    
}
