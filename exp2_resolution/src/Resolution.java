/*  Laboratoire_A
expert #2 Resolution
par Anthony Morin
 */

import java.util.Scanner;
import java.text.DecimalFormat ;

public class Resolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat ("#.###") ;

        double a ; // <a> correspond au paramètre <a> dans la formule ax²+by+c
        double b ; // <b> correspond au paramètre <b> dans la formule ax²+by+c
        double c ; // <c> correspond au paramètre <c> dans la formule ax²+by+c
        double x1 ; // <x1> correspond à la valeur de x résultant avec ( -b+"racine carré" de b²-4ac )
        double x2 ; // <x2> correspond à la valeur de x résultant avec ( -b+"racine carré" de b²-4ac )
        double d ; // <d> correspond à la valeur de "racine carré" de (b²-4ac)
        double dis ; // <dis> correspond à la valeur du discriminant

         /*   code d'entré avant que je le change pour une génération automatique
         System.out.println("Quel est le paramètre A ?") ;
        a = sc.nextDouble() ;
        System.out.println("Quel est le paramètre B ?") ;
        b = sc.nextDouble() ;
        System.out.println("Quel est le paramètre C ?") ;
        b = sc.nextDouble() ;  */

        System.out.println("                              Dans une formule ax²+by+c");

        a = ((Math.random() * 50) + 10) ;
        System.out.println("a > " + a) ;
        b = ((Math.random() * 50) + 10) ;
        System.out.println("b > " + b) ;
        c = ((Math.random() * 50) + 10) ;
        System.out.println("c > " + c) ;

        System.out.print ("Équation : " + df.format (a)) ;
        System.out.print ("x² + " + df.format (b)) ;
        System.out.print ("x + " + df.format (c)) ;

        d = (Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) ;
        dis = Math.pow ( d , 2 ) ;

        x1 = ((( 0 - b ) + d ) / ( 2 * a ) ) ;
        x2 = ((( 0 - b ) - d ) / ( 2 * a ) ) ;

        System.out.println (" ") ;
        System.out.println ("discriminant :" + df.format (dis) ) ;
        System.out.println ("La première solution de x est : " + df.format (x1) ) ;
        System.out.println ("La deuxième solution de x est : " + df.format (x2) ) ;


        sc.close() ;

        }
    }