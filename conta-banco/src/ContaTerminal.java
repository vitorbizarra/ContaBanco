import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            input.useLocale(Locale.ENGLISH); // Essa linha deve ser adicionada para que possamos informar números com
                                             // decimais separados por ponto: Ex.: 237.48
            int numero = -1;
            while (numero < 0) {
                System.out.print("Por favor, informe o número da sua conta: ");
                numero = input.nextInt();
            }

            String agencia = "";
            while (agencia == "") {
                System.out.print("Por favor, informe o número da sua agência: ");
                agencia = input.next();
            }
            input.nextLine(); // This line you have to add (It consumes the \n character)

            String nome = "";
            while (nome == "") {
                System.out.print("Por favor, informe o seu nome: ");
                nome = input.nextLine();
            }

            double saldo = -1;
            while (saldo < 0) {
                System.out.print("Por favor, informe o saldo da sua conta: ");
                saldo = input.nextDouble();
            }

            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                    + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        }
    }
}
