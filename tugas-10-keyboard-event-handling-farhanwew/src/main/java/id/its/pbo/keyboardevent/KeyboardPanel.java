package id.its.pbo.keyboardevent;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class KeyboardPanel extends JPanel implements KeyListener {

    private List<Key> keys;

    public KeyboardPanel(int width, int height) {
        this.setPreferredSize(new Dimension(width, height));
        this.keys = new ArrayList<Key>();
        this.keys.add(new Key(10, 10, 'q'));
        this.keys.add(new Key(70, 10, 'w'));
        this.keys.add(new Key(130, 10, 'e'));
        this.keys.add(new Key(190, 10, 'r'));
        this.keys.add(new Key(250, 10, 't'));
        this.keys.add(new Key(310, 10, 'y'));
        this.keys.add(new Key(370, 10, 'u'));
        this.keys.add(new Key(430, 10, 'i'));
        this.keys.add(new Key(490, 10, 'o'));
        this.keys.add(new Key(550, 10, 'p'));
        
        this.keys.add(new Key(30, 80, 'a'));
        this.keys.add(new Key(90, 80, 's'));
        this.keys.add(new Key(150, 80, 'd'));
        this.keys.add(new Key(210, 80, 'f'));
        this.keys.add(new Key(270, 80, 'g'));
        this.keys.add(new Key(330, 80, 'h'));
        this.keys.add(new Key(390, 80, 'j'));
        this.keys.add(new Key(450, 80, 'k'));
        this.keys.add(new Key(510, 80, 'l'));
        
        this.keys.add(new Key(80, 150, 'z'));
        this.keys.add(new Key(140, 150, 'x'));
        this.keys.add(new Key(200, 150, 'c'));
        this.keys.add(new Key(260, 150, 'v'));
        this.keys.add(new Key(320, 150, 'b'));
        this.keys.add(new Key(380, 150, 'n'));
        this.keys.add(new Key(440, 150, 'm'));

        this.addKeyListener(this);
        this.setFocusable(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Render seluruh keys
        for (Key key : this.keys) {
            key.render(g);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Kosongkan metode ini
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();
        for (Key k : this.keys) {
            if (k.isSymbolMatch(key)) {
                k.setPressed();
                repaint();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        char key = e.getKeyChar();
        for (Key k : this.keys) {
            if (k.isSymbolMatch(key)) {
                k.setReleased();
                repaint();
            }
        }
    }
}