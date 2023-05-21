/*
 * Labor 4., 4.1.: Lab_4_1.java
 */
package lab_4_1;

/**
 * @author Beregszászi István
 * @since 2015.10.14.
 */
public class Lab_4_1 {

    public static void main(String[] args) {
        // 4.1. feladat
        //Számítsa ki a kifejezést tömbökkel és tömbök nélkül!
        double z;
        //a) tömbökkel
        System.out.println("Tömbök használatával:");
        double x[] = new double[31], s, dx = 4.4;
        /*int i;
        for (i = 1, x[1] = -200.2, s = 0.0, z = 0.0; i <= 29;
                 x[i++] += dx) {
            x[i + 1] = x[i] + dx;
            z += (i >= 18) ? Math.pow(Math.log10(Math.abs(x[i + 1]))
                    - Math.log10(Math.abs(x[i - 1])), 2) : 0;
            System.out.println(i+" "+x[i]+"   "+z);
        }
        System.out.println("z=" + z);
        */
        x[1] = -200.2;
        for (int i = 2; i < x.length; i++) {
            x[i]=x[i-1]+dx;
        }
        z=0.0;
        for (int i = 18; i <= 29; i++) {
           z += Math.pow(Math.log10(Math.abs(x[i + 1]))
                    - Math.log10(Math.abs(x[i - 1])), 2);
        }
        System.out.printf("z = %18.16f%n", z);
        //b) tömbök nélkül
        System.out.println("Tömbök használata nélkül:");
        double xi, xip1, xim1;
        xim1 = -200.2; z = 0.0;
        for (int i = 2; i <= 29; i++) {
            xi=xim1+dx;
            xip1=xi+dx;
            if(i>=18)
                z += Math.pow(Math.log10(Math.abs(xim1))
                    - Math.log10(Math.abs(xip1)), 2);
            xim1=xi;
        }
        System.out.printf("z = %18.16f%n", z); 
    }
    
}
