import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você quer ir para Ilhabela (1) ou Fernando de Noronha (2)?");
        int destino = scan.nextInt();

        System.out.println("Escreva a quantidade de dias que deseja ficar:");
        int dias = scan.nextInt();

        System.out.println("Custo da hospedagem:");
        if (destino == 1) {
            if (dias < 6) {
                int custo = 240 * dias;
                System.out.println(custo);
            } else if (dias < 11) {
                int custo = 220 * dias + 130;
                System.out.println(custo);
            } else {
                int custo = 210 * dias + 150;
                System.out.println(custo);
            }
        } else if (destino == 2) {
            if (dias < 6) {
                int custo = 400 * dias + 100;
                System.out.println(custo);
            } else if (dias < 11) {
                int custo = 410 * dias + 150;
                System.out.println(custo);
            } else {
                int custo = 420 * dias + 200;
                System.out.println(custo);
            }
        } else {
            System.out.println("O número informado não corresponde a nenhuma cidade");
        }
    }
}
