public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar e obter o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicitar e obter o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        // Solicitar e obter o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicitar e obter o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem formatada com base nas informações fornecidas
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }
}