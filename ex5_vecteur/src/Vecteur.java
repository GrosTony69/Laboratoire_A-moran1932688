/*  Laboratoire_A
exercice #5 Vecteur
par Anthony Morin
 */

import java.util.Scanner;
import java.text.DecimalFormat ;

public class Vecteur {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");


        double xa ; // <xa> correspond à la valeur du x au point A
        double ya ; // <ya> correspond à la valeur du y au point A
        double za ; // <za> correspond à la valeur du z au point A

        double xb ; // <xb> correspond à la valeur du x au point B
        double yb ; // <yb> correspond à la valeur du y au point B
        double zb ; // <zb> correspond à la valeur du z au point B

        double d ; // <d> correspond a la valeur de la distance

        System.out.println ("Quel sont les coordonnés du point A ?") ;
        System.out.println ("xa : ") ;
        xa = sc.nextDouble() ;
        System.out.println ("ya : ") ;
        ya = sc.nextDouble() ;
        System.out.println ("za : ") ;
        za = sc.nextDouble() ;
        System.out.println ("Le point A (" + df.format (xa) + (",") + df.format (ya) + (",") + df.format (za) + (")")) ;

        System.out.println ("Quel sont les coordonnés du point B ?") ;
        System.out.println ("xb : ") ;
        xb = sc.nextDouble() ;
        System.out.println ("yb : ") ;
        yb = sc.nextDouble() ;
        System.out.println ("zb : ") ;
        zb = sc.nextDouble() ;
        System.out.println ("Le point B (" + df.format (xb) + (",") + df.format (yb) + (",") + df.format (zb) + (")")) ;

        System.out.println ("distance = SORT(POW(" + xb + "-" + xa + ") + POW(" + yb + "-" + ya + ") + POW(" + zb + "-" + za + "))" );
        System.out.println ("         = SORT(POW(" + (xb-xa) + ") + POW(" + (yb-ya) + ") " + "+ POW(" + (zb-za) + "))" ) ;
        System.out.println ("         = SORT(" + (Math.pow (xb - xa , 2)) + " + " + (Math.pow (yb - ya , 2)) + " + " + (Math.pow (zb - za , 2)) + ")" ) ;
        System.out.println ("         = SORT(" + ( (Math.pow (xb - xa , 2)) + (Math.pow (yb - ya , 2)) + (Math.pow (zb - za , 2)) )  + ")" ) ;

        d = Math.sqrt ( (Math.pow (xb - xa , 2)) + (Math.pow (yb - ya , 2)) + (Math.pow (zb - za , 2)) ) ;
        System.out.println ("") ;
        System.out.println ("La distance est : " + df.format (d)) ;




    }
}