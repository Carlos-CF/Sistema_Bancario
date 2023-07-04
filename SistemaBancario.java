
import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome =  "Carlos Fernandes";
        String tipoconta = "Conta Corrente";
        double saldo = 2000;
        int opcao = 0;

        System.out.println("**************************");
        System.out.println("\nDados inicias do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoconta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n**************************");

        String menu = """
                   ** Digite sua opção **
                   1 - Consultar saldo
                   2 - Receber valor
                   3 - Transferir valor
                   4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual da sua conta é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual é o valor que deseja receber:");
                double valor = scanner.nextDouble();
                saldo = saldo + valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao == 3) {
                System.out.println("Qual o Valor que deseja transferir:");
                double valor = scanner.nextDouble();

                if (valor < saldo) {
                    saldo = saldo - valor;
                    System.out.println("Transferencia com sucesso.");
                    System.out.println("Saldo Atual: " + saldo);
                } else {
                    System.out.println("Valor da Transferencia maior que o saldo atual");
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
