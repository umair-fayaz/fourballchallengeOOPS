import processing.core.PApplet;

public class Ball {
    int yPosition,xPosition;
    private int speed;

    Ball(int xPosition,int speed, int yPosition) {
        this.xPosition=xPosition;
        this.speed = speed;
        this.yPosition = yPosition;

    }

    public void drawCircle(PApplet draw){
        draw.ellipse(this.xPosition, this.yPosition, 10, 10);
        this.xPosition=this.xPosition+this.speed;
    }
}