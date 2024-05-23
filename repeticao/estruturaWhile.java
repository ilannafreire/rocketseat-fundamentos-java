package repeticao;

public class estruturaWhile {
    public static void main(String[] args) {
        // While (enquanto for verdadeiro, faça alguma coisa)
        int valorInicial = 2;
        while (valorInicial <3){
            System.out.println("O valor inicial é menor que 3");
            System.out.println(valorInicial);
            valorInicial++; //valorInicial = 3
        }
        System.out.println("Saiu do while");
    }
}
