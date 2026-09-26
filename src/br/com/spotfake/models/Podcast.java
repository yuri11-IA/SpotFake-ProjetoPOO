package br.com.spotfake.models;

import br.com.spotfake.actuators.Classificavel;

public class Podcast extends Audio implements Classificavel {
    private String descricao;
    private String apresentador;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        }else {
            return 8;
        }
    }
}
