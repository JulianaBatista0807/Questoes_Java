import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("!!! Conversor de temperaturas !!!\n");
        System.out.print("Digite a temperatura: ");
        float temperatura = scan.nextFloat();

        System.out.print("Digite a escala da temperatura (C, F ou K): ");
        String escala = scan.next().toUpperCase();

        float celsius = 0, fahrenheit = 0, kelvin = 0;

        if (escala.equals("C")) {
            celsius = temperatura;
            fahrenheit = (celsius * 9 / 5) + 32;
            kelvin = celsius + 273.15f;
        } else if (escala.equals("F")) {
            fahrenheit = temperatura;
            celsius = (fahrenheit - 32) * 5 / 9;
            kelvin = celsius + 273.15f;
        } else if (escala.equals("K")) {
            kelvin = temperatura;
            celsius = kelvin - 273.15f;
            fahrenheit = (celsius * 9 / 5) + 32;
        } else {
            System.out.println("Escala inválida.");
            return;
        }

        System.out.printf("A temperatura em Celsius é de: %.2f\n", celsius);
        System.out.printf("A temperatura em Fahrenheit é de: %.2f\n", fahrenheit);
        System.out.printf("A temperatura em Kelvin é de: %.2f\n", kelvin);

        scan.close();
    }
}