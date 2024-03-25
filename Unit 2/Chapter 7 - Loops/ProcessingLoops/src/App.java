import processing.*;
import processing.core.PApplet;

public class App extends PApplet{
    int y = 0;
    int x = 50;
    public static void main(String[] args){
        PApplet.main("App");


        
    }

    public void settings(){
        size(800,600);
    }

    public void draw(){
        background(100);
        rect(x, y, 100, 100);
        y += 5;

        if(y >= 600){
            y = 0;
            x+= 5;
        }
    }
}
