import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva a primeira nota:");
        double n1 = scan.nextDouble();

        System.out.println("Escreva a segunda nota:");
        double n2 = scan.nextDouble();

        double m = (n1 + n2) / 2;
        System.out.println("Média: " + m);

        if (m < 3) {
            System.out.println("Reprovado");
        } else if (m < 6) {
            System.out.println("Exame de recuperação, escreva sua terceira nota: ");
            double n3 = scan.nextDouble();
            m = (n1 + n2 + n3) / 3;
            System.out.println("Média: " + m);
            if (m >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        } else {
            System.out.println("Aprovado");
        }
    }
}
