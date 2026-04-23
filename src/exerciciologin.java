import java.util.Scanner;

public class exerciciologin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String login, senha;

        System.out.println("login -->");
        login = sc.next();

        if (login.equals("admin")) {
            System.out.println("Senha -->");
            senha = sc.next();

            if (senha.equals("fiap2026")) {
                System.out.println("Acesso liberado");
            } else {
                System.out.println("Senha incorreta");
            }
        }
        else{
            System.out.println("Usuário não encontrado");
        }
    }
}
