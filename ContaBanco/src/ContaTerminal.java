import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        System.out.println("Bem vindo ao Banco X!");
        System.out.println("Prosseguiremos para realizar a abertura da sua conta! ");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nomeCliente = scanner.next();

           System.out.println("Digite a agência: ");
            String agencia = scanner.next();

           System.out.println("Digite o número da conta: ");
            int numero = scanner.nextInt();

           System.out.println("Digite o saldo inicial da sua conta: ");
            double saldo = scanner.nextDouble();
     
        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+ numero +" e seu saldo " + saldo + " já está disponível para saque");     

   }
}
