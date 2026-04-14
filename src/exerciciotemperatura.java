import java.util.Scanner;

public class exerciciotemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         double temperatura;

        System.out.println("Informe a temperatura --> ");
        temperatura= sc.nextDouble();


        if ( temperatura < 20){
            System.out.println("FRIO!");
        }
        else {
            System.out.println("QUENTE! ");
        }








    }
}
