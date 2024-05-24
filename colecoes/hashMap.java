package colecoes;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        Map<String,Integer> notas = new HashMap<>();
        notas.put("Julia", 9);
        notas.put("Pedro", 10);
        notas.put("Nina", 10);

        var nota = notas.get("Pedro");
        System.out.println(nota);

        //outra forma de fazer

        for(Map.Entry<String, Integer> entry : notas.entrySet() ){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + "e o valor é" +value);
        }
    }

}


// A portir do Java 10 é possível ter acesso ao tipo da variável colocando o var
// no caso, o java saberá o tipo da variavel nota. ele so funciona para variaveis
// que consegue fazer a definição
// No map é necessário passar a chave que você quer recuperar
// o map trabalha com chaves unicas.se tiver mais de uma, da mesma chave,
//vai prevalecer a ultima chave colocada.