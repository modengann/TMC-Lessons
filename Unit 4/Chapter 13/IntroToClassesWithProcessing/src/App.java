import processing.core.*;
import java.util.*;

public class App extends PApplet {
    ArrayList<Rectangle> rectangles;
    boolean move = false;

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(800, 600);
    }

    public void setup() {
        rectangles = new ArrayList<>();
    }

    public void draw() {
        background(120);

        for (Rectangle r : rectangles) {
            if (move) {
                r.moveX(5);
            }
            r.draw();
        }

    }

    public void mousePressed() {
        rectangles.add(new Rectangle(this, mouseX, mouseY, 100, 50));
    }

    public void keyPressed() {
        if (key == ' ') {
            move = true;
        }
    }
}
