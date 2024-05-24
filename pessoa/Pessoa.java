package pessoa;

public class Pessoa {
    // nome, idade, cpf
    // tipo, nomeDaVariavel;

    String nome;
    int idade;
    String cpf;

    String imprimirDadosDaPessoa(){

        return "O nome da pessoa é " + nome + "a idade é "
                + idade + "e o documento " + cpf;


    }
}


/* Se dentro do () tivesse String nome, ele continuaria
* sendo um método mas agora um tipo de método que recebe
* argumento.
* Void  cada método que não tem retorno, que só faz uma
* ação dentro do método utiliza-se void significando que
* tem uma ação mas que não vai retornar nada.
*
*
 */