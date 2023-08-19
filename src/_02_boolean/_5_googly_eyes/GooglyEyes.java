package _02_boolean._5_googly_eyes;

import processing.core.PApplet;
import processing.core.PImage;

public class GooglyEyes extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    PImage face;
   
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    
    @Override
    public void setup() {
    face = loadImage("src/_02_boolean/_5_googly_eyes/SPyq4k8Fi1TQrZ2T.jpg");
    size(800,600);
    face.resize(width,height);
    
    }

    @Override
    public void draw() {
    background(face);
    fill(0,0,0);
    ellipse(345,248,60,60);
    ellipse(433,245,60,60);
    }

    static public void main(String[] args) {
        PApplet.main(GooglyEyes.class.getName());
    }
}
