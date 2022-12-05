package br.edu.ifrn.set;

import java.util.Iterator;
import java.util.TreeSet;

/* A implementação TreeSet é mais adequada quando seus dados devem ser encaixados em uma hierarquia da estrutura de dados do tipo "árvore" e
 * quando há a necessidade de alterar a ordem dos elementos inseridos no Set,
 * tendo boa performance na leitura mas sendo muito lento para adicionar/remover elementos por precisar
 * reordenar todo o Set.
 */
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> magician = new TreeSet<>();

        // ADICIONANDO
        magician.add("Warlock");
        magician.add("Sorcerer");
        magician.add("Magus");
        magician.add("Wizard");
        magician.add("Illusionist");
        magician.add("Enchanter");
        magician.add("Conjurer");
        magician.add("Diviner");

        System.out.println(magician);
        // saída: [Conjurer, Diviner, Enchanter, Illusionist, Magus, Sorcerer, Warlock,
        // Wizard]
        // a ordenação é feita de forma alfabética

        // PEGANDO PRIMEIRO VALOR DA ÁRVORE SEM REMOVÊ-LO
        String first = magician.first();
        System.out.println(first); // saída: Conjurer

        // PEGANDO ÚLTIMO VALOR SEM REMOVÊ-LO
        String last = magician.last();
        System.out.println(last); // saída: Wizard

        // PEGANDO PRIMEIRO VALOR E REMOVENDO-O
        System.out.println(magician.pollFirst());
        System.out.println(magician); // saída sem o elemento "Conjurer" na lista

        // PEGANDO ÚLTIMO VALOR E REMOVENDO-O
        System.out.println(magician.pollLast());
        System.out.println(magician); // saída sem o elemento "Wizard" na lista

        // PEGANDO O ELEMENTO ACIMA DO PARAMETRIZADO (baixo pra cima)
        System.out.println(magician.higher("Magus")); // saída: Sorcerer

        // PEGANDO O ELEMENTO ABAIXO DO PARAMETRIZADO (baixo pra cima)
        System.out.println(magician.lower("Magus")); // saída: Illusionist

        // ITERANDO
        System.out.println("-------------");
        Iterator<String> i = magician.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
