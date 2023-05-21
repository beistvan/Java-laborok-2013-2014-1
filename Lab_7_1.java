/*
 * Labor 7., 7.1.: Lab_7_1.java
 */
package lab_7_1;

/**
 * @author Beregszászi István
 * @since 2015.11.02.
 */
public class Lab_7_1 {

    public static void main(String[] args) {
        // 7.1. feladat
        //Adva van egy 10 elemű szöveges adatokat tartalmazó 
        //B$(10) tömb. Készítsen egy új c$(10) tömböt, amely
        //a B$(10) tömb elemeit tartalmazza fordított sorrendben!
        String[] B = {"egy szó", "még egy szó", "harmadik mondat",
            "negyedik mondat", "ötödik szöveg", "hatodik sor",
            "hetedik szöveg", "nyolcadik adat", "kilencedik sor",
            "tizedik, végső mondat."};
        //B[] kiíratása
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
        String c[] = new String[10];
        for (int i = B.length - 1; i >= 0; i--) {
            c[i] = B[B.length - i - 1];
        }
        //A c[] kiíratása
        System.out.println("\nA c[] tömb elemei:");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }

}
