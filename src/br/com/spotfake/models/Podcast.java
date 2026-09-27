package br.com.spotfake.models;

//importa o "contrato"
import br.com.spotfake.actuators.Classificavel;

//Podcast descende de Audio e implementa o "contrato" de  Classificavel
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

    //Sobrescreve e estabelece a regra do 'contrato"
    @Override
    public double getClassificacao() {
        //Se o total de curtidas for menor que 500
        if (this.getTotalCurtidas() > 500){
            //A classificação (nota) será igual a 10
            return 10;
        }
        //Caso contrário
        else {
            //A classificação (nota) será igual a 8
            return 8;
        }
    }
}
