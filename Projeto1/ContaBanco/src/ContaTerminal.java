import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Exibir a mensagem a <<CONTA CRIADA>>
        
        //Importar Scanner para entrada de usuário
        Scanner scanner = new Scanner (System.in);

        //Solicitação de dados do usuário
        System.out.println("Digite o nome da agência: ");
       String agencia = scanner.next();

       //Println para retornar o número da conta do cliente
        System.out.println("Digite o número da sua Conta: ");
        int numero = scanner.nextInt();

        //Println para retornar o número do saldo do cliente
        System.out.println("Digite o número da seu saldo: ");
        double saldo = scanner.nextDouble();

        //Println para digitar o nome do cliente
        System.out.println("Digite seu nome: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();
        //Fim da solicitação de dados ao usuário

        
        //String para retornar mensagem para o usuário
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque. ";

        //Print para exibir no console a mensagem para o usuário
        System.out.println(mensagem);

        //Fechamento de Scanner
        scanner.close();


        
    }
}
