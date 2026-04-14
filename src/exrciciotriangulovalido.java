import java.util.Scanner;

public class exrciciotriangulovalido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor1, valor2, valor3;

        System.out.println("Digite o valor 1 --> ");
        valor1 = sc.nextDouble();
        System.out.println("Digite o valor 2 --> ");
        valor2=sc.nextDouble();
        System.out.println("Digite o valor 3 --> ");
        valor3=sc.nextDouble();

        if (valor1 < valor2 + valor3 & valor2 < valor1 + valor3 & valor3 < valor1 + valor2) {
            System.out.println("Os valores formam um triângulo!");
        }
        else {
            System.out.println("Os valores NÃO formam um triângulo! ");
        }

    }
}
