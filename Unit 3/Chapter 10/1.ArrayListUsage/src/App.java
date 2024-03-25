import processing.core.*;
import java.util.*;

public class App extends PApplet{

    ArrayList<Float> xs = new ArrayList<>();
    ArrayList<Float> ys = new ArrayList<>();
    ArrayList<Integer> colors = new ArrayList<>();

    
    int speed = 5;
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void draw(){
        background(120);
        for(int i = 0; i < xs.size(); i++){
            fill(colors.get(i));
            ellipse(xs.get(i), ys.get(i), 50, 50);
        }
    }

    public void setup(){

    }

    public void mousePressed(){
        xs.add((float)mouseX);
        ys.add((float)mouseY);
        colors.add(color(random(255), random(255), random(255)));
    }

    public void keyPressed(){
        if(key == ' '){
            colors.clear();
            for(int i = 0; i < xs.size(); i++){
                colors.add(color(random(255), random(255), random(255)));
            }
        }

        if(keyCode == UP){
            for(int i = 0; i < xs.size(); i++){
                ys.set(i, ys.get(i) - speed);
            }
        }

        if(keyCode == DOWN){
            for(int i = 0; i < xs.size(); i++){
                ys.set(i, ys.get(i) + speed);
            }

        }

        if(keyCode == LEFT){
            for(int i = 0; i < xs.size(); i++){
                xs.set(i, xs.get(i) - speed);
            }
        }

        if(keyCode == RIGHT){
            for(int i = 0; i < xs.size(); i++){
                xs.set(i, xs.get(i) + speed);
            }
            
        }
    }



    public void settings(){
        size(800, 600);
    }
}
