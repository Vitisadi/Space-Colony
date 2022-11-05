package src;

import processing.core.PApplet;
import processing.core.PVector;

public class Star extends PApplet {
    PVector location, velocity; //declare variable
    float d;
    int c;
    
    Star(){ //constructor
        location = new PVector(Space_Colony.processing.random(Space_Colony.processing.width), Space_Colony.processing.random(Space_Colony.processing.height));
        d = Space_Colony.processing.random(1, 3);
        velocity = new PVector(-d/3, 0);
        c = Space_Colony.processing.color(255);
    }
    
    void display(){ //display
        Space_Colony.processing.fill(c);
        //fill(255);
        Space_Colony.processing.noStroke();
        Space_Colony.processing.circle(location.x, location.y, d);
        
    }
    
    void move(){ //move
        location.add(velocity);
        if(location.x < 0) location.x = Space_Colony.processing.width;
    }
}
