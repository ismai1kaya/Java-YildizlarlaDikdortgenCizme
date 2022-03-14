
import java.util.Scanner;

class DikdortgenOdevi{

    void DiktörtgenCizim(int KKenar, int UKenar) {


        for(int sayac=1;sayac<=KKenar;sayac++ ) {


            for(int yildizSayaci=1;yildizSayaci<=UKenar;yildizSayaci++) {
                System.out.print("* ");
            }

            System.out.print("\n");

        }
    }
}


public class DikdortgenCizme {

    public static void main(String[] args) {

        Scanner degerNesnesi = new Scanner(System.in);
        DikdortgenOdevi dikdörtgen = new DikdortgenOdevi();
        System.out.print("Üçgenin kısa kenarını giriniz:");
        int KKenar= degerNesnesi.nextInt();
        System.out.println("");
        System.out.print("Üçgenin uzun kenarını giriniz:");
        int UKenar = degerNesnesi.nextInt();

        System.out.println("");
        dikdörtgen.DiktörtgenCizim(KKenar, UKenar);
    }

}

