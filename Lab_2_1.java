/*
 * Labor 2., 2.1.: Lab_2_1.java
 */
package lab_2_1;

/**
 * @author Beregszászi István
 * @since 2015.09.23.
 */
public class Lab_2_1 {

    public static void main(String[] args) {
        //3.1. feladat
        double x = 1.5, y = 0.0;

        if (x >= 0 && x <= 1) {
            y = Math.asin(-x * x + 1);
            System.out.println("1. eset. y = " + y);
        } else {
            if (x > 1) {
                y = Math.pow(Math.log10(2 * x), 2) + 4.4;
                System.out.println("2. eset. y = " + y);
            } else {
                if (x > -3 && x < 0) {
                    y = -Math.exp(-1.0 / x);
                    System.out.println("3. eset. y = " + y);
                } else {
                    System.out.println("Nem megfelelő bemenet!");
                }
            }
        }
    }

}
