/*
 * Labor 3., 3.2.: Lab_3_2.java
 */
package lab_3_2;

/**
 * @author Beregszászi István
 * @since 2015.10.01.
 */
public class Lab_3_2 {

    public static void main(String[] args) {
        System.out.println("3.2. feladat");
        //3.2. feladat        
        //Írassa ki az elágazásos függvényt annak az értelmezési
        //tartományában a megadott lépésközzel

        double dx = 0.2, x = 0.0, t = 0.0;
        System.out.println("dx = " + dx);
        while (x <= 2) {
            if (x < 0.4) {
                t = x * x - Math.exp(x);
            } else {
                t = Math.log(Math.atan(x) + x);
            }
            System.out.format("x = %4.1f, t = %14.10f%n", x, t);
            x += dx;
        }
    }

}
