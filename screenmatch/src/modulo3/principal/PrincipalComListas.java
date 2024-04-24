package modulo3.principal;

import modulo3.aula.modelos.Episodio;
import modulo3.aula.modelos.Filme;
import modulo3.aula.modelos.Serie;
import modulo3.aula.modelos.Titulo;
import modulo3.aula.util.CalculadoraDeTempo;
import modulo3.aula.util.FiltroRecomendacao;

import java.util.ArrayList;

public class PrincipalComListas {

    public static void main(String[] args) {

        Filme filme1 = new Filme("O poderoso Chefão", 1970);
        filme1.avalia(10);

        Filme filme2 = new Filme("Avatar", 2023);
        filme2.avalia(7);

        var filme3 = new Filme("Dogville", 2003);
        filme3.avalia(9);

        Serie serie1 = new Serie("Lost", 2000);

        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(filme1);
        titulos.add(filme2);
        titulos.add(filme3);
        titulos.add(serie1);

        for (Titulo titulo: titulos) {
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getClassificacao() > 4) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}
