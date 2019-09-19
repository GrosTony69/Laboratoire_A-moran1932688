/*  Laboratoire_A
exercice #1 Salutation
par Anthony Morin
 */

import java.util.Scanner;
import java.text.DecimalFormat ;

public class Salutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        DecimalFormat df = new DecimalFormat ("#.####") ;
        String nom = "" ;

        System.out.print ("Quel est ton nom?") ;
        nom = sc.nextLine() ;
        System.out.println ("Bonjour " + nom) ;

        System.out.println ("* Exécution :" + System.currentTimeMillis() + " ms") ;
        System.out.println ("* Exécution :" + System.nanoTime() + " ns") ;

        sc.close();
    }
}