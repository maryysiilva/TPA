import java.util.Scanner;

public class Ordem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva um valor A:");
        int a = scan.nextInt();

        System.out.println("Escreva um valor B:");
        int b = scan.nextInt();

        System.out.println("Escreva um valor C:");
        int c = scan.nextInt();

        if (a < b && b < c) {
            System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
        } else if (a < c && c < b) {
            System.out.println("Ordem crescente: " + a + ", " + c + ", " + b);
        } else if (b < a && a < c) {
            System.out.println("Ordem crescente: " + b + ", " + a + ", " + c);
        } else if (b < c && c < a) {
            System.out.println("Ordem crescente: " + b + ", " + c + ", " + a);
        } else if (c < a && a < b) {
            System.out.println("Ordem crescente: " + c + ", " + a + ", " + b);
        } else if (c < b && b < a) {
            System.out.println("Ordem crescente: " + c + ", " + b + ", " + a);
        }
    }
}
