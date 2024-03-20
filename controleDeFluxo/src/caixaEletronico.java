
public class caixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSolicitado = 26.0;
        // verificando o saldo
        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.println("Saldo en Conta: r$ "+saldo);
        }else{
            System.out.println("Saldo insuficiente ");
        }
    }
}
