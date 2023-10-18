import processing.core.PApplet;

public class Bullet {
    private int x;
    private int y;
    private int speed;
    public Bullet(int x1,int y1,int speed1) {
        this.x = x1;
        this.y = y1;
        this.speed = speed1;
    }


    public int getX(){
        return this.x;
    }


    public int getY(){
        return this.y;
    }


    public void draw(PApplet window){
        window.fill(244,4,244);
        window.rect(x,y,5,5);

    }

    public void move(){
        y=+speed;
    }


}
