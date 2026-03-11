package main;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MemeSoundpad extends JFrame {
    JPanel painel;
    SoundPlayer soundPlayer = new SoundPlayer();
    public MemeSoundpad() {
        setTitle("Soundpad com memes brasileiros.");
        setSize(600, 600);

        painel = new JPanel(new GridLayout(3,3,10,10));
        painel.setBackground(new Color(0,27,148));
        painel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        String imagensDirectory = "src/resources/images";
        String[] imagens = new File(imagensDirectory).list();
        if (imagens == null) {
            System.out.println("Memes não encontrados.");
            return;
        }

        for (String imagem : imagens) {
            String nomeImagemSemExtensao = imagem.split("\\.")[0];
            //replace all contem uma regex que percorre a string, e se o caractere for _ ou - substitui por espaço
            String nomeImagemUI = nomeImagemSemExtensao.replaceAll("[_-]", " ");
            JButton memeButton = new MemeButton(imagem, nomeImagemUI);
            painel.add(memeButton);
            memeButton.addActionListener(e -> {
                soundPlayer.tocarSom(nomeImagemSemExtensao + ".wav");
            });

        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(painel);
        setVisible(true);
    }


    static void main() {
        new MemeSoundpad();
    }
}
