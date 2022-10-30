public class Frog {
    // wypisane wszystkie PARAMETRY
    private int longth;         // INT - cyfry
    private String name;        // String - zmienna literowa
    private boolean softness;   // boolean - zmienna
                                // private - enkapsulacja, czyli zamknięcie dostępu do naszej klasy

    // KONSTRUKTOR
    Frog (int longth, String name, boolean softness) {
        this.longth = longth;
        this.name = name;
        this.softness = softness;
    }
    // METODA - 'changeName'
    // int - zwraca wartość liczbową,
    // String - zwraca nazwę,
    // String [] - zwraca tablicę Stringów,
    // void (pustka) - modyfikator dostępu publicznego - niczego nie zwraca, tylko nadaje nowe imię -
    // tzn. nadaje nową wartość w 'name'
    // chengeName - zmiana imienia
    public void changeName(String name){
        this.name = name;
    }
}
