/*
 * Labor 3., 3.4.: Lab_3_4.java
 */
package lab_3_4;

/**
 * @author Beregszászi István
 * @since 2015.10.01.
 */
public class Lab_3_4 {

    public static void main(String[] args) {
        //4. feladat        
        //Határozza meg a [0,5; 11,9] szakaszon található
        //egész számok összegét!
        System.out.println("3.4. feladat");
        System.out.println(Math.ceil(0.5) + " " + Math.floor(11.9));
        int i = 0, s = 0;
        double also = 0.5, felso = 11.9;
        for (i = (int) Math.ceil(also); i <= (int) Math.floor(felso); i++) {
            s += i;
            System.out.print(i + " ");
        }
        System.out.format("%ns = %d%n", s);
    }

}
