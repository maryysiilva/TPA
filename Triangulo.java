import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um valor A:");
        double a = scan.nextDouble();

        System.out.println("Escreva um valor B:");
        double b = scan.nextDouble();

        System.out.println("Escreva um valor C:");
        double c = scan.nextDouble();

        if (a <= b + c && b <= a + c && c <= a + b && a != 0 && b != 0 && c != 0) {
            if (a == b && a == c) {
                System.out.println("É um triângulo equilátero");
            } else if (a != b && a != c && b !=c) {
                System.out.println("É um triângulo escaleno");
            } else {
                System.out.println("É um triângulo isósceles");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
