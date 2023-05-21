/*
 * Labor 1., 1.3.: Lab_1_3.java
 * Kifejezések programozása, kiértékelése
 */
package lab_1_3;

/**
 * @author Beregszászi István
 * @since 2015.09.19.
 */
public class Lab_1_3 {

    public static void main(String[] args) {
        //1.3. feladat
        double m = 0.0;
        double x = Math.sqrt(Math.abs(Math.sin(Math.exp(2)) + 3.41));
        double y = Math.log(Math.abs(Math.PI - x))
                + Math.log10(Math.abs(Math.PI / x));
        m = Math.pow(Math.log10(Math.abs(y - 5.5)), 2)
                + Math.pow(Math.sin(y / 4), 2);
        System.out.println("m = " + m);
    }
}
