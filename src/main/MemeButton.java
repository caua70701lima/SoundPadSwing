package main;
import javax.swing.*;

public class MemeButton extends JButton {
    public MemeButton(String img, String snd, String nam) {
        super(nam);
        var path = getClass().getResource("/resources/images" + img);
        if(path != null) {
            ImageIcon icon = new ImageIcon(path);
            setIcon(icon);
        } else {
            System.out.println("Arquivo não encontrado!");
        }
        System.out.println(snd); // para remover erro de desuso.
    }
}
