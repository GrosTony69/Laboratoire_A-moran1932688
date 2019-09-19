/*  Laboratoire_A
exercice #3 Convertisseur2
par Anthony Morin
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Convertisseur2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##") ;

        int deg ;
        // <deg> correspond a la valeur de l'angle en degré

        double rad ;
        // <rad> correspond a la valeur de l'angle en radian

        System.out.print("Quel est Langle en degré?") ;
              deg = sc.nextInt() ;
              rad = Math.toRadians(deg) ;

        System.out.print("La valeur en radian formatée :" + df.format (rad) );

        sc.close();

    }
}