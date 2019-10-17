/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan34.oo.kalkulator;
import java.util.Scanner;
/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Nim : 10118013
 * Kelas : IF-01
 * Deskripsi Program : Menghitung Dua Bilangan
 */
public class IF110118013Latihan34OOKalkulator {
    //public class Kalkulator {
        public static double value1;
        public static double value2;
        
        public static double tambahBilangan(){
            return (value1 + value2);    
        }
        
        public static double kurangBilangan(){
            return (value1 - value2);
        }
        
        public static double kaliBilangan(){
            return (value1 * value2);
        }
        
        public static double bagiBilangan(){
            return (value1 / value2);
        }
        
        public static double sisaBilangan(){
            return (value1 % value2);
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Aplikasi Kalkulator====");
        System.out.print("Masukkan nilai ke-1 : ");
        value1 = scanner.nextDouble();
        System.out.print("Masukkan nilai ke-2 : ");
        value2 = scanner.nextDouble();
        
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kurangBilangan());
        System.out.println("Hasil Perkalian : " + kaliBilangan());
        System.out.println("Hasil Pembagian : " + bagiBilangan());
        System.out.println("Hasil Sisa : " + sisaBilangan());
    }
    
}
