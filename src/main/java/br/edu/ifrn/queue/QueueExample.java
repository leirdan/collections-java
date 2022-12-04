package br.edu.ifrn.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* Queue é uma interface muito utilizada para trabalhar com filas do tipo FIFO (first in first out), 
estruturas de dados que seguem a regra de "Primeiro elemento que entra é o primeiro a sair". 
Queue não permite mudança de ordenação dos elementos nem alteração de elementos, garantindo a ordem de inserção. 
*/

public class QueueExample {
    public static void main(String[] args) {
        // A implementação da interface Queue a ser estudada é a "Linked List"
        Queue<String> items = new LinkedList<>();

        // ADIÇÃO
        items.add("key");
        items.add("broadsword");
        items.add("rope");
        items.add("five torches");
        items.add("six packs of ration");

        System.out.println(items); // saída: [key, broadsword, rope, five torches, six packs of ration]

        // ACESSAR O ITEM E REMOVER DA FILA (SEMPRE SERÁ O PRIMEIRO DA LISTA): POOL
        String firstItemToBeUsed = items.poll();

        System.out.println("You wielded your first item: " + firstItemToBeUsed);
        System.out.println("Now, all that's left in your backpack is: " + items); // os itens sem a key

        // ACESSAR O ITEM SEM REMOVÊ-LO: PEEK OU ELEMENT
        String nextItemToBeUsed = items.peek();
        System.out.print("You wielded your second item: " + nextItemToBeUsed + ". ");
        System.out.println("But the item is not consumable, so you can use it again!");
        System.out.println("Here is your current backpack: " + items);

        // em situações de uma lista vazia, o método peek retorna apenas um valor nulo
        // ao não encontrar o primeiro elemento, enquanto o método element retorna a
        // exceção NoSuchElementException
        // exemplo de uso do "element":

        try {
            String firstItem = items.element();
            System.out.println("This is your first item: " + firstItem); // broadsword
        } catch (Exception e) {
            System.out.println("Oh no, something occurred: " + e + ". You don't have any elements.");
        }

        // REMOVENDO O PRIMEIRO ELEMENTO: REMOVE
        items.remove();
        System.out.println("Your current backpack is " + items); // saída: [rope, five torches,
                                                                 // six packs of ration]

        // PERCORRENDO A FILA
        for (String item : items) {
            System.out.println(item);
        }
        // ou
        Iterator<String> i = items.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            // saída:
            /*
             * rope
             * five torches
             * six packs of ration
             */
        }

        /*
         * como a interface Queue extende a classe Collection ela herda muitos
         * métodos semelhantes
         * aos da interface List (também herda Collection), como size(), isEmpty(),
         * clear() e muitos outros.
         */
    }
}
