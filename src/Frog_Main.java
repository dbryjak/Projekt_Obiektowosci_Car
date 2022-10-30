public class Frog_Main {
    public static void main(String[] args) {

        Frog frog1= new Frog(10, "Kermit", true);
        // --- zmiana imienia ----------
        // najpierw wymusić zmianę imienia - metodą 'changeName' - przebiega w tle, niewidoczna,
        frog1.changeName("Bolo");
        // program już to widzi - metoda 'viewName' - my jeszcze nie,
        frog1.viewName();
        // ...println - pokazuje nam.
        System.out.println(frog1.viewName());
        // --- zmiana softness'a ----------
        frog1.changeSoftness(false);
        frog1.viewSoftness();   // --- Ten link, jest zbędny
        System.out.println(frog1.viewSoftness());
        // --- zmiana longht ------------
        frog1.changeLonght(15);
        frog1.viewLongth();   // --- Ten link, jest zbędny
        System.out.println(frog1.viewLongth());
        // --- zmiana wcześniejszej zmiany 'longht', na długość w 'calach' - zczytuje dane z linka 19.
        System.out.println(frog1.convert(frog1.viewLongth()));
        frog1.convert(30);
        System.out.println();
    }
}
