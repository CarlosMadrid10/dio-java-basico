import java.util.Locale;
import java.util.Scanner;

/**Classe para objetos do tipo Funcionários, onde serão contidos, valores e métodos para o mesmo.
* @author Carlos Madrid
* @version 1.00
* @since 24/02/2025
*/

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Por favor, digite o número da Conta !");
        contaTerminal.numero = scanner.nextInt();
        System.out.println("Por favor, digite a Agência !");
        contaTerminal.agencia = scanner.next();
        System.out.println("Por favor, digite o nome do Cliente !");
        contaTerminal.nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo da Conta !");
        contaTerminal.saldo = scanner.nextDouble();

        System.out.printf("\nOlá %s,\nobrigado por criar uma conta em nosso banco,\nsua agência é %s,\nconta %d e\nseu saldo de %.2f já está disponível para saque.", contaTerminal.nomeCliente, contaTerminal.agencia, contaTerminal.numero, contaTerminal.saldo);
    }
}
