import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double desconto, total, valor;

        System.out.println("Qual o valor da compra -->");
        valor = sc.nextDouble();
                if(valor > 1000){
           desconto = valor * 15 / 100;
        }
               else {
            desconto = valor * 8 / 100;
        }
               total= valor - desconto;
        System.out.println("Valor total: " + total);
        System.out.println("Valor do desconto: " + desconto);


    }
}
