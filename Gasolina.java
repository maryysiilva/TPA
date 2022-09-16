import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva a capacidade do tanque de combustível do seu carro (em litros):");
        double l = scan.nextDouble();

        System.out.println("Escreva a distância percorrida (em quilômetros):");
        double km = scan.nextDouble();

        double economia = km / l;

        if (economia >= 10) {
            System.out.println("O seu carro é econômico, ele percorre em média " + economia + " km/l.");
        } else if (economia > 0 && economia < 10) {
            System.out.println("O seu carro não é econômico, ele percorre em média " + economia + "km/l.");
        } else {
            System.out.println("Os valores informados estão incorretos.");
        }
    }
}
