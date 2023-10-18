import processing.core.PApplet;

public class Tank {
    private int health;
    private int x;
    private int y;
    private int movement_speed;
    private boolean IsAlive;


    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        IsAlive = true;
    }


    public void notAlive(){
        IsAlive = !IsAlive;
    }


    public int getX(){
        return this.x;
    }


    public int getY(){
        return this.y;
    }


    public void move(){
        x ++; // change speed later
        //no need to make y move bc we are working with a line
    }
    public void draw(PApplet window){
        window.fill(255);
        window.rect(x, y, 75,50);
    }
}
