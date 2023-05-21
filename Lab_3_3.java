/*
 * Labor 3., 3.3.: Lab_3_3.java
 */
package lab_3_3;

/**
 * @author Beregszászi István
 * @since 2015.10.01.
 */
public class Lab_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("3.3. feladat");
        //3. feladat        
        //Számítsa ki az összeget és a szorzatot
        double s = 0.0, p = 1.0;
        int k = 3, j = 14, i = 0, n = 0;
        for (s = 0.0, i = k; i <= j; i++) {
            s += (double) (i * (i + 1)) / ((i + 7) * (i + 3));
        }
        System.out.format("s = %12.8f%n", s);
        for (p = 1.0, n = 1; n <= 10; n++) {
            p *= (double) (n % 2 == 0 ? 1 : -1) * (n * n + 2) / n;
        } 
        System.out.format("p = %12.8f%n", p); 
    }
    
}
