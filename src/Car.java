public class Car {
    int wheels;
    int seats;
    int lights;
    String colour;

    Car(int wheels, int seats, int lights, String colour) {
        this.wheels = wheels;
        // this.wheels - ta wartość ma być...
        // wheels - zapisane  na biało, to  wartość wprowadzana przez klienta. fioletowe - to co musi zapamietać
        this.seats = seats;
        this.lights = lights;
        this.colour = colour;

    }
    Car(String kolor){
        this.wheels = 4;
        this.colour = kolor;
    }

    public void writeAll(){
        System.out.println("Kola " +this.wheels);
        System.out.println("Siedzenia " +this.seats);
                System.out.println("Swiatla " +this.lights);
                        System.out.println("Kolor " +this.colour );
    }
}
