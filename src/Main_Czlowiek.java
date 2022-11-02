public class Main_Czlowiek {
    public static void main(String[] args) {
        Czlowiek C1 = new Czlowiek("on", 175, 75, 1980);
        Czlowiek C2 = new Czlowiek("ona", 170, 70, 1980);
        Czlowiek C3 = new Czlowiek("ona", 170, 70, 1980, "Ola");

        C2.wypisz_wszystko();

        C3.zabij();
        C3.wypisz_wszystko();
        C3.setZywy(true);
        C3.wypisz_wszystko();
    }
}
