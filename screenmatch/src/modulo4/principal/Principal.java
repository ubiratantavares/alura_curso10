package modulo4.principal;

import modulo4.aula.modelos.Filme;
import modulo4.aula.modelos.Serie;
import modulo4.aula.modelos.Titulo;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        List<String> artistas = new ArrayList<>();

        artistas.add("Adam");
        artistas.add("Paulo");
        artistas.add("Jaqueline");

        System.out.println(artistas);

        Collections.sort(artistas);

        System.out.println(artistas);

        Filme filme1 = new Filme("O poderoso Chefão", 1970);
        filme1.avalia(10);

        Filme filme2 = new Filme("Avatar", 2023);
        filme2.avalia(7);

        var filme3 = new Filme("Dogville", 2003);
        filme3.avalia(9);

        Serie serie1 = new Serie("Lost", 2000);

        List<Titulo> titulos = new LinkedList<>();

        titulos.add(filme1);
        titulos.add(filme2);
        titulos.add(filme3);
        titulos.add(serie1);

        System.out.println(titulos);

        Collections.sort(titulos);

        System.out.println(titulos);

        titulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        System.out.println(titulos);

    }
}
