package modulo2;

import modulo2.aula.modelos.Episodio;
import modulo2.aula.modelos.Filme;
import modulo2.aula.modelos.Serie;
import modulo2.aula.util.CalculadoraDeTempo;
import modulo2.aula.util.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Filme filme1 = new Filme("O poderoso Chefão", 1970);
        filme1.setDuracaoEmMinutos(180);
        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println(filme1.getNome());
        System.out.println(filme1.getAnoDeLancamento());
        System.out.println(filme1.getSomaDasAvaliacoes());
        System.out.println(filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.calculaMediaDasAvaliacoes());

        Filme filme2 = new Filme("Avatar", 2023);
        filme2.setDuracaoEmMinutos(200);
        filme1.avalia(7);

        var filme3 = new Filme("Dogville", 2003);
        filme3.setDuracaoEmMinutos(200);
        filme3.avalia(10);

        Serie serie = new Serie("Lost", 2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duracao para maratonar a serie: " + serie.getDuracaoEmMinutos());

        Episodio episodio1 = new Episodio(1, "Episodio 1", serie);
        episodio1.setTotalVisualizacoes(300);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);
        filtro.filtra(filme2);
        filtro.filtra(episodio1);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        System.out.println("Tamanho da lista: " + filmes.size());
        System.out.println("Primeiro filme da lista: " + filmes.get(0).getNome());
        System.out.println(filmes);


    }
}
