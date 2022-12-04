package br.edu.ifrn.set;

import java.util.HashSet;
import java.util.Set;

/* A interface Set possui diversas implementações, mas todas têm em comum as seguintes características:
 * não garante ordenação, não possui itens repetidos, não permite atualização de item nem uma busca específica em índice 
 * (garante apenas adição e remoção) e não tem como mudar a ordem.
 * HashSet é a implementação mais usada, mais adequada para quando a ordenação não é importante, priorizando a perfomance.
 */
public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> age = new HashSet<>();

        // ADICIONANDO
        age.add(10);
        age.add(13);
        age.add(24);
        age.add(16);
        age.add(18);
        age.add(33);
        age.add(54);
        System.out.println(age); // saída: todos esses elementos mas em uma ordem aleatória

        // REMOVENDO
        age.remove(13);
        System.out.println(age); // saída: a mesma saída de cima mas sem o 13

        // QUANTIDADE DE ELEMENTOS
        System.out.println(age.size());

        // contém outros métodos padrão, como isEmpty(), clear(), forma de iterar
        // similar às outras interfaces, etc.

    }
}
