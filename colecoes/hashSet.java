package colecoes;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);

        //numeros.remove(12);

        for (Integer elemento : numeros){
            System.out.println(elemento);
        }

        // verificando existência de um item

        System.out.println(numeros.contains(12));

    }
}





// hashSet é uma coleção de elementos unicos.
// usado para verificar a existência de um item numa lista.
// não é possivel pegar o item por index pois, no hashSet
// a ordenação não importa.