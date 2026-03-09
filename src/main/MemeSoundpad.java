package main;
import javax.swing.*;
import java.awt.*;

public class MemeSoundpad extends JFrame {
    JPanel painel;
    public MemeSoundpad() {
        setTitle("Soundpad com memes brasileiros.");
        setSize(600, 600);

        painel = new JPanel(new GridLayout(3,3,10,10));

        adicionaBotao("calma.jpg","","Que isso?");
        adicionaBotao("falcon.jpg","","8 Mil?");
        adicionaBotao("makeTheL.jpg", "", "Faz o L");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(painel);
        setVisible(true);
    }
    private void adicionaBotao(String img, String snd, String nam){

        JButton botao = new JButton(nam);
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/images/" + img));
        botao.setIcon(icon);

        painel.add(botao);
        // Resolver a parte do player de som ainda
    }

    static void main(String[] args) {
        new MemeSoundpad();

    }
}
