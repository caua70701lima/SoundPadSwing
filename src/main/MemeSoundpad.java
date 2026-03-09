package main;
import javax.swing.*;
import java.awt.*;

public class MemeSoundpad extends JFrame {
    JPanel painel;
    public MemeSoundpad() {
        setTitle("Soundpad com memes brasileiros.");
        setSize(600, 600);

        painel = new JPanel(new GridLayout(3,3,10,10));

        painel.add(new MemeButton("calma.jpg","","Que isso?"));
        painel.add(new MemeButton("falcon.jpg","","8 Mil?"));
        painel.add(new MemeButton("makeTheL.jpg", "", "Faz o L"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(painel);
        setVisible(true);
    }


    static void main(String[] args) {
        new MemeSoundpad();

    }
}
