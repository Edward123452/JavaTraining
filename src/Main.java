//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        myCar.setSpeed(100);
        System.out.println( myCar.getSpeed());
        myCar.setSpeed(-50);
        System.out.println( myCar.getSpeed());
        myCar.setSpeed(250);
        System.out.println( myCar.getSpeed());
        //myCar.showInfo();

        //myCar.accelerate();
        //myCar.accelerate();
        //myCar.accelerate();

        //myCar.showInfo();
    }
}