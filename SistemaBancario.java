
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
                   2 - Transferir valor
                   3 - Receber valor
                   4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();}
    }
}
