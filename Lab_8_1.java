/*
 * Labor 8., 8.1.: Lab_8_1.java
 */
package lab_8_1;

import java.io.*;

/**
 * @author Beregszászi István
 * @since 2015.11.12.
 */
public class Lab_8_1 {

    public static void main(String[] args) {
        //8.1.a (szöveges adatok állományba történő mentése és beolvasása)        
        //Írassuk ki a g adatállományba az alábbi szöveges adatokat:
        //arany, ezüst, platina, cink, alumínium! Készítsünk másolatot
        //a g állományról!
        //Az állományokat az alábbi mappában találjuk:
        //C:\Documents and Settings\diak2004\Dokumentumok\NetBeansProjects\Lab8_1\
        System.out.println("8.1. a) feladat");
        String[] femek = {"arany", "ezüst", "platina", "cink", "alumínium"};
        try {
            DataOutputStream ki = new DataOutputStream(
                    new FileOutputStream("femek.dat"));
            for (int i = 0; i < femek.length; i++) {
                ki.writeUTF(femek[i]);
            }
            ki.close();
            DataInputStream be = new DataInputStream(
                    new FileInputStream("femek.dat"));
            DataOutputStream ki_masolat = new DataOutputStream(
                    new FileOutputStream("femek_masolat.dat"));
            System.out.println("Az eredeti (femek.dat) állomány tartalma:");
            while (be.available() > 0) {
                String sor = be.readUTF();
                ki_masolat.writeUTF(sor);
                System.out.print(sor + " ");
            }
            be.close();
            ki_masolat.close();
            System.out.println("\nA másolat-állomány (femek_masolat.dat) tartalma:");
            DataInputStream be_masolat = new DataInputStream(
                    new FileInputStream("femek_masolat.dat"));
            while (be_masolat.available() > 0) {
                System.out.print(be_masolat.readUTF() + " ");
            }
            be_masolat.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //8.1.b.(számértékű adatok állományba történő mentése és beolvasása)        
        //Adott két számadatokat tartalmazó állomány, melyek tartalma a következő:
        //1)4,7; 11,8; 0,44; 45,6; 23,6; 1,3 - ez az f1 állomány;
        //2)4,5; 56,7; 3,6; 4,6; 47,5; -5,4 - ez az f2 állomány.
        //Írjuk hozzá az f2 állományt az f1 állomány végéhez!
        System.out.println("\n8.1. b) feladat");
        Double f1_adatok[] = {-4.7, 11.8, 0.44, 45.6, 23.6, 1.3};
        Double f2_adatok[] = {4.5, 56.7, 3.6, 4.6, 47.5, -5.4};
        try {
            DataOutputStream ki1 = new DataOutputStream(
                    new FileOutputStream("f1.dat"));
            DataOutputStream ki2 = new DataOutputStream(
                    new FileOutputStream("f2.dat"));
            for (int i = 0; i < f1_adatok.length; i++) {
                ki1.writeDouble(f1_adatok[i]);
                ki2.writeDouble(f2_adatok[i]);
            }
            ki1.close();
            ki2.close();
            DataInputStream be1 = new DataInputStream(
                    new FileInputStream("f1.dat"));
            DataInputStream be2 = new DataInputStream(
                    new FileInputStream("f2.dat"));
            Double[] adatok = new Double[f1_adatok.length + f2_adatok.length];
            int index = 0;
            System.out.println("Az f1.dat kezdeti tartalma:");
            while (be1.available() > 0) {
                Double d = be1.readDouble();
                adatok[index++] = d;
                System.out.print(d + " ");
            }
            System.out.println("\nAz f2.dat kezdeti tartalma:");
            while (be2.available() > 0) {
                Double d = be2.readDouble();
                adatok[index++] = d;
                System.out.print(d + " ");
            }
            System.out.println("\nAz f2.dat végleges tartalma:");
            DataOutputStream ki2_vegleges = new DataOutputStream(
                    new FileOutputStream("f2.dat"));
            for (int i = 0; i < adatok.length; i++) {
                System.out.print(adatok[i] + " ");
                ki2_vegleges.writeDouble(adatok[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
    }

}
