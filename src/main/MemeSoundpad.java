package main;
import javax.swing.*;
import java.awt.*;

public class MemeSoundpad extends JFrame {
    JPanel painel;
    public MemeSoundpad() {
        setTitle("Soundpad com memes brasileiros.");
        setSize(600, 600);

        painel = new JPanel(new GridLayout(3,3,10,10));
        painel.setBackground(new Color(0,27,148));
        painel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        JButton memeCalmaButton = new MemeButton("calma.jpg","Que isso?");

        painel.add(memeCalmaButton);
        painel.add(new MemeButton("falcon-8-mil.jpg","8 Mil?"));
        painel.add(new MemeButton("faz-o-l.jpg", "Faz o L"));
        painel.add(new MemeButton("makita.jpg", "Makita"));
        painel.add(new MemeButton("plankton-ohh.jpg", "Plankton - ohhhh"));
        painel.add(new MemeButton("olha-o-porco.jpg", "Olha o porco"));
        painel.add(new MemeButton("pense-no-lula.jpg", "Pense no Lula"));
        painel.add(new MemeButton("risadas-chaves.jpg", "Chaves"));
        painel.add(new MemeButton("bolsonaro-telefone.jpg", "Pegaram meu telefone"));

        memeCalmaButton.addActionListener(e -> {
            SoundPlayer.tocarSom("que-e-isso-calma.wav");
            System.out.println("tocando som");
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(painel);
        setVisible(true);
    }


    static void main(String[] args) {
        new MemeSoundpad();
    }
}
