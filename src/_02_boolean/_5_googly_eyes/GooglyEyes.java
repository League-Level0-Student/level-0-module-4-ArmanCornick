package _02_boolean._5_googly_eyes;

import processing.core.PApplet;
import processing.core.PImage;

public class GooglyEyes extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int currentX = 340;
	int currentY = 255;

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
		fill(255,255,255);
		ellipse(345,248,60,60);
		ellipse(433,245,60,60);
		fill(255,255,255);
		if(mousePressed) {
			System.out.print(mouseX);
			System.out.println(" "+mouseY);
		}

		if(mouseX<319 || mouseX>369 || mouseY<233 || mouseY>271) {
			fill(0,0,0);
			ellipse(currentX,currentY,10,10);
			ellipse(currentX+88,currentY-3,10,10);
		}
		else {
			fill(0,0,0);	
			ellipse(mouseX,mouseY,10,10);
			ellipse(mouseX+88,mouseY-3,10,10);
			currentX = mouseX;
			currentY = mouseY;

		}
	}

	static public void main(String[] args) {
		PApplet.main(GooglyEyes.class.getName());
	}
}
