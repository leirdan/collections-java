package br.edu.ifrn.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> albums = new TreeMap<>();

        // ADICIONANDO
        albums.put("Born to Die", 2012);
        albums.put("Ultraviolence", 2014);
        albums.put("Honeymoon", 2015);
        albums.put("Norman Fucking Rockwell", 2019);
        albums.put("Chemtrails Over the Country Club", 2021);
        System.out.println(albums);
        // os albuns são exibidos seguindo a ordem alfabética entre as chaves

        // PEGANDO ÚLTIMA CHAVE DA ÁRVORE
        String last = albums.lastKey();
        System.out.println(last); // saída: Ultraviolence

        // PEGANDO CHAVE QUE VEM ANTES DE UM DETERMINADO PONTO; PARA PEGAR DEPOIS, USE
        // HIGHERKEY
        String below = albums.lowerKey("Honeymoon");
        System.out.println(below); // saída: Chemtrails Over the Country Club

        // PEGANDO CHAVE E VALOR DO PRIMEIRO ELEMENTO DA ÁRVORE
        System.out.println(albums.firstEntry()); // saída: Born to Die=2012

        // PEGANDO CHAVE E VALOR DO ÚLTIMO ELEMENTO DA ÁRVORE
        System.out.println(albums.lastEntry().getKey() + ": " + albums.lastEntry().getValue());
        // lastEntry().getKey() recupera a chave da última entrada, e o .getValue() o
        // valor da última entrada; nada de outro mundo, são apenas métodos encadeados

        // PEGANDO O "BORN TO DIE" E O REMOVENDO DO MAP
        Map.Entry<String, Integer> bornToDie = albums.pollFirstEntry();
        System.out.println("-> " + bornToDie.getKey() + ": " + bornToDie.getValue());
        // saída: -> Born to Die: 2012

        // ITERANDO COM ITERATOR
        Iterator<String> i = albums.keySet().iterator(); // keySet manda as chaves do map para uma estrutura Set (como
                                                         // um array)
        while (i.hasNext()) {
            String key = i.next();
            System.out.println(key + ": " + albums.get(key)); // pega no Map o valor guardado na chave correspondente à
                                                              // que está sendo passada
            /*
             * saída:
             * Chemtrails Over the Country Club: 2021
             * Honeymoon: 2015
             * Norman Fucking Rockwell: 2019
             * Ultraviolence: 2014
             */
        }

    }
}
