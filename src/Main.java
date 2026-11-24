//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        for ( int i=0; i < 21; i++){
            System.out.println( myCar.accelerate());
        }
        int currentSpeed = myCar.accelerate();
        System.out.println( currentSpeed);
    }
}