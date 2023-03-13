import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();

        scanner.close();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}

	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
	}
}
