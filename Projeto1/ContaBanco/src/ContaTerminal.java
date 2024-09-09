import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        //Importar Scanner para entrada de usuário
        Scanner scanner = new Scanner (System.in);

        //Solicitação de dados do usuário
        System.out.println("Digite o nome da agência: ");
       String agencia = scanner.next();

        System.out.println("Digite o número da sua Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Digite seu nome: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();


        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque. ";

        System.out.println(mensagem);

        scanner.close();


        
    }
}
