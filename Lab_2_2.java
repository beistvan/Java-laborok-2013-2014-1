/*
 * Labor 2., 2.2.: Lab_2_2.java
 */
package lab_2_2;

/**
 * @author Beregszászi István
 * @since 2015.09.25.
 */

public class Lab_2_2 {
    
    public static void main(String[] args) {
        //2.2. feladat        
        double q = 0.0;
        int l = 3, k = 3; //l - évfolyam, k - a névsorbéli sorszám
        double x = (double) (l + 2 * k) / l;
        double y = (double) (2 * l - 3 * k) / 4;
        double z = (double) 3 * l * k + 1;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        q = (x < y) ? x : y;
        q = ((q < z) ? q : z) + 5;
        System.out.println("q = " + q);
    }

}
