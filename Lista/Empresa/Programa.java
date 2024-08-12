package Empresa;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciadorDeFuncionarios gerenciador = new GerenciadorDeFuncionarios();
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
                    gerenciador.cadastrarFuncionario();
                    break;

                case 2:
                    gerenciador.apagarFuncionario();
                    break;

                case 3:
                    gerenciador.alterarSalario();
                    break;

                case 4:
                
                    gerenciador.exibirFuncionarios();
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
