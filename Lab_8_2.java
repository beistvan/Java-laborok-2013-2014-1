/*
 * Labor 8., 8.2.: Lab_8_2.java
 */
package lab_8_2;
import java.io.*;
/**
 * @author Beregszászi István
 * @since 2015.11.12.
 */
public class Lab_8_2 {

    public static void main(String[] args) {
        //8.2. feladat        
        //Adva van egy "Termékek" adatbázis, melyet egy szöveges állományba
        //mentettek el. Az adatbázis a következő mezőket tartalmazza:
        //a dolgozó vezetékneve és keresztneve, valamint az 1.nap termelt termékmennyiség,
        //a 2. napon, ..., 5.napon... . Feladat: Válogassuk ki és irassuk is ki a
        //képernyőre azokat a dolgozókat, akik egy megadott mennyíségnél
        //nem termeltek kevesebb terméket.
        final int n = 5, m = 5;
        class Termekek implements Serializable{
            private String vezeteknev;
            private String keresztnev;
            private Double [] termekmennyiseg = new Double[m];
            Termekek(String vezeteknev, String keresztnev,
                    Double[] termekmennyiseg){
                this.vezeteknev=vezeteknev;
                this.keresztnev=keresztnev;
                this.termekmennyiseg=termekmennyiseg;
            }
            String getKeresztnev(){
                return this.keresztnev;
            }
            String getVezetknev(){
                return this.vezeteknev;
            }
        }
        Double[][] d = {{1.2, 2.3, 3.4, 4.5, 5.6}, {0.2, 1.3, 2.4, 3.5, 6.6},
                        {2.2, 3.3, 4.4, 5.5, 7.6}, {4.2, 5.3, 6.4, 7.5, 8.6},
                        {5.2, 6.3, 7.4, 8.5, 9.6} };
        Termekek termekek[] = {new Termekek("Kelep","Elek",d[0]),
        new Termekek("Har","Mónika",d[1]),new Termekek("Bármi","Áron",d[2]),
        new Termekek("Am","Erika",d[3]),new Termekek("Alka","Ida",d[4])};
        try {
            OutputStream ki = new FileOutputStream("termekek.dat");
            ObjectOutputStream oos = new ObjectOutputStream(ki);
            for (int i= 0; i < n; i++) {
                oos.writeObject(termekek[i]);
            }
            oos.close();
            ki.close();

            InputStream be = new FileInputStream("termekek.dat");
            ObjectInputStream ois = new ObjectInputStream(be);

            Termekek[] termekeim = new Termekek[n];            
            System.out.println("8.2.feladat.\nA 'termekek.dat' tartalma:");
            for (int i = 0; i < n; i++) {
                termekeim[i]=(Termekek)ois.readObject();
                System.out.print((i+1)+". "+termekeim[i].getVezetknev()+" "
                        +termekeim[i].getKeresztnev()+" ");
                for (int j = 0; j < m; j++) {
                    System.out.print(termekeim[i].termekmennyiseg[j]+" ");
                }
                System.out.println("");
            }            
            double mennyiseg =30.0;
            System.out.println("Az alábbi dolgozók nem kevesebb, mint "+
                    mennyiseg+" termékmennyiséget termeltek összesen:");
            int k=1;
            for (int i = 0; i < n; i++) {
                double szum=0.0;
                for (int j = 0; j < m; j++) {
                    szum+=termekeim[i].termekmennyiseg[j]; 
                }
                if (szum>=mennyiseg) {
                    System.out.print((k++)+". "+termekeim[i].getVezetknev()+" "
                        +termekeim[i].getKeresztnev()+" ");
                    for (int j = 0; j < m; j++) {
                        System.out.print(termekeim[i].termekmennyiseg[j]+" ");
                    }
                    System.out.println("; Termékmennyiség: "+szum);
                }
            }
            be.close();
            ois.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }
    
}
