package main;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;

public class SoundPlayer {
    static public void tocarSom(String nomeArquivo) {
        try {
            File file = new File("src/resources/sounds/" + nomeArquivo);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException error) {
            error.printStackTrace();
            if (error instanceof UnsupportedAudioFileException) {
                System.out.println("Tipo de arquivo de áudio não suportado");
                return;
            } else if (error instanceof IOException) {
                System.out.println("arquivo de aúdio não encontrado");
                return;
            } else if (error instanceof LineUnavailableException) {
                System.out.println("Linha de áudio não encontrado ou indisponível");
                return;
            }
        }
    }
}
