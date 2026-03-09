package main;

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
    }
}
