package conta;

public class TesteContaBancaria {


    public static void main(String[] args) {

        ContaBancaria contaBancaria1 = new ContaBancaria();
        contaBancaria1.setNumero("1234");

        contaBancaria1.setTitular("Nívia");
        contaBancaria1.setSaldo(100);

        contaBancaria1.depositar(50);
        contaBancaria1.sacar(100);
    }
}



/*
* Encapsulamento: proteção de dados. usuário pode buscar o atributo e/ou
* pode adicionar informação nesse novo atributo.
*
*
 */