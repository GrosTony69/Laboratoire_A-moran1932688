/*  Laboratoire_A
exercice #4 Pythagore
par Anthony Morin
 */

import java.util.Scanner;

public class Pythagore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a ; // <a> correspond à la valeur d'un des côté
        int b ; // <b> correspond à la valeur de l'autre côté
        double c ; // <c> correspond à l'hypoténuse

        double aa ; // <aa> correspond à la valeur de a²
        double bb ; // <bb> correspond à la valeur de b²
        double cc ; // <cc> correspond à la valeur de c²

        System.out.println ("Quel est la valeur de A ?") ;
        a = sc.nextInt() ;
        System.out.println ("Quel est la valeur de B ?") ;
        b = sc.nextInt() ;

        aa = Math.pow ( a , 2 ) ;
        bb = Math.pow ( b , 2 ) ;

        cc = ( aa+ bb ) ;
        c = ( Math.sqrt( cc )) ;

        int ci =(int) c ; // <ci> correspond à la valeur de <c> mais en int

        System.out.println ("Valeur de l'hypoténuse : " + ci ) ;

        sc.close();


    }
}