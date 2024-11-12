package id.its.pbo.keyboardevent;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Key {
    private static final int WIDTH = 50;
    private static final int HEIGHT = 50;
    private int x;
    private int y;
    private char symbol;
    private Color color;

    public Key(int x, int y, char symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
        this.color = new Color(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256));
    }

    public void render(Graphics g) {
        // Render tuts sesuai dengan warna saat ini
        g.setColor(this.color);
        g.fillRect(this.x, this.y, WIDTH, HEIGHT);

        // Render simbol pada tuts
        int stringPosX = this.x + (WIDTH / 3);
        int stringPosY = this.y + (HEIGHT / 2);
        g.setColor(Color.BLACK);
        g.drawString(String.valueOf(this.symbol), stringPosX, stringPosY);
    }
    
    
    public boolean isSymbolMatch(char symbol) {
        return this.symbol == symbol;
    }

    public void setPressed() {
        this.color = this.color = new Color(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256));
    }

    public void setReleased() {
        this.color = this.color = new Color(new Random().nextInt(256), new Random().nextInt(256), new Random().nextInt(256));
    }
}