package Empresa;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salario;

    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static Integer novoID = 1;

    public Funcionario() {
    }

    public Funcionario( String nome, Double salario) {
        this.id = novoID++;
        this.nome = nome;
        this.salario = salario;
        funcionarios.add(this);
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

     public  boolean apagarFuncionario(Integer id) {
        for(Funcionario funcionario: funcionarios){
            if(funcionario.getId().equals(id)){
                funcionarios.remove(funcionario);
                return true;
            }
        }
        return false;
    }

     public  boolean alterarSalario(Integer id, Double porcentagem) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(id)) {
                Double aumento = funcionario.getSalario() * (porcentagem/100);
                funcionario.setSalario(funcionario.getSalario() + aumento);
                return true;
            }
        }
        return false;
    }

    public  void exibirFuncionarios() {
        System.out.println("\nLista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }


    @Override
    public String toString() {
        return "ID: " + getId() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Salário: R$ " + String.format("%.2f", getSalario()) + "\n";
    }

    

   

   

    
}
