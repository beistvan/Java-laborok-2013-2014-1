/*
 * Labor 1., 1.1.: Lab_1_1.java
 */
package lab_1_1;

/**
 * @author Beregszászi István
 * @since 2015.09.02.
 */
public class Lab_1_1 {

    public static void main(String[] args) {
        // Az 1.1. feladat megoldása
        double x = 1.0, gamma = 1.0;
        double f = 217.5 * Math.exp(-x + 0.77)
                + (gamma * Math.pow(x, Math.E) - Math.exp(-x) + 0.1)
                / (Math.sqrt(
                        Math.abs(Math.pow(Math.sin(x - 1), 3)
                                + Math.cos(gamma))));
        System.out.println("f = " + f);
    }

}
