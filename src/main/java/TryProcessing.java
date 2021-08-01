import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    int height=HEIGHT/5;
    int numberOfBalls=4,yPosition;
    private Ball[] ball =new Ball[numberOfBalls];

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }
    @Override
    public void setup() {
        createBall();
    }

    public void createBall()
    {
        for(int iterator=0;iterator<numberOfBalls;iterator++)
        {
            yPosition=height*(iterator+1);
            ball[iterator]=new Ball(0,iterator+1,yPosition);
        }
    }
    @Override
    public void draw() {
        for (int iterator = 0; iterator < numberOfBalls; iterator++) {
            ball[iterator].drawCircle(this);
        }

    }
}
