package main;
import javax.swing.*;
import java.awt.*;

public class MemeButton extends JButton {
    public MemeButton(String img, String snd, String nam) {
        super(nam);
        var path = getClass().getResource("/resources/images/" + img);
        if(path != null) {
            ImageIcon icon = new ImageIcon(path);
            setIcon(icon);
        } else {
            System.out.println("Arquivo não encontrado!");
        }

        setBackground(Color.red);
        setForeground(Color.white);
        setFont(new Font("Arial", Font.BOLD, 14));
        setFocusable(false);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setHorizontalTextPosition(JButton.CENTER);
        setVerticalTextPosition(JButton.BOTTOM);
        setPreferredSize(new Dimension(150,150));


        System.out.println(snd); // para remover erro de desuso.
    }
}
