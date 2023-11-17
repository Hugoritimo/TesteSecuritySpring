import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        SistemaSeguranca sistema = new SistemaSeguranca();
        sistema.adicionarUsuario("usuario1", "senha123");
        sistema.adicionarUsuario("usuario2", "senha456");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (sistema.autenticarUsuario(nomeUsuario, senha)) {
            System.out.println("Autenticação bem-sucedida. Bem-vindo, " + nomeUsuario + "!");
        } else {
            System.out.println("Falha na autenticação. Verifique o nome de usuário e a senha.");
        }

        scanner.close();
    }
}
