public class Car {
    String brand;
    String model;
    int speed;
    public Car( String brand, String model){
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }
    public void accelerate(){
        speed = speed + 10;
    }
    public void showInfo(){
        System.out.println("Brand: " + brand);
        System.out.println( "Model: " + model);
        System.out.println( "Speed: " + speed);
    }
}
