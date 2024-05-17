import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;


        Scanner teclado = new Scanner(System.in);


        System.out.println("Por favor, digite seu nome !");
        nomeCliente = teclado.nextLine();

        System.out.println("Por favor, digite o número da agência !");
        agencia = teclado.nextLine();

        System.out.println("Por favor, informe o número da sua conta !");
        numero = teclado.nextInt();

        System.out.println("Por favor, informe seu saldo !");
        saldo = teclado.nextFloat();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
