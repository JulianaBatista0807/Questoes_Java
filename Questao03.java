import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bem-vindo à Mansão Wayne.\n");
        System.out.print("Por favor, digite seu nome e sobrenome para verificar sua identidade.\n");

        System.out.print("Digite o nome: ");
        String nome = scan.next();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = scan.next();

        if (sobrenome.equals("Wayne")) {
            System.out.println("Acesso liberado, Sr. Wayne");
        } else if (sobrenome.equals("Kent")) {
            System.out.println("Saí daí, mané!");
        } else if (nome.equals("Diana")) {
            System.out.println("Bem-vinda, Princesa de Themyscara");
        } else {
            System.out.println("Cai fora!");
        }

        scan.close();
    }

}