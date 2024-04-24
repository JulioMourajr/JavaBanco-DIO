import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá seja bem vindo ao nosso Banco!");
        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = leitor.nextInt();
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = leitor.next();
        System.out.println("Insira o nome do funcionário: ");
        String nome = leitor.next();
        System.out.println("Qual é o seu saldo: ");
        float saldo = leitor.nextFloat();
        ContaTerminal conta = new ContaTerminal(numeroConta, agencia, nome, saldo);
        System.out.println(conta.toString());

        }
    }
