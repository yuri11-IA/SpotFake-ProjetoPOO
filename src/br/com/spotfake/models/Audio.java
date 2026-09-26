package br.com.spotfake.models;

public class Audio {
    //Privado para manter a segurança dos dados
    private String titulo;
    private int totalReproducao;
    private int totalCurtidas;
    private double classificacao;

    //Permite a alteração
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    //Haverá um loop com alteração
    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    //Apenas mostra, pois virá de outra regra (Classificavel)
    public double getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducao++;
    }
}