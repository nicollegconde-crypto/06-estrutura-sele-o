import java.util.Scanner;

public class exercicioanobissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano;

        System.out.println("Informe o ano --> ");
        ano= sc.nextInt();

          if(( ano % 4 == 0 && ano % 100 != 0 ) || ano % 400 == 0) {
              System.out.println(ano + " É um ano bissexto! ");
        }
          else{
              System.out.println(ano + " NÃO é um ano bissexto! ");
          }


    }
}
