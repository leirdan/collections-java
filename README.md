# COLLECTIONS FRAMEWORK

## 1. DEFINIÇÃO

As **Collections** são objetos que, em si, abrigam elementos dos mais diversos tipos. Sua principal utilidade é de _armazenar e processar conjuntos de dados de forma mais eficiente_, corrigindo problemas do Java 2, além de unificar a maneira com que os objetos complexos são tratados.
Uma Collection é declarada e criada com base em 3 partes;

-   **Interface**: contrato assumido por uma classe;
-   **Classe/Implementação**: a codificação dessa interface;
-   **Algoritmo**: a sequência de métodos e manipulações possíveis de serem feitas com a collection. Esses algoritmos, vale ressaltar, são _polimórficos_, visto que um mesmo método pode ser usado em diferentes collections, desde que seja apropriado.

A primeira interface que será usada, portanto, é a interface **Collection**, que é herdada por todas as interfaces posteriores e possui alguns métodos padrão, como _all()_, _clear()_ e _size()_.

## 2. INTERFACE LIST

Esta interface extende a Collection e é utilizada para **armazenar uma sequência de elementos ordenados**. Suas principais características são:

-   Elementos podem ser inseridos e buscados em qualquer ponto;
-   Pode ter elementos duplicados;
-   Tem métodos adicionais aos da interface Collection.
    Algumas de suas implementações mais utilizadas são a **ArrayList** e a **Vector**.

### 2.1 CLASSE ARRAYLIST

Semelhante a um array, contudo, funciona de forma **dinâmica**, sem a necessidade de definir um número específico de elementos que pode caber dentro deste objeto. Pode ser criado de 3 formas: um array vazio, um array com elementos previamente criados ou um array com tamanho pré-definido, tudo a depender de que parâmetro será passado na criação da ArrayList.

Sua sintaxe é: **List<tipo_da_classe> nome_lista = new ArrayList<>()**. Assim, caso queira criar uma ArrayList com elementos de primeira, adicione o nome da Collection que você criou anteriormente entre os parênteses da classe, após a definição do tipo.

Métodos úteis:

-   _add_: adiciona elementos;
-   _sort_: ordena os elementos;
-   _set_: substitui um elemento com base na sua posição;
-   _remove_: remove um elemento com base na posição ou no valor;
-   _get_: pega um valor específico.

Pode-se iterar utilizando _for-each_ ou a API **Iterator**.

### 2.2 CLASSE VECTOR

Muito similar à ArrayList. Porém, contém **métodos "desatualizados"** e é **sincronizado**. Pode ser criado das mesmas formas que o ArrayList, e uma adicional: com a quantidade inicial de elementos e, em seguida, a quantidade de posições que será criada quando essa quantidade inicial for atingida. Por exemplo, se um Vector é criado com capacidade pra 5 elementos e um incremento de 4 posições, quando tais 5 posições forem ocupadas o Vector aumentará sua capacidade em 4 novas posições.

Sua sintaxe é: **List<tipo_da_classe> nome_vector = new Vector<>()** ou **Vector nome_da_lista = new Vector<>()**.

De resto, similar ao funcionamento do ArrayList.
