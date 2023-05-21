/*
 * Labor 4., 4.3.: Lab_4_3.java
 */
package lab_4_3;
//import java.util.Arrays; 
/**
 * @author Beregszászi István
 * @since 2015.10.14.
 */
public class Lab_4_3 {

    public static void main(String[] args) {
        //4.3. feladat
        //Adott két véletlen elemeket tartalmazó tömb
        //az A(n) (n<=16) és a B(m) (m<=14).
        //Fésülje össze a két tömböt, majd rendezze a kapott tömb
        //elemeit növekvő sorrendbe!
        int n = (int) (Math.random() * 16 + 1);
        int m = (int) (Math.random() * 14 + 1);
        double[] A = new double[n], B = new double[m];
        System.out.println("n=" + n + " m=" + m);
        System.out.print("A[" + n + "]=");
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 9 + 1;
            System.out.format("%4.1f" + (i == (A.length - 1) ? "." : ";"), A[i]);
        }
        System.out.print("\nB[" + m + "]=");
        for (int i = 0; i < B.length; i++) {
            B[i] = Math.random() * 9 + 1;
            System.out.format("%4.1f" + (i == (B.length - 1) ? "." : ";"), B[i]);
        }
        double C[] = new double[n + m];
        for (int i = 0; i < n + m; i++) {
            C[i] = (i < n) ? A[i] : B[i - n];
        }
        System.out.print("\nC[" + (n + m) + "]=");
        for (int i = 0; i < C.length; i++) {
            System.out.format("%4.1f" + (i == (C.length - 1) ? "." : ";"), C[i]);
        }
        for (int i = 0; i < C.length - 1; i++) {
            for (int j = i + 1; j < C.length; j++) {
                if (C[i] > C[j]) {
                    double tmp = C[i];
                    C[i] = C[j];
                    C[j] = tmp;
                }
            }
        }
        System.out.print("\nC[" + (n + m) + "]=");
        for (int i = 0; i < C.length; i++) {
            System.out.format("%4.1f" + (i == (C.length - 1) ? "." : ";"), C[i]);
        }
        System.out.println();
        /*System.out.println("\n"+Arrays.toString(A));
         Arrays.sort(A);
         System.out.println("\n"+Arrays.toString(A));*/
    }

}
