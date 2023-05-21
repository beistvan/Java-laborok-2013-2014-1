/*
 * Labor 6., 6.2.: Lab_6_2.java
 */
package lab_6_2;

/**
 * @author Beregszászi István
 * @since 2015.10.25.
 */
public class Lab_6_2 {

    static double[] a = {0.4, 8.8, 7.4, 12.5, 5, 0};

    static int linearisKereses(double[] tomb, double keresendo) {
        int i = 0;
        while (i < tomb.length && tomb[i] != keresendo) {
            i++;
        }
        return (i < tomb.length) ? i + 1 : -1;
    }

    public static void main(String[] args) {
        //6.2) Készítsen egy eljárást lineális keresésre egy rendezetlen tömbben!
        System.out.println("Keresés: a[]-ban van-e 0-s elem? Válasz: "
                + (linearisKereses(a, 0) < 0
                        ? "nincs" : linearisKereses(a, 0) + " a poziciója"));

    }

}
