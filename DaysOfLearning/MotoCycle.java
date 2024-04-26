public class MotoCycle {
    String make;
    String color;
    boolean engineState;

    void startEngine(){
        if (engineState == true){
            System.out.println("engine is already on");
        }else {
            engineState = true;
            System.out.println(" The engine is now on");
        }
    }

    void showAtts(){
        System.out.println("This motocycle is a " + color + "  " + make);
        if (engineState == true){
            System.out.println("The engine is on");

        }else
            System.out.println("The engine is off ");

    }

    public static void main(String[] args) {
        MotoCycle m = new MotoCycle();
        m.make = "yamaha RZ360";
        m.color = "yellow";
        System.out.println("Calling showAtts.....");
        m.showAtts();
        System.out.println("...........");
        System.out.println("Starting engine....");
        m.startEngine();
        System.out.println("..............");
        System.out.println("Calling ShowAtts....");
        m.showAtts();
        System.out.println("............");
        System.out.println("Starting engine....");
        m.startEngine();
    }
}
