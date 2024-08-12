package Empresa.ControleFuncionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Empresa.Entidades.Funcionario;

public class GerenciadorDeFuncionarios {
    Scanner sc = new Scanner(System.in);
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrarFuncionario() {
        System.out.print("Quantos funcionários serão cadastrados?: ");
        Integer n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionário nº " + i);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            sc.nextLine();

            Funcionario novoFuncionario = new Funcionario(nome, salario);
            funcionarios.add(novoFuncionario);

            System.out.println("Funcionário cadastrado com sucesso:");

        }
    }

    public void apagarFuncionario() {
        System.out.print("Informe o ID do funcionário que será apagado: ");
        Integer idRemover = sc.nextInt();
        sc.nextLine(); 

        boolean funcionarioRemovido = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(idRemover)) {
                funcionarios.remove(funcionario);
                System.out.println("Funcionário com ID " + funcionario.getId() + " removido com sucesso.");
                funcionarioRemovido = true;
                
            }
        }
        if (funcionarioRemovido == false) {
            System.out.println("Funcionário com ID " + idRemover + " não encontrado.");
        }
    }

    public void alterarSalario() {
        System.out.print("Informe o ID do funcionário cujo salário será alterado: ");
        Integer idAlterar = sc.nextInt();
        System.out.print("Insira a porcentagem: ");
        Double porcentagem = sc.nextDouble();
        sc.nextLine();

        if (porcentagem >= 1 ){
        boolean funcionarioEncontrado = false;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(idAlterar)) {
                Double aumento = funcionario.getSalario() * (porcentagem / 100);
                funcionario.setSalario(funcionario.getSalario() + aumento);
                System.out.println("Salário do funcionário com ID " + funcionario.getId() + " alterado.");
                funcionarioEncontrado = true;
              
            }
        }
        if (funcionarioEncontrado == false) {
            System.out.println("Funcionário com ID " + idAlterar + " não encontrado.");
        } 
    }else{
        System.out.println("Porcentagem invalida");
    }
        
    }

    public void exibirFuncionarios() {
        System.out.println("\nLista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }


}
