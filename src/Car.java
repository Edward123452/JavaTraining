public class Car {
    private String brand;
    private String model;
    private int speed;
    public Car( String brand, String model){
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }
    /*
    public void accelerate(){
        speed = speed + 10;
    }
    */
    public int accelerate(){
        if( speed + 10 <= 200){
            speed +=10;
        }
        return speed;
    }

    public void showInfo(){
        System.out.println("Brand: " + brand);
        System.out.println( "Model: " + model);
        System.out.println( "Speed: " + speed);
    }
    public int getSpeed(){
        return speed;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }

    public void setBrand( String brand){
        this.brand = brand;
    }
    public void setSpeed( int speed ){
        if( speed >= 0 && speed <= 200){
            this.speed = speed;
        } else {
            System.out.println ( "Invalid speed!");
        }
    }

}
