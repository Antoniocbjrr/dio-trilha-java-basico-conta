import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       //TODO:Conhecer e importar a clase Scanner

       //:Exibir as mensagens para nosso usuário

       //:Obter pela scanner os valores digitados no terminal

       //:Exibir a mensagem conta criada


       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu numero");
        int numero = scanner.nextInt();
        
        System.out.println("Digite sua Agencia");
        int agencia = scanner.nextInt();

        System.out.println("Digite seu Nome");
        String nome = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, " + nome + ", Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia);
        System.out.println("conta: " + numero);
        System.out.println("Seu saldo: " + saldo + ", já está disponivel par saque");
    }
}