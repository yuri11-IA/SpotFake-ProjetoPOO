package br.com.spotfake.main;

//Importação das classes que usaremos
import br.com.spotfake.models.Musica;
import br.com.spotfake.models.Podcast;
import br.com.spotfake.actuators.Preferencia;

public class SistemaPrincipal {
    public static void main(String[] args) {
        //Cria variável q receberá nova música
        Musica minhaMusica = new Musica();

        //Instancia nome da musica e cantor
        minhaMusica.setTitulo("Coincidências");
        minhaMusica.setCantor("Jão");

        //Loop para simular grande volume de reproduções da música
        //Para reproduções (começando em 0) < 1000, incremente +1
        for (int reproducoes = 0; reproducoes < 1000; reproducoes++) {
            //Chama o método reproduz() para a musica
            minhaMusica.reproduz();
        }

        //Loop para simular grande volume de curtidas da música
        //Para curtidas (começando em 0) < 1000, incremente +1
        for (int curtidas = 0; curtidas < 50; curtidas++) {
            //Chama o método curte() para a musica
            minhaMusica.curte();
        }

        //Cria variável que receberá novo podcast
        Podcast meuPodcast = new Podcast();

        //Instancia nome do podcast e apresentadores
        meuPodcast.setTitulo("PodPah");
        meuPodcast.setApresentador("Igão e Mítico");

        //Loop para simular grande volume de reproduções do podcast
        //Para reproduções (começando em 0) < 1000, incremente +1
        for (int reproducoes = 0; reproducoes < 1000; reproducoes++) {
            //Chama o método reproduz() para o podcast
            meuPodcast.reproduz();
        }

        //Loop para simular grande volume de curtidas do podcast
        //Para curtidas (começando em 0) < 1000, incremente +1
        for (int curte = 0; curte < 500; curte++) {
            //Chama o método curte() para o podcast
            meuPodcast.curte();
        }

        //Cria variável que receberá nova preferencia
        Preferencia minhaPreferencia = new Preferencia();

        //Chama o método inclui() e aplica as regras para o podcast
        minhaPreferencia.inclui(meuPodcast);
        //Chama o método inclui() e aplica as regras para a música
        minhaPreferencia.inclui(minhaMusica);
    }
}
