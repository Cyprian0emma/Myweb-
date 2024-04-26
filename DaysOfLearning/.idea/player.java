import  java.awt.*;

public class player{
    public int x = 200;
    public int y = 200;
    public int radius = 20;
    public  void update(mainClass mc){};

}
    public  void paint(Graphics g){
    g.fillOval(x,y,radius*2,radius*2);
    }