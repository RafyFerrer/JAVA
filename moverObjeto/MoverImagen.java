import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoverImagen extends JFrame implements KeyListener {

    private ImageIcon imagen;
    private JLabel etiquetaImagen;
    private int x, y;

    public MoverImagen() {
        
        super("Mover Imagen");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Cargar la imagen
        imagen = new ImageIcon("tu_imagen.png");
        etiquetaImagen = new JLabel(imagen);
        etiquetaImagen.setBounds(x, y, imagen.getIconWidth(), imagen.getIconHeight());
        add(etiquetaImagen);

        addKeyListener(this);
        setVisible(true);
        

    }

    public void keyPressed() {

        KeyEvent e;
        int codigo = e.getKeyCode();
        switch (codigo) {
            case KeyEvent.VK_UP:
                y -= 10;
                break;
            case KeyEvent.VK_DOWN:
                y += 10;
                break;
            case KeyEvent.VK_LEFT:
                x -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                x += 10;   

                break;
        }
        etiquetaImagen.setBounds(x, y, imagen.getIconWidth(), imagen.getIconHeight());
        repaint();
    }

    // Métodos vacíos para implementar KeyListener
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        MoverImagen ima;        
        ima = new MoverImagen();
        ima.keyPressed();
    }
}