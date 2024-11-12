import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class MousePanel extends JPanel implements MouseListener, MouseMotionListener{
    private int areaWidth;
    private int areaHeight;
    private String text;

    public MousePanel(int areaWidth, int areaHeight){
        this.areaWidth = areaWidth;
        this.areaHeight = areaHeight;
        this.text = "Lakukan sesuatu dengan mouse";
        this.setPreferredSize(new Dimension(areaHeight, areaWidth));

        this.addMouseListener(this);
        this.setFocusable(true);

        this.addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(this.text, 0, this.areaHeight / 2);
        }

    public void mouseClicked(MouseEvent e) {
        this.text = "Tombol mouse diklik pada posisi X: " + e.getX() +
        " Y: " + e.getY();
        repaint();
        }
    
        public void mousePressed(MouseEvent e) {
        this.text = "Tombol mouse ditekan pada posisi X: " + e.getX() +
        " Y: " + e.getY();
        repaint();
        }
        
        public void mouseReleased(MouseEvent e) {
        this.text = "Tombol mouse dilepas pada posisi X: " + e.getX() +
        " Y: " + e.getY();
        repaint();
        }

        public void mouseEntered(MouseEvent e) {
        this.text = "Mouse memasuki area MousePanel";
        repaint();
        }

        public void mouseExited(MouseEvent e) {
        this.text = "Mouse meninggalkan area MousePanel";
        repaint();
        }

    
        public void mouseDragged(MouseEvent e){
            this.text = "Position x= " + e.getX() + " y=" + e.getY() + "Dragged";
            repaint();
        }

        public void mouseMoved(MouseEvent e){
            this.text = "Tombol mouse dilepas pada posisi X = " + e.getX() + " y= " + getY();
            repaint();
        }
}



