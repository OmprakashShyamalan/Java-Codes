import processing.core.*; 

public class MyPApplet extends PApplet{

    private String URL = "https://www.bali.com/media/image/663/best-resorts-bali.jpg"; 
    private PImage backgroundImage; 

    public void setup() {
        size(400, 400); 
        backgroundImage = loadImage(URL, "jpg"); 
    }
    public void draw() { 
        image(backgroundImage, 0, 0); 
    }
}