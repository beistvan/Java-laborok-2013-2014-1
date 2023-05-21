/*
 * Labor 1., 1.2. Logikai kifejezések Lab_1_2.java
 */
package lab_1_2;

/**
 * @author Beregszászi István
 * @since 2015.09.10.
 */
public class Lab_1_2 {

    public static void main(String[] args) {
        //1.2. feladat.
        double x = 2, y = 1.2; // 0.2 - hamis; 1.2 - igaz
        boolean logikai = (0.5 < y) && (y <= x + Math.sqrt(x));
        System.out.println("A logikai kifejezés értéke "
                + (logikai ? "igaz" : "hamis") + ".");
    }
}
