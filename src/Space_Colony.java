package src;

import processing.core.PApplet;
import processing.core.PImage;
import java.util.ArrayList;


//import processing.core.PImage;

public class Space_Colony extends PApplet {
    ArrayList<Star> starfield = new ArrayList<Star>();
    public static PApplet processing;
    public void settings () {
        size(1100, 800);
    }

    public void setup() {
        processing = this;

        for(int i = 0; i < 500; i++){  //adds stars to the starfield
            starfield.add(new Star()); 
        }
    }

    public void draw() {
        background(35);
        for(Star s : starfield){  //displays and moves stars of the starfield
            s.display();
            s.move();
        }
    }

    public static void main(String[] args) {
        PApplet.main("src.Space_Colony");
    }

}