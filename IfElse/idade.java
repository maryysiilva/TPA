import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva o seu ano de nascimento:");
        int anoNasc = scan.nextInt();

        System.out.println("Escreva o ano atual:");
        int anoAtual = scan.nextInt();

        int idade = anoAtual - anoNasc;

        if (idade > 0 && idade<10) {
            System.out.println("Você é uma criança e tem " + idade + " anos.");
        } else if (idade>=10 && idade<18) {
            System.out.println("Você é um adolescente e tem " + idade + " anos.");
        } else if (idade>=18 && idade<60) {
            System.out.println("Você é um adulto e tem " + idade + " anos.");
        } else if (idade >=60) {
            System.out.println("Você é um idoso e tem " + idade + " anos.");
        } else {
            System.out.println("A idade apresentada não é compatível");
        }
    }
}