public class Czlowiek {
    String plec;
    int wzrost;
    int waga;
    int rok_urodzenia;
    boolean zywy = true;
    String imie;

 Czlowiek(String plec, int wysoki, int ciezar, int urodzony){
     this.plec = plec;
     this.wzrost = wysoki;
     this.waga = ciezar;
     this.rok_urodzenia = urodzony;
     if (this.plec == "on") {
         this.imie = "Adam";
     }
     else{
         this.imie = "Ewa";
     }
 }
   Czlowiek(String plec, int wysoki, int ciezar, int urodzony, String imie){
       this.plec = plec;
       this.wzrost = wysoki;
       this.waga = ciezar;
       this.rok_urodzenia = urodzony;
       this.imie = imie;
   }

   public void wypisz_wszystko(){
       System.out.println("To jest plec tego czlowieka " +this.plec);
       System.out.println("wzrost " +this.wzrost);
       System.out.println("waga " + this.waga);
       System.out.println("Czy zyje" + this.zywy);
       System.out.println("Twoje imie " + this.imie);

    }

    public void setZywy(boolean zywy){
     this.zywy = zywy;

    }
    public void zabij(){
     this.zywy = false;
    }

    public String getPlec(){
     return this.plec;
    }
}
