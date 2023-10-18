import processing.core.PApplet;

public class Tower {
    private int x;
    private int y;
    private int bulletspeed;


    public Tower(int x, int y){
        this.x =x;
        this.y = y;
    }


    public void shoot(PApplet window){
        if(y>=400){
            Bullet bullet = new Bullet(x+20,y+40, 3);
            bullet.draw(window );
        }else{
            Bullet bullet = new Bullet(x+20,y+40, -3);
            bullet.draw(window );
        }


    }


    public void setPosition(int mouseX, int mouseY){
        //need to write method
    }


    public void draw(PApplet window){
        window.fill(100,100,100);
        window.rect(x,y,40,40);
    }


}
