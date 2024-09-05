import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Numero");
        double numero = scanner.nextDouble();

        System.out.println("Digite sua Agencia");
        double agencia = scanner.nextDouble();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        int saldo = 2000;

    System.out.println("O numero da sua agencia é : " + numero);
    System.out.println("Sua agencia é a : " + agencia);
    System.out.println("Seu nome é : " + nome);
    System.out.println("Seu saldo é de " + saldo + " Reais");
    scanner.close();
        
    }
}
