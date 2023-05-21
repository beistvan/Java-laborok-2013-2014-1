/*
 * Labor 3., 3.1.: Lab_3_1.java
 */
package lab_3_1;

/**
 * @author Beregszászi István
 * @since 2015.10.01.
 */
public class Lab_3_1 {

    public static void main(String[] args) {
        //1. feladat
        //a) Írassuk ki a függvény argumentumait és értékeit a megadott
        //szakaszon a megadott lépésközzel!
        System.out.println("3.1. a) feladat");
        double y = 0.0d, t = 0.0d, dt = 0.1d; //d - a double literál végét jelzi
        t = 0.2;
        while (t <= 0.8) {
            y = (Math.tan(2 * t) - 3 * t) / (t + 3);
            System.out.format("t = %4.1f, y = %14.10f%n", t, y);
            t += dt;
        }
        //Java stílusban for cilkussal ugyan azt az a) feladatot oldjuk
        /*for (t=0.2,y=0.0; t <=0.8; t+=dt) {
         y=(Math.tan(2*t)-3*t)/(t+3);
         System.out.format("t = %4.1f, y = %14.10f%n",t,y);
         }*/
        System.out.println("3.1. b) feladat");
        //b) Írassuk ki a függvény argumentumait és értékeit
        //n-szer megadott lépésközzel
        int i = 0, n = 5;
        for (i = 0, t = -0.5, dt = 0.2; i < n; i++, t += dt) {
            y = (Math.tan(2 * t) - 3 * t) / (t + 3);
            System.out.format("%d. t = %4.1f, y = %14.10f%n", i + 1, t, y);
        }

    }

}
