package pe.edu.upeu.syscenterlife.utils;

import javax.swing.*;

/**
 * Clase Principal para manejo de alertas
 *
 * @see <br>
 * El constructor resive 3 parametros(mensaje, tipo_de_alerta,
 * icono_personalizado)
 * <h1>El parámetro tipoDialog tiene las siguientes opciones: JOptionPane</h1>
 *
 * <ol><li>WARNING_MESSAGE</li><li>ERROR_MESSAGE</li><li>PLAIN_MESSAGE</li><li>IN
 * FORMATION_MESSAGE</li>
 * <li>QUESTION_MESSAGE</li></ol>
 *
 * @see <a href = "https://github.com/davidmp" />Aqui Github</a>
 * @return No hay retorno de metodos*/
 
public class MsgBox {

    utilsX obj = new utilsX();
    JPanel p;
    ImageIcon icon = null;

    public MsgBox() {
    }

    public MsgBox(String msg, int tipoDialog, String iconPropio) {
        if (!iconPropio.trim().equals("")) {
            icon = new ImageIcon(obj.getFile(iconPropio));
            JOptionPane.showMessageDialog(p, msg, "Hola", tipoDialog, icon);
        } else {
            JOptionPane.showMessageDialog(p, msg, "Hola", tipoDialog);
        }
    }

    public static void main(String[] args) {
        MsgBox msgBox = new MsgBox("Mensaje", JOptionPane.ERROR_MESSAGE, "img/secrecy-icon.png");
    }
}
