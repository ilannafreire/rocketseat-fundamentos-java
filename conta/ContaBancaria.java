package conta;

public class ContaBancaria {

    String numero;
    String titular;
    double saldo;

    // depositar
    void depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            System.out.println("Deposito de R$ " + valor + ". Saldo atual R$ " + saldo);
        }else {
            System.out.println("O valor de depósito é inválido");
        }
    }
    //sacar

    void sacar(double valor){
         if (valor > 0 && valor <= saldo){
             saldo = saldo - valor;
             System.out.println("Saque de R$ " + valor + ". Saldo atual R$ " + saldo );

         }
    }
}
