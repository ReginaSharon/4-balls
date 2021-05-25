import processing.core.PApplet;

public class TryProcessing extends PApplet{
    int x=0, y=0, z=0,k=0;
    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }
    @Override
    public void settings(){
        super.settings();
        size(640,480);
    }

    @Override
    public void draw(){
        ellipse(x,96,20, 20);
        x=x+1;
        ellipse(y,192,20, 20);
        y=y+2;
        ellipse(z,288,20, 20);
        z=z+3;
        ellipse(k,384,20, 20);
        k=k+4;
    }


}
