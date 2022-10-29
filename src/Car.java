public class Car {
    int wheels;
    int seats;
    int lights;
    String colour;

    Car(int wheels, int seats, int light, String colour) {
        this.wheels = wheels;
        // this.wheels - ta wartość ma być...
        // wheels - zapisane  na biało, to  wartość wprowadzana przez klienta. fioletowe - to co musi zapamietać
        this.seats = seats;
        this.lights = lights;
        this.colour = colour;

    }
}
