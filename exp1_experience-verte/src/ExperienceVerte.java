/*  Laboratoire_A
expert #1 Expérience Verte
par Anthony Morin
 */

import java.util.Scanner;

public class ExperienceVerte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a ;
        int b ;
        int c ;
        int d ;
        int e ;
        int f ;
        int co2 ;
        int k ;
        int k2 ;
        int k3 ;

        System.out.println ("Entrée des quantités ...") ;

        System.out.println ("A  > ") ;
        a = sc.nextInt () ;

        System.out.println ("B > ") ;
        b = sc.nextInt () ;

        System.out.println ("c > ") ;
        c = sc.nextInt () ;

        System.out.println ("d > ") ;
        d = sc.nextInt () ;

        System.out.println ("e > ") ;
        e = sc.nextInt () ;

        System.out.println ("f > ") ;
        f = sc.nextInt () ;

        co2 = 0 ; // au départ il n'y a aucun CO2

        // calcul du K
        k = (Math.min(a/2 , c/4)) ;

        System.out.println ("A_0{" + a + "} B_0{" + b + "} C_0{" + c + "} D_0{" + d + "} E_0{" + e + "} F_0{" + f
                + "} CO2_0{" + co2 + "}" ) ;
        System.out.println ("R1 : 2A + 4C => 3D + CO2") ;
        System.out.println ("> k : " + k ) ;
        System.out.println ("> R1 : " + (2 * k) + ("A + ") + ( 4 * k) + ("C => ") + ( 3 * k ) + ("D + ") + (k)
                + ("CO2") ) ;
        System.out.println ("A_1{" + (a-= 2*k)  + "} B_1{" + b + "} C_1{" + ( c-= (4*k) ) + "} D_1{" + (d+= 3*k) + "} E_1{" + e
                + "} F_1{" + f + "} CO2_1{" + (co2 += k)  + "}" ) ;

        // calcul du k2
        k2 =( (Math.min ( (Math.min (b , (c/2))) , e ))) ;

        System.out.println ("R2 : B + 2C + E => 4F + 4 CO2") ;
        System.out.println ("> k :" + k2) ;
        System.out.println ("> R2 : " + k2 + ("B + ") + (2 * k2) + ("C + ") + k2 + ("E => ") + (4 * k2) + "F + "
                + (4 * k2) + ("CO2") ) ;
        System.out.println ("A_2{" + a + "} B_2{" + (b-= k2) + "} C_2{" + (c-= 2*k2) + "} D_2{" + d + "} E_2{"
                + (e-= k2) + "} F_2{" + (f+= 4*k2) + "} CO2_2{" + (co2 += 4*k2)  + "}" ) ;

        k3 = (Math.min (2*a , ((f/4) ))) ;


        System.out.println ("R3 : A/2 + 4F => B + 4E + CO2") ;
        System.out.println ("> k : " + k3 ) ;
        System.out.println ("> R3 : 6A + 52F => 13B + 52E + 13CO2") ;
        System.out.println ("A_3{" + (a-= k3/2) + "} B_3{" + (b+= k3) + "} C_3{" + c + "} D_3{" + d + "} E_3{"
                + (e+= 4*k3) + "} F_3{" + (f-= 4*k3) + "} CO2_3{" + (co2 += k3)  + "}" ) ;

        sc.close();

    }
}