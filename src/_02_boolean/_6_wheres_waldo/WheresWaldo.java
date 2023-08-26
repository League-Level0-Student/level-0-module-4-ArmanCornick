package _02_boolean._6_wheres_waldo;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import processing.core.PApplet;
import processing.core.PImage;


public class WheresWaldo extends PApplet {
	static final int WIDTH = 2000;
	static final int HEIGHT = 1333;
	PImage waldo;


	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		waldo = loadImage("src/_02_boolean/_6_wheres_waldo/WaldoBanner.jpeg");
		waldo.resize(WIDTH, HEIGHT);
		background(waldo);
	}

	@Override
	public void draw() {
		if(mousePressed) {
			if(mouseX>1219 && mouseX<1252 && mouseY>491 && mouseY<549) {
				playWhoohoo();	
			}
			else {
			playDoh();
			}
		}
	}

	static public void main(String[] args) {
		PApplet.main(WheresWaldo.class.getName());
	}

	/*********************** DO NOT MODIFY THE CODE BELOW ********************/

	Clip clip = null;

	public void playDoh() {
		if (clip == null || !clip.isActive()) {
			clip = playSound("homer-doh.wav");
		}
	}

	public void playWhoohoo() {
		if (clip == null || !clip.isActive()) {
			clip = playSound("homer-woohoo.wav");
		}
	}

	public Clip getSong(String fileName) {
		String path = "src/";
		Clip clip = null;

		// Note: use .wav files
		try {
			clip = AudioSystem.getClip();
			AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File(path + fileName));
			clip.open(inputStream);
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage() + " for " + path + fileName);
		}

		return clip;
	}

	public Clip playSound(String fileName) {
		final Clip clip = getSong(fileName);

		new Thread(new Runnable() {
			@Override
			public void run() {
				clip.start();
			}
		}).start();

		return clip;
	}
}
