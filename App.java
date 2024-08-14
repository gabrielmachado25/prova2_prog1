
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Criando a lista de livros da biblioteca
        List<ItemBiblioteca> colecao = new ArrayList<>();
        colecao.add(new Livro("Livro 'De Belem a Yokohama'", "L001", 2006, "Autor Fernando Carvalho"));
        colecao.add(new Livro("Livro 'História do Futebol'", "L010", 1940, "Pelé"));
        colecao.add(new Revista("Revista 'Placar'", "R017", 2020, 7));
        colecao.add(new Revista("Revista 'ESPN'", "R021", 2023, 23));

        // Impressão dos itens na ordem original
        System.out.println("=== Coleção Original ===");
        for (ItemBiblioteca itemOriginal : colecao) {
        System.out.println(itemOriginal);
        }

        /*AQUI TEMOS O POLIMORFISMO:
        A variável itemOriginal é declarada como do tipo ItemBiblioteca, que é a CLASSE PAI.
        Só que, a "colecao" possui instâncias tanto da classe Livro quanto da classe Revista.
        Durante a iteração, o polimorfismo permite que o método toString() seja chamado de forma dinâmica objeto por objeto da lista
        chamando a versão apropriada de acordo com o tipo real do objeto (se é um livro ou uma revista). Isso é possível porque as
        classes filhas (Livro e Revista) sobrescrevem o método toString() da classe pai (ItemBiblioteca), permitindo que o comportamento
        específico de cada classe seja executado. */

        System.out.println();

         // Ordenação por ano utilizando a classe Collections
         Collections.sort(colecao, (item1, item2) -> Integer.compare(item1.getAno(), item2.getAno()));

        // Impressão dos itens ordenados por ano
        System.out.println("=== Coleção Ordenada por Ano ===");
        for (ItemBiblioteca itemAno : colecao) {
        System.out.println(itemAno);

/*Utilizei o método sort da classe Collections (declarei ela no início dessa classe App) para ordenar a lista colecao.
A ordenação é feita com o comparador que compara dois itens (item1 e item2) com base no valor retornado por Integer.compare(item1.getAno(),
item2.getAno()).
Caso o item1 tiver um ano menor que o item2, retorna um valor negativo.
Caso os anos sejam iguais, retorna zero.
Caso item1 for maior que o item2, retorna um valor positivo.
No final, a lista é ordenada em ordem crescente com base no ano de publicação dos itens. */

      }
    }
}

