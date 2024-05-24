package pessoa;

public class TesteDePessoa {


    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "3332221110";
        pessoa1.nome = "ilanna";
        pessoa1.idade = 25;

        System.out.println(pessoa1.imprimirDadosDaPessoa());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "3332221117";
        pessoa2.nome = "Aria";
        pessoa2.idade = 28;

        System.out.println(pessoa2.imprimirDadosDaPessoa());
    }
}

/* POO - Programção orientada a objeto
* instância é um objeto criado a partir de uma classe
* cria uma representação desse objeto na memória
* foi criada duas instâncias, uma pra pessoa 1 e outra pra pessoa 2.
* baseada no mesmo objeto, você pode ter quantas instâncias quiser.
* Métodos são ações que a classe pode ter.
* O que diferencia um atributo de um método:no atributo coloca-se nome
* e tipo da variável e no método põe-se o tipo, o nome e abre e fecha
* () e dentro desse método tem alguma ação.
* O método pode ou não receber argumentos.
*
*
 */


