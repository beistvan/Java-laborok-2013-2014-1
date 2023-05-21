/*
 * Labor 4., 4.2.: Lab_4_2.java
 */
package lab_4_2;

/**
 * @author Beregszászi István
 * @since 2015.10.14.
 */
public class Lab_4_2 {

    public static void main(String[] args) {
        //4.2. feladat
        //Határozza meg a tömb első negatív elemének sorszámait!
        double a[] = {3.2, -6.3, 2.0, -3.3, -6.6, -2.2, 0, 2.1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                System.out.println("Első negatív elem sorszáma: " + (i + 1));
                break;
            }
        }
        //Meoldás egy másik módszerrel
        int k = 0;
        while (k < a.length && !(a[k] < 0)) {
            k++;
        }
        System.out.println("Sorszám: " + (k + 1));
    }

}
