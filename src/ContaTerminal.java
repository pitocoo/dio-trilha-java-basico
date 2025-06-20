import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do scanner
        var scanner = new Scanner(System.in);
        // Apresentação do programa
        System.out.println("\nCadastro de cliente\n");
        // Instrução para o usuário e declaração de variáveis
        System.out.print("Insira o número da agência: ");
        var numero = scanner.nextInt();
        System.out.print("Insira o nome da agência: ");
        // A variável agência estava recebendo "" como valor. Por isso, utilizei a função skip() para ignorar o \n
        scanner.skip("\n");
        var agencia = scanner.nextLine();
        System.out.print("Insira o seu nome: ");
        var nome = scanner.nextLine();
        System.out.print("Insira o saldo: ");
        var saldo = scanner.nextFloat();
        // Saída com os dados inseridos pelo usuário
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está dsponível para saque.", nome, agencia, numero, saldo);
        // Função para fechar o scanner
        scanner.close();
    }
}
