import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu peso:");
        double kg = scan.nextDouble();

        System.out.println("Informe a sua altura:");
        double h = scan.nextDouble();

        double imc = kg / (h * h);

        if (imc < 18.5) {
            System.out.println("IMC = " + imc);
            System.out.println("Excesso de magreza");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("IMC = " + imc);
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("IMC = " + imc);
            System.out.println("Excesso de peso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("IMC = " + imc);
            System.out.println("Obesidade (Grau I)");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("IMC = " + imc);
            System.out.println("Obesidade (Grau II)");
        } else {
            System.out.println("IMC = " + imc);
            System.out.println("Obesidade (Grau III)");
        }
    }
}