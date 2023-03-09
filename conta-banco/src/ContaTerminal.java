import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}
