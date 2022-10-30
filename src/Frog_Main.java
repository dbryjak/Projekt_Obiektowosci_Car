public class Frog_Main {
    public static void main(String[] args) {

        Frog frog1= new Frog(10, "Kermit", true);
        // najpierw wymusić zmianę imienia - metodą 'changeName' - przebiega w tle, niewidoczna,
        frog1.changeName("Bolo");
        // program już to widzi - metoda 'viewName' - my jeszcze nie,
        frog1.viewName();
        // ...println - pokazuje nam.
        System.out.println(frog1.viewName());

    }
}
