import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeiroNumero = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        int segundoNumero = entrada.nextInt();

        try {
            contarNumeros(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }

        entrada.close();
    }

    public static void contarNumeros(int numero1, int numero2) throws ParametrosInvalidosException {

        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro");
        }

        int quantidade = numero2 - numero1;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
