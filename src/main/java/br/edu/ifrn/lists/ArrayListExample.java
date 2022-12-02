package br.edu.ifrn.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* List tem diversas implementações, mas as mais comuns são a ArrayList e Vector */

public class ArrayListExample {
    // a ArrayList é muito semelhante a um array, mas funciona de forma dinâmica
    // (!!), não precisando trabalhar com arrays fixos ou fazendo gambiarras, além
    // de permitir a ordenação da lista através dos "comparators"
    public static void main(String[] args) {
        List<String> spells = new ArrayList<>(); // sintaxe básica

        // ADICIONANDO ELEMENTOS
        spells.add("Detect Magic");
        spells.add("Burning Hands");
        spells.add("Light");

        // ORDENANDO UM ARRAYLIST EM ORDEM ALFABÉTICA
        Collections.sort(spells); // classe Collections

        System.out.println(spells); // saída: [Burning Hands, Detect Magic, Light]

        // ALTERANDO UM VALOR: SET
        spells.set(2, "Bless"); // saída: [Burning Hands, Detect Magic, Bless]

        System.out.println(spells);

        // REMOVENDO UM VALOR: REMOVE (pode excluir com base no valor ou no índice)
        spells.remove(0);
        // spells.remove("Burning Hands"); equivalente ao de cima

        System.out.println(spells); // saída: [Detect Magic, Bless]

        // PEGANDO UM VALOR: GET (pega com base na posição)
        String commonSpell = spells.get(0);
        int length = spells.size(); // retorna não o tamanho do array, mas a quantidade de elementos nele
        String lastSpell = spells.get(length - 1);

        System.out.println(commonSpell); // saída: Detect Magic
        System.out.println(lastSpell); // saída: Bless

        // VERIFICANDO SE UM ELEMENTO EXISTE NA LISTA: CONTAINS
        Boolean haveCureWounds = spells.contains("Cure Light Wounds");
        System.out.println(haveCureWounds); // saída: false

        // ZERANDO O ARRAY: CLEAR
        // spells.clear();
        // System.out.println(spells); // saída: []

        spells.add("Absorb Elements");
        spells.add("Message");
        spells.add("Minor Illusion");

        // PEGAR O ÍNDICE DE UM ELEMENTO: INDEXOF
        int position = spells.indexOf("Absorb Elements");
        System.out.println(position); // saída: 2 (a ordem é [Detect Magic, Bless, Absorb Elements e os outros acima])

        // PERCORRER UM ARRAY: FOREACH
        // sintaxe: for (tipoVariavel nomeElementoIterado : nomeArray)
        for (String spell : spells) {
            System.out.println(spell);
            // saída:
            // Detect Magic
            // Bless
            // Absorb Elements
            // Message
            // Minor Illusion
        }

        // OUTRA FORMA DE PERCORRER: API ITERATOR
        Iterator<String> i = spells.iterator();
        while (i.hasNext()) { // retorna "true" quando há mais um elemento na lista depois do atual
            System.out.println(i.next()); // imprime o valor que está sendo iterado agora
        }
    }
}
