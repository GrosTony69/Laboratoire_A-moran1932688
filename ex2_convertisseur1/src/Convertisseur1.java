/*  Laboratoire_A
exercice #2 Convertisseur1
par Anthony Morin
 */

import java.util.Scanner;

public class Convertisseur1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rad ; // <rad> correspond a la valeur de l'angle en radian
        double deg ; // <deg> correspond a la valeur de l'angle en degré

         System.out.print("Quel est L'angle en radian?");
         rad = sc.nextDouble() ;
         deg = ( rad * (180 / Math.PI) ) ;
        int degint = (int) deg ; // <degint> correspond à la valeur de l'angle en degré mais en integer

        System.out.print("Valeur en degré : " + degint);
        sc.close();

    }
}