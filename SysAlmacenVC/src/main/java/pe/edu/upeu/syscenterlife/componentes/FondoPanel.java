package pe.edu.upeu.syscenterlife.componentes;




import javax.swing.*;
import java.awt.*;
import pe.edu.upeu.syscenterlife.utils.utilsX;

public class FondoPanel extends JPanel {

    private Image image;
    public String nombreImg = "";
    utilsX obj = new utilsX();

    public FondoPanel() {
    }

    @Override
    public void paint(Graphics g) {
        image = new ImageIcon(obj.getFile("img/secrecy-icon.png")).getImage();
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
