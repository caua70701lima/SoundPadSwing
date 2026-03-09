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

        painel.add(new MemeButton("calma.jpg","","Que isso?"));
        painel.add(new MemeButton("falcon.jpg","","8 Mil?"));
        painel.add(new MemeButton("makeTheL.jpg", "", "Faz o L"));
        painel.add(new MemeButton("makita.jpg", "", "Makita"));
        painel.add(new MemeButton("ohhhh.jpg", "", "Plankton - ohhhh"));
        painel.add(new MemeButton("olha o porco.jpg", "", "Olha o porco"));
        painel.add(new MemeButton("PenseNoLula.jpg", "", "Pense no Lula"));
        painel.add(new MemeButton("rs.jpg", "", "Chaves"));
        painel.add(new MemeButton("telefone.jpg", "", "Pegaram meu telefone"));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(painel);
        setVisible(true);
    }


    static void main(String[] args) {
        new MemeSoundpad();

    }
}
