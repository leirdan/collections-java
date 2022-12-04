package br.edu.ifrn.set;

import java.util.LinkedHashSet;
import java.util.Set;

/* A implementação LinkedHashSet é mais adequada quando é necessário manter a ordem de inserção dos elementos.
 * Entretanto, por conta disso, é a implementação mais lenta do Set.
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> party = new LinkedHashSet<>();

        // ADICIONANDO
        party.add("Uruk - Dwarf");
        party.add("Lannor - Elf");
        party.add("Gareth - Half-elf");
        party.add("Connor - Half-elf");

        System.out.println(party);
        // saída: [Uruk - Dwarf, Lannor - Elf, Gareth - Half-elf, Connor - Half-elf]

        // REMOVENDO
        party.remove("Lannor - Elf");
        System.out.println(party);

        // contém todos os outros métodos padrões das Collections, ver HashSetExample
        // para mais detalhes.
    }
}
