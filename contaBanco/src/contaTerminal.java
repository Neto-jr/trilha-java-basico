import java.util.Scanner;
import java.util.Locale;
public class contaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);
        //Exibri as mensagens para o nosso usuario
        int numeroConta =1021;
        String agencia = "";//"067-8";
        String nomeCliente = "Mario de Andrade";
        double saldoConta = 237.48;
        //Obter pelo scanner os valores digitados no terminal
        System.out.println("Por favor, digite o numero da agência ! ");
        agencia = sc.next();
        //Exibir a mensagem conta criada

            System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "
            +agencia+", conta "+numeroConta+" e saldo "+saldoConta+" Já está disponivel para saque");
        sc.close();
    }
}