import java.util.Scanner;

public class Exercício17AnoBissexto {
    public static void main(String[] args) {
        int modulo =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** Programa Ano Bissexto *****");
        System.out.print("Digite um ano, com os 4 digitos, para descobrir se ele é bissexto: ");
        Double ano = scanner.nextDouble();
        Boolean eAnoBissexto = ano % 4 == 0 && ano % 100 != 0 || (ano % 400 == 0) ;

        if (eAnoBissexto){
            System.out.println("O ano digitado é bissexto.");
        } else {
            System.out.print("O ano digitado não é bissexto.");
        }
        scanner.close();
    }

}
