package br.edu.ifrn.lists;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    // tem semelhanças com o ArrayList
    public static void main(String[] args) {
        List<String> games = new Vector<>();

        // ADICIONANDO GAMES
        games.add("Phantasy Star");
        games.add("Super Mario Bros 2");
        games.add("The Bard's Tale");
        games.add("Naruto Ultimate Ninja 3");

        // ALTERANDO VALOR
        games.set(3, "Naruto Shippuden Ultimate Ninja 5"); // altera o 4º elemento

        // REMOVENDO VALOR
        games.remove(2); // pelo índice
        games.remove("Super Mario Bros 2");

        // PEGANDO VALOR
        String bestRPG = games.get(0);
        System.out.println("The best RPG is " + bestRPG); // Phantasy Star

        // ITERANDO O VECTOR
        Iterator<String> i = games.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
            // saída:
            // Phantasy Star
            // Naruto Shippuden Ultimate Ninja 5
        }
    }
}
