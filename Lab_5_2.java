/*
 * Labor 5., 5.2.: Lab_5_2.java
 */
package lab_5_2;

/**
 * @author Beregszászi István
 * @since 2015.11.25.
 */
public class Lab_5_2 {

    public static void main(String[] args) {
        //5.2. feladat
        //Határozza meg az A(m,n) kétirányú tömb (m<=5,n<=5)
        //fő és mellékátlóin található elemeinek az összegét!
        int n = (int) (Math.random() * 4 + 2);
        int m = (int) (Math.random() * 4 + 2);
        int A[][] = new int[n][m];
        System.out.println("Az A[" + n + "][" + m + "] tömb:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = (int) (Math.random() * 9 + 1);
                System.out.format("%2d", A[i][j]);
            }
            System.out.println("");
        }
        int N = Math.min(m, n);
        int foAtloOsszeg = 0;
        for (int i = 0; i < N; i++) {
            foAtloOsszeg += A[i][i];
        }
        System.out.println("A főátló elemeinek összege: " + foAtloOsszeg);
        int mellekAtloOsszeg = 0;
        for (int i = 0; i < N; i++) {
            mellekAtloOsszeg
                    += A[i][n - i + (n > m ? n - N : ((n == m) ? -1 : -1))];
        }
        System.out.println("A mellékátló elemeinek összege: "
                + mellekAtloOsszeg);

    }

}
