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

    //Só precisa visualizar
    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

   //Método que será chamado no loop para simulação
    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totalReproducao++;
    }
}