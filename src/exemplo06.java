import java.util.Scanner;

public class exemplo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double nota1, nota2;
        double media;
        System.out.println("Digite a nota 1 -->");
        nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2 -->");
        nota2 = sc.nextDouble();

        media= (nota1 + nota2) / 2;
        System.out.println("Sua média é:" + media);

        if (media >= 6){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }


    }
}
