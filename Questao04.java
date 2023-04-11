import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero par se desejar saber a Raiz Cúbica ou digite um numero impar se desejar a Raiz Quadrada");

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            double raizCubica = Math.cbrt(num);
            System.out.printf("O numero digitado foi par. Raiz Cúbica de %d: %.2f", num, raizCubica);
        } else {
            double raizQuadrada = Math.sqrt(num);
            System.out.printf("O numero digitado foi impar. Raiz Quadrada de %d: %.2f", num, raizQuadrada);
        }

        sc.close();
    }
}