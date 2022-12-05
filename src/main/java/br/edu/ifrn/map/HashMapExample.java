package br.edu.ifrn.map;

import java.util.HashMap;
import java.util.Map;

/* A java.util.Map não é uma interface que extende de 'Collection', ao contrário das outras, logo, não herda alguns métodos comuns.
 * As três implementações a serem estudadas são a HashMap (mais utilizada), LinkedHashMap (garante a ordem), TreeMap e HashTable.
 * A interface Map funciona à base da entrada de uma chave e um valor (exatamente como um Objeto Javascript),
 * onde cada chave guarda um valor e a consulta ocorre pela chave.
 * A Map também permite adição, navegação, atualização e exclusão dos elementos e ordenação, além da busca por chave ou valor.
 */
public class HashMapExample {
    public static void main(String[] args) {
        // sintaxe básica: definimos os tipos da chave e valor respectivamente entre <>
        // após o tipo "Map"
        Map<String, Integer> attributes = new HashMap<>();

        // ADIÇÃO: PUT
        attributes.put("Strength", 13);
        attributes.put("Intelligence", 14);
        attributes.put("Wisdom", 8);
        attributes.put("Dexterity", 16);
        attributes.put("Constitution", 5);
        attributes.put("Charisma", 9);
        attributes.put("Luck", 10);
        System.out.println(attributes);
        // saída: {Charisma=9, Wisdom=8, Dexterity=16, Intelligence=14, Luck=10,
        // Strength=13, // Constitution=5}
        // não há uma ordem específica

        // ATUALIZAÇÃO: PUT OU REPLACE
        attributes.replace("Charisma", 9, 10);
        System.out.println(attributes);

        // PEGAR ALGUM VALOR DENTRO DE UMA CHAVE: GET
        Integer wisdom = attributes.get("Wisdom");
        System.out.println("You have " + wisdom + " points of wisdom!");

        // VERIFICAR SE EXISTE ALGUMA CHAVE: CONTAINSKEY
        Boolean haveStr = attributes.containsKey("Strength");
        if (haveStr) // true
            System.out.println("You have Strength!");
        else
            System.out.println("i'm sorry...");

        // REMOVER: REMOVE
        attributes.remove("Luck");
        System.out.println(attributes); // exibe os atributos sem "Luck"

        // VERIFICAR SE EXISTE ALGUM VALOR
        Boolean haveMaxValue = attributes.containsValue(18);
        if (haveMaxValue) // false
            System.out.println("Congrats, you are fucking awesome!");
        else
            System.out.println("Sorry, you're not that good...");

        // VERIFICAR TAMANHO DO MAPA
        System.out.println(attributes.size()); // saída: 6

        // FORMAS DE ITERAR:
        // 1 -
        for (Map.Entry<String, Integer> entry : attributes.entrySet()) {
            System.out.println(" - " + entry.getKey() + ": " + entry.getValue());
            /*
             * saída:
             * - Charisma: 10
             * - Wisdom: 8
             * - Dexterity: 16
             * - Intelligence: 14
             * - Strength: 13
             * - Constitution: 5
             */
        }
        // 2 -
        for (String key : attributes.keySet()) {
            System.out.println(" -> " + key + ": " + attributes.get(key));
            /*
             * saída:
             * -> Charisma: 10
             * -> Wisdom: 8
             * -> Dexterity: 16
             * -> Intelligence: 14
             * -> Strength: 13
             * -> Constitution: 5
             */
        }

    }
}
