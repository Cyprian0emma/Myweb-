import java.applet.*;
import  java.awt.*;


class mainClass extends Applet implements Runnable{
    Thread thread= new Thread(this);
    player p;
    boolean running = true;

    public  void init(){}
    public void start() {
        thread.start();
    }
    public void destroy(  ){
        running = false;
    }
    public void stop(){
        running = false;
    }
    public void run(){

        while (running){
            repaint();

            try {
                thread.sleep(20);

            }catch (InterruptedException e){
                System.out.println("errow has occured ");
            }
        }
    }
}