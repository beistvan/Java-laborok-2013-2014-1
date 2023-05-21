/*
 * Labor 5., 5.1.: Lab_5_1.java
 */
package lab_5_1;

/**
 * @author Beregszászi István
 * @since 2015.10.25.
 */
public class Lab_5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //5.1. feladat. 
        //Alakítsa át a kétirányú tömböt úgy, hogy felcseréli a
        //pozitív elemeket az elem sorszámára, a negatív elemeket -
        //az elem oszlopszámára, a nullával egyenlő elemeket - 
        //az elem sor- és az oszlopszámának az összegére
        //A B tömb deklarálása
        int[][] B = {{-1, 2, 0, 4}, {3, -5, 4, 0}, {0, 1, -1, 2}};
        //A B tömb kiíratása
        System.out.println("Az eredeti tömb:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.format("%3d", B[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Az átalakított tömb:");
        //A B tömb átalakítása és kiíratása
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                if (B[i][j] > 0) {
                    B[i][j] = i + 1;
                } else if (B[i][j] < 0) {
                    B[i][j] = j + 1;
                } else {
                    B[i][j] = i + j + 2;
                }
                System.out.format("%3d", B[i][j]);
            }
            System.out.println("");
        }
    }

}
