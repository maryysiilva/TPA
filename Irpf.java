import java.util.Scanner;

public class Irpf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o seu salário:");
        double s = scan.nextDouble();

        if (s < 1434.59) {
            System.out.println("Não há desconto");
        } else if (s < 2150) {
            double irpf = (s * (7.5/100)) - 107.59;
            System.out.println("IRPF: " + irpf);
        } else if (s < 2866.7) {
            double irpf = (s * (15.0/100)) - 268.84;
            System.out.println("IRPF: " + irpf);
        } else if (s < 3582) {
            double irpf = (s * (22.5/100)) - 483.84;
            System.out.println("IRPF: " + irpf);
        } else {
            double irpf = (s * (27.5/100)) - 662.94;
            System.out.println("IRPF: " + irpf);
        }
    }
}
