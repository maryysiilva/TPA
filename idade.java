import java.util.*;
public class Idade {

    public static void main(String [] args) {
        Scanner in = new Scanner (System.in);
        int i=1, anoNasc, anoAtual, idade, n;
        do{
            System.out.println("Digite o ano do nascimento do usuário:");
            anoNasc = in.nextInt ();
            System.out.println("Digite o ano do Atual");
            anoAtual = in.nextInt ();
            idade = anoAtual - anoNasc;
            System.out.println("A idade do usuário é  "+idade);
            if (idade<18) {
                System.out.println("Menor de idade");
            }else{
                System.out.println("Maior de idade");
            }
            System.out.println("Deseja continuar a execução? 1-Sim 2-Não");
            n = in.nextInt () ;
            switch(n) {
                case 1;
                    System.out.println("Digite o ano do nascimento do usuário:");
                    anoNasc = in.nextInt ();
                    System.out.println("Digite o ano do Atual");
                    anoAtual = in.nextInt ();
                    idade = anoAtual - anoNasc;
                    System.out.println("A idade do usuário é  "+idade);
                    if (idade<18) {
                        System.out.println("Menor de idade");
                    }else{
                        System.out.println("Maior de idade");
                    }
                    break;
                case 2:
                    System.out.println("Fim da execução!");
                    break;
            }
            i++;
        }while (i<18);
    }
 }