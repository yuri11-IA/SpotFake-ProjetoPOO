package br.com.spotfake.actuators;

//Importa a classe Audio
import br.com.spotfake.models.Audio;

//Cria a classe Preferencia
public class Preferencia {
    //Cria o método para incluir
    public void inclui(Audio audio){
        //Se o audio estiver com a classificação >= 9
        if (audio.getClassificacao() >= 9){
            //Imprima a frase abaixo
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!!");
        }
        //Caso contrário
        else {
            //Imprima a frase abaixo
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo. Escute também!");
        }
    }
}
