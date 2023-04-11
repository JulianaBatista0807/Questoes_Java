import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("!!! Calculadora !!!\n");
        System.out.print("Digite a operação (+, -, *, /, ^, raiz, basicas): ");
        String operacao = scan.next();

        float num1 = 0;

        if(!operacao.equals("raiz") && !operacao.equals("basicas")) {
            System.out.print("Digite um número: ");
            num1 = scan.nextFloat();

            System.out.print("Digite outro número: ");
            float num2 = scan.nextFloat();

            float resultado = 0;

            switch(operacao) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
                case "^":
                    System.out.print("Digite a potência: ");
                    float potencia = scan.nextFloat();
                    resultado = (float)Math.pow(num1, potencia);
                    break;
                default:
                    System.out.println("Operação inválida");
                    return;
            }

            System.out.println("Resultado: " + resultado);

        } else if(operacao.equals("raiz")) {
            System.out.print("Digite um número: ");
            num1 = scan.nextFloat();

            System.out.print("Digite a raiz (2, 3): ");
            int raiz = scan.nextInt();
            float resultado = 0;

            if(raiz == 2) {
                resultado = (float)Math.sqrt(num1);
            } else if(raiz == 3) {
                resultado = (float)Math.cbrt(num1);
            } else {
                System.out.println("Operação inválida");
                return;
            }

            System.out.println("Resultado: " + resultado);

        } else {
            System.out.print("Digite um número: ");
            num1 = scan.nextFloat();

            System.out.print("Digite outro número: ");
            float num2 = scan.nextFloat();

            float resultadoSoma = num1 + num2;
            float resultadoSubtracao = num1 - num2;
            float resultadoMultiplicacao = num1 * num2;
            float resultadoDivisao = num1 / num2;

            System.out.println("Soma: " + resultadoSoma);
            System.out.println("Subtração: " + resultadoSubtracao);
            System.out.println("Multiplicação: " + resultadoMultiplicacao);
            System.out.println("Divisão: " + resultadoDivisao);
        }

        scan.close();
    }

}