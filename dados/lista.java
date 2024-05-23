package dados;

import java.util.ArrayList;
import java.util.List;

public class lista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Amora");
        nomes.add("Morango");
        nomes.add("Seriguela");


        /* int index = 0;
        System.out.println(nomes.get(index));
        for(String nome : nomes){
            System.out.println("O nome é " + nome);

        }*/


        //Outra forma de fazer, a partir do Java 8.
        nomes.forEach(nome -> System.out.println("O nome que apareceu foi "+ nome));

    }
}



// Uma List é uma interface no Java que define as operações básicas para coleções ordenadas de elementos.
// O operador de atribuição (=) é usado para atribuir um valor à variável nomes.
// ArrayList é uma classe concreta que implementa a interface List. Ela é uma coleção ordenada e redimensionável baseada em array.
//
//