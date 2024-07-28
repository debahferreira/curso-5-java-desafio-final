package br.com.deborahferreira.desafiofinalcurso5.principal;

import br.com.deborahferreira.desafiofinalcurso5.modelos.MinhasPreferidas;
import br.com.deborahferreira.desafiofinalcurso5.modelos.Musica;
import br.com.deborahferreira.desafiofinalcurso5.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Breathing");
        minhaMusica.setCantor("Ariana Grande");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Self Obsessed");
        meuPodcast.setApresentador("Tam Kaur");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
