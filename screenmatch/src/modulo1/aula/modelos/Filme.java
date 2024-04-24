package modulo1.aula.modelos;

import modulo1.aula.util.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (calculaMediaDasAvaliacoes() / 2);
    }
}
