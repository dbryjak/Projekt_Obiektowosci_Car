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
    // METODA - 'change...'
    // int - zwraca wartość liczbową,
    // String - zwraca nazwę,
    // String [] - zwraca tablicę Stringów,
    // void (pustka) - modyfikator dostępu publicznego - niczego nie zwraca, tylko nadaje nowe imię -
    // tzn. nadaje nową wartość w 'name'
    //---------------------------------------------------------------------------------------------
    // chengeName - zmiana imienia
    public void changeName(String name){
        this.name = name;
        }
    // viewName - metoda, która pokazuje zmianę (np. imienia)
    public String viewName(){
        return name;
        }
    //--------------------------------------------------------------------------------------------
    // changeSoftnes - analogicznie
    public void changeSoftness(boolean softness) {
        this.softness = softness;
        }
    // viewSoftnes - metoda, która ukazuje zmianę softnes'a
    public boolean viewSoftness(){
        return softness;
    }
    // -------------------------------------------------------------------------------------------
    // changeLonght - analogicznie
    public void changeLonght(int longth){
        this.longth = longth;
    }
    public int viewLongth() {
        return longth;
    }
    // ------------------------------------------------------------------------------------------
    //
    public double convert(int longht){
        double cale = longht*2.54; // double - zmienne przecinkowe
        return cale;
    }

}

// od linka 14 do 51 włącznie, wszystko usunąć.
// następnie z tego co pozostało, przed ostatniki wąsami '}'
// kliknąć prawym przyciskien i klik 'Generate...'
// wybrać 'Construktor' a następnie zaznaczyćłącznie wszystkie pozycje (bez Frog) i OK
// klik w link pod } Construktor i znowu prawy przysisk i wybrać 'Generate' i nastęnie
// Getter and Setter.
// i wszystko tworzy się samo :)