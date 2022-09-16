import java.util.Scanner;

public class Extremos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva os nomes e as idades dos 5 usuários (Um usuário de cada vez. Na seguinte ordem: nome, idade.)");
        String userA = scan.next();
        int ageA = scan.nextInt();
        String userB = scan.next();
        int ageB = scan.nextInt();
        String userC = scan.next();
        int ageC = scan.nextInt();
        String userD = scan.next();
        int ageD = scan.nextInt();
        String userE = scan.next();
        int ageE = scan.nextInt();
        
        if (ageA < ageB && ageA < ageC && ageA < ageD && ageA < ageE) {
            System.out.println(userA + " é o mais jovem e tem " + ageA + " anos");
        } else if (ageB < ageA && ageB < ageC && ageB < ageD && ageB < ageE) {
            System.out.println(userB + " é o mais jovem e tem " + ageB + " anos");
        } else if (ageC < ageA && ageC < ageB && ageC < ageD && ageC < ageE) {
            System.out.println(userC + " é o mais jovem e tem " + ageC + " anos");
        } else if (ageD < ageA && ageD < ageB && ageD < ageC && ageD < ageE) {
            System.out.println(userD + " é o mais jovem e tem " + ageD + " anos");
        } else if (ageE < ageA && ageE < ageB && ageE < ageC && ageE < ageD) {
            System.out.println(userE + " é o mais jovem e tem " + ageE + " anos");
        } else {
            System.out.println("Há mais de um mais jovem");
        }

        if (ageA > ageB && ageA > ageC && ageA > ageD && ageA > ageE) {
            System.out.println(userA + " é o mais velho e tem " + ageA + " anos");
        } else if (ageB > ageA && ageB > ageC && ageB > ageD && ageB > ageE) {
            System.out.println(userB + " é o mais velho e tem " + ageB + " anos");
        } else if (ageC > ageA && ageC > ageB && ageC > ageD && ageC > ageE) {
            System.out.println(userC + " é o mais velho e tem " + ageC + " anos");
        } else if (ageD > ageA && ageD > ageB && ageD > ageC && ageD > ageE) {
            System.out.println(userD + " é o mais velho e tem " + ageD + " anos");
        } else if (ageE > ageA && ageE > ageB && ageE > ageC && ageE > ageD) {
            System.out.println(userE + " é o mais velho e tem " + ageE + " anos");
        } else {
            System.out.println("Há mais de um mais velho.");
        }
    }
}
