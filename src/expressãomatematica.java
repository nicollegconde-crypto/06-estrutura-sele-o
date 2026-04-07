import java.util.Scanner;

public class expressãomatematica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;


        System.out.println("Digite o valor de x:");
        x = sc.nextDouble();

        if ( x>= -5 && x < 5){
            System.out.println("A expressão não pode ser calculada");
        }
else{
    y = 8 / Math.sqrt(x * x - 25);
            System.out.println("y= " + y);
        }

    }

}
