import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("Por favor, digite o número da Agência: ");
                int numeroAgencia = lerNumero(scanner);

                System.out.print("Digite o número da Conta: ");
                int numeroConta = lerNumero(scanner);

                System.out.print("Digite o nome do Cliente: ");
                String nomeCliente = lerNomeCliente(scanner);

                System.out.print("Digite o saldo da Conta: ");
                double saldoConta = lerNumeroDecimal(scanner);

                System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, ");
                System.out.println("sua agência é " + numeroAgencia + ", conta " + numeroConta + "e seu saldo é R$" + saldoConta);

                System.out.println("\nDeseja cadastrar um novo cliente? (1 para sim, 2 para não): ");
                int opcao = lerNumero(scanner);
                if (opcao == 2) {
                    continuar = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Certifique-se de digitar os dados corretamente.");
            }
        }

        scanner.close();
    }

    private static int lerNumero(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Número inválido. Por favor, insira um número: ");
            }
        }
    }

    private static double lerNumeroDecimal(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Número inválido. Por favor, insira um número: ");
            }
        }
    }

    private static String lerNomeCliente(Scanner scanner) {
        while (true) {
            String nome = scanner.nextLine();
            if (nome.matches("[a-zA-Z]+")) {
                return nome;
            } else {
                System.out.print("Nome inválido. Por favor, insira apenas letras: ");
            }
        }
    }
}
