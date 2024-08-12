package Empresa;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n========== Menu ==========");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Apagar Funcionário");
            System.out.println("3. Alterar Salário");
            System.out.println("4. Lista de Funcionário");
            System.out.println("5. Sair");
            System.out.println("==========================");
            System.out.print("Digite uma opção: ");
            Integer opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
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

                        funcionario.cadastrarFuncionario( nome, salario);

                    }
                    break;

                case 2:
                    System.out.print("Informe o ID do funcionário que será apagado: ");
                    Integer idRemover = sc.nextInt();
                    sc.nextLine(); 
                    boolean removido = funcionario.apagarFuncionario(idRemover);
                    if (removido == true) {
                        System.out.println("Funcionário com ID " + idRemover + " removido com sucesso.");
                    }else{
                        System.out.println("Funcionário com ID " + idRemover + " invalido.");

                    }
                    break;

                case 3:
                    System.out.print("Informe o ID do funcionário cujo salário será alterado: ");
                    Integer idAlterar = sc.nextInt();
                    System.out.print("Insira a porcentagem: ");
                    Double porcentagem = sc.nextDouble();
                    sc.nextLine();
                    boolean alterado = funcionario.alterarSalario(idAlterar, porcentagem);
                    if (alterado == false) {
                        System.out.println("Funcionário com ID " + idAlterar + " não encontrado.");
                    } else {
                        System.out.println("Salário do funcionário com ID " + idAlterar + " alterado.");
                    }
                    break;

                case 4:
                
                    funcionario.exibirFuncionarios();
                    break;

                case 5:
                    System.out.println("Programa Finalizado");
                    continuar = false;
                    break;

                default:
                    System.out.println("Número inválido! Tente novamente.");
                    break;
            }
        }


        sc.close();
    }
}
