/*
 * Labor 10., 10.1.: Lab_10_1.java
 */
package lab_10_1;

/**
 * @author Beregszászi István
 * @since 2015.12.05.
 */
abstract class Egyenlet {

    private double x;

    abstract double[] Megoldas();

    public double getX() { //getter
        return x;
    }

    public void setX(double x) { //setter
        this.x = x;
    }
}

abstract class Polinom extends Egyenlet {

    protected int n = 10;
    protected double a[] = new double[n];
    protected double x[] = new double[n - 1];
}

class MasodfokuEgyenlet extends Polinom {

    private int hossz;

    //konstruktor
    MasodfokuEgyenlet() {
        n = 3;
        a[2] = a[1] = a[0] = 0;
        hossz = n - 1;
    }

    MasodfokuEgyenlet(double a2, double a1, double a0) {
        n = 3;
        a[2] = a2;
        a[1] = a1;
        a[0] = a0;
        hossz = n - 1;
    }

    double Diszkriminans() {
        return a[1] * a[1] - 4 * a[2] * a[0];
    }

    double[] Megoldas() {
        if (Diszkriminans() >= 0) {
            x[0] = (-a[1] - Math.sqrt(Diszkriminans())) / (2 * a[2]);
            x[1] = (-a[1] + Math.sqrt(Diszkriminans())) / (2 * a[2]);
        } else {
            x[0] = x[1] = -a[1] / (2 * a[2]);
        }
        return x;
    }

    void kiirMegoldas() {
        for (int i = 0; i < hossz; i++) {
            System.out.println((i + 1) + ". megoldas = " + Megoldas()[i]);
        }
    }

    void kiirEgyenlet() {
        System.out.println(a[2] + " * x^2 + " + a[1] + " * x + " + a[0]+" = 0");
    }
}

public class Lab_10_1 {

    public static void main(String[] args) {
        //HIBA: nem példányosítható az absztrakt osztály: 
        //Egyenlet fx = new Egyenlet();        
        MasodfokuEgyenlet masodfokuEgyenlet = new MasodfokuEgyenlet(1, 5, 6);
        masodfokuEgyenlet.kiirEgyenlet();
        System.out.println("diszkriminans = " + masodfokuEgyenlet.Diszkriminans());
        masodfokuEgyenlet.kiirMegoldas();
    }
}
