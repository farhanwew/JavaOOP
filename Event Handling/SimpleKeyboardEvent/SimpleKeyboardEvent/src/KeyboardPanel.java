import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.awt.event.KeyListener;

public class KeyboardPanel extends JPanel implements KeyListener{
    private List<Key> keys;
    public KeyboardPanel(int width, int height) {
        this.setPreferredSize(new Dimension(width, height));
        this.keys = new ArrayList<Key>();
        this.keys.add(new Key(120, 10, 'w'));
        this.keys.add(new Key(230, 10, 's'));
        this.keys.add(new Key(340, 10, 'd'));
        }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //render seluruh keys
        for (Key key : this.keys) {
        key.render(g);;
        }
        }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    @Override
    public void keyReleased(KeyEvent e) {
        char key = e.getKeyChar();
        for (Key k : this.keys) {
        if (k.isSymbolMatch(key)) {
        k.setReleased();
        repaint();}
    }
}
}
