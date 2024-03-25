import processing.core.PApplet;

public class Rectangle {
    int color;
    int width;
    int height;
    PApplet canvas;
    int xPos;
    int yPos;
    int speed;

    public Rectangle(PApplet p, int x, int y, int w, int h) {
        canvas = p;
        width = w;
        height = h;
        speed = (int)canvas.random(4)+ 1;
        xPos = x;
        yPos = y;
        color = canvas.color(canvas.random(255), canvas.random(255), canvas.random(255));
    }

    public int getX(){
        return xPos;
    }
    public int getY(){
        return yPos;
    }

    public void draw() {
        canvas.fill(color);
        canvas.rect(xPos, yPos, width, height);
    }

    public void moveX(int dX) {
        xPos += dX * speed;
        if(xPos + width >= canvas.width){
            xPos = 0;
        }
    }

    // public void changeDirection(){
    //     speed = -speed;
    //     color = canvas.color(canvas.random(255), canvas.random(255), canvas.random(255));
        
    // }

    // public void moveY(int dY) {
    //     yPos += dY;
    // }

}
