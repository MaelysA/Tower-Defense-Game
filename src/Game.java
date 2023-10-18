import processing.core.PApplet;

import java.util.ArrayList;


public class Game extends PApplet {
    // TODO: declare game variables

    Tower[] towers;
    ArrayList<Tank> tanks;

    static int timer;
    int tankNum;
    public void settings() {
        size(600, 600);   // set the window size


    }


    public void setup() {
        // TODO: initialize game variables
        timer = 150;
        tankNum = 0;

        //SETTING UP THE TOWERS------------------------------
        towers = new Tower[8];
        int i = 1;
        for(int t = 0; t<towers.length/2;t++){
            towers[t] = new Tower(i*100, 200-40);
            i++;
        }
        int j = 1;
        for(int t = towers.length/2; t<towers.length;t++){
            towers[t] = new Tower(j*100, 400);
            j++;
        }
        //---------------------------------------------------
        //SETTING UP THE TANKS
        tanks = new ArrayList<>();



    }


    /***
     * Draws each frame to the screen.  Runs automatically in a loop at frameRate frames a second.
     * tick each object (have it update itself), and draw each object
     */
    public void draw() {
        timer--;
        System.out.println(timer);

        background(255);    // paint screen white
        fill(0);
        rect(0,200,width,200);

        for(Tower t : towers){
            t.draw(this);
            t.shoot(this);
        }

        if(timer<=0){
            tanks.add(new Tank(-75, 275));
            timer = 150;
        }

        for (int i = 0; i < tanks.size(); i++) {
            tanks.get(i).draw(this);
            tanks.get(i).move();
        }



    }







    public static void main(String[] args) {
        PApplet.main("Game");
    }


}
