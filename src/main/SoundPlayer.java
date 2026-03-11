package main;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.sound.sampled.*;

public class SoundPlayer {
    private volatile List<String> sonsTocando = new LinkedList<>();

    public List<String> getSonsTocando() {
        return sonsTocando;
    }

    public void tocarSom(String nomeArquivo) {
        System.out.println(Thread.activeCount());
        File somParaTocar = new File("src/resources/sounds/" + nomeArquivo);
        if (somParaTocar.exists()) {
            System.out.println(sonsTocando);
            if (sonsTocando.contains(somParaTocar.getName())) {

                System.out.println("Aguarde um meme terminar de rodar para toca-lo novamente");
                return;
            }
            new Thread(() -> {
                executarSom(somParaTocar);
            }).start();
        } else {
            System.out.println("Arquivo de som do meme não encontrado");
        }
    }

    private void executarSom(File arquivoSom) {
        String nomeSom = arquivoSom.getName();

        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(arquivoSom);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            sonsTocando.add(nomeSom);
            System.out.println(sonsTocando);

            clip.addLineListener(event -> {
                if (event.getType() == LineEvent.Type.STOP){
                    clip.close();
                    sonsTocando.remove(nomeSom);
                }

            });
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
    };
}
