/*
 * Labor 6., 6.1.: Lab_6_1.java
 */
package lab_6_1;

/**
 * @author Beregszászi István
 * @since 2015.10.25.
 */
public class Lab_6_1 {


    static double x = 4.44, y = 0.54;
    static double[] a = {0.4, 8.8, 7.4, 12.5, 5, 0},
            b = {-4.1, 3.2, 0.7, -4.1, 2.2, 4.8};

    static double szinusz(double x, double y) {
        return Math.pow(Math.sin(x - y), 2);
    }

    static double szorzat(double[] a, double[] b, int kezd, int veg) {
        double szor = 1.0;
        for (int k = kezd - 1; k <= veg - 1; k++) {
            szor *= a[k] - Math.sin(b[k]);
        }
        return szor;
    }

    static double S(double x, double y, double[] a, double[] b) {
        return szinusz(x, y) / szorzat(a, b, 2, 6)
                + szorzat(b, a, 1, 6) / szinusz(1.3, x * y)
                + szinusz(1.3 * x, 0.6) / szorzat(a, a, 3, 5);
    }

    public static void main(String[] args) {

        // 6.1. feladat
        // Számítsa ki a megadott értéket függvények és eljárások használatával!
        System.out.printf("S = %15.12f%n", S(x, y, a, b));

    }

}
