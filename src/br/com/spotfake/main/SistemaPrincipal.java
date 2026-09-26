package br.com.spotfake.main;

import br.com.spotfake.models.Musica;
import br.com.spotfake.models.Podcast;
import br.com.spotfake.actuators.Preferencia;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Coincidências");
        minhaMusica.setCantor("Jão");

        for (int reproducoes = 0; reproducoes < 1000; reproducoes++) {
            minhaMusica.reproduz();
        }

        for (int curtidas = 0; curtidas < 50; curtidas++) {
         minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("PodPah");
        meuPodcast.setApresentador("Igão e Mítico");

        for (int reproducoes = 0; reproducoes < 1000; reproducoes++) {
            meuPodcast.reproduz();
        }

        for (int curte = 0; curte < 500; curte++) {
            meuPodcast.curte();
        }

        Preferencia minhaPreferencia = new Preferencia();

        minhaPreferencia.inclui(meuPodcast);
        minhaPreferencia.inclui(minhaMusica);
    }
}
