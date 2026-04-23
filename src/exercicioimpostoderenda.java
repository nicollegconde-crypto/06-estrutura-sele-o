import java.util.Scanner;

public class exercicioimpostoderenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioBruto, aliquota;
        double salarioLiquido, imposto;

        System.out.println("Digite o Salário Bruto -->");
        salarioBruto= sc.nextDouble();

        if (salarioBruto <= 2112)  {
            aliquota= 0;
        }
        else if (salarioBruto <= 2826.65){
            aliquota = 7.5;
        }
        else if (salarioBruto <= 3751.05) {
            aliquota= 15;
        }
        else if (salarioBruto <= 4664.68){
            aliquota = 22.5;
        }
        else{
            aliquota= 27.5;
        }
        imposto= salarioBruto * aliquota/100;
        salarioLiquido= salarioBruto - imposto;
        System.out.println("Salário bruto" + String.format("%2f," , salarioBruto));
        System.out.println("Alíquota" + String.format("%2f%%," ,aliquota));
        System.out.println("Imposto" + String.format("%2f," ,imposto));
        System.out.println("Salário líquido" + String.format("%2f," ,salarioLiquido));
    }
}
