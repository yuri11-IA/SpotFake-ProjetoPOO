package br.com.spotfake.models;

//importa o "contrato"
import br.com.spotfake.actuators.Classificavel;

//Musica descende de Audio e implementa o "contrato" de  Classificavel
public class Musica extends Audio implements Classificavel {
    private String album;
    private String genero;
    private String cantor;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    //Sobrescreve e estabelece a regra do 'contrato"
    @Override
    public double getClassificacao() {
        //Se o total de reproduções for menor que 2000
        if (this.getTotalReproducao() > 2000){
            //A classificação (nota) será igual a 10
            return 10;
        }
        //Caso seja menor
        else {
            //A classificação (nota) será igual a 7
            return 7;
        }
    }


}
