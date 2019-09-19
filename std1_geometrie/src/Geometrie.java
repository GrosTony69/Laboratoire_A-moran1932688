/*  Laboratoire_A
standard /1 Geometrie
par Anthony Morin
 */

import java.util.Scanner ;
import java.text.DecimalFormat ;

public class Geometrie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##") ;

        double rce = 10 ; // <rce> correspond au rayon du cercle
        double sce ; // <sce> correspond à la surface du cercle

        double lcb ; // <lcb> correspond à la longueur du cube
        double scb ; // <scb> correspond à la surface du cube
        double vcb ; // <vcb> correspond au volume du cube

        double rcy ; // <rcy> correspond au rayon du cylindre
        double hcy ; // <hcy> correspond à la hauteur du cylindre
        double scy ; // <scy> correspond à la surface du cylindre
        double vcy ; // <vcy> correspond à la surface du cylindre

        double rco ; // <rco> correspond au rayon du cone
        double hco ; // <hco> correspond à la hauteur du cone
        double aco ; // <aco> correspond à l'apothème du cone
        double sco ; // <sco> correspond à la surface du cone
        double vco ; // <vco> correspond au volume du cone

        rce = ( 10 ) ;
        sce = ( Math.PI * ( Math.pow( rce , 2 ))) ;

        lcb = ( 7 ) ;
        scb = ( 6 * ( Math.pow( lcb , 2 ))) ;
        vcb = ( Math.pow( lcb , 3 )) ;

        rcy = ( 10 ) ;
        hcy = ( 5 ) ;
        scy = ( ( 2 * Math.PI * rcy * hcy ) + (( 2 * Math.PI ) * ( Math.pow( rcy ,2 )))) ;
        vcy = ( ( Math.PI * ( Math.pow( rcy , 2 )) * ( hcy )      )) ;

        rco = ( 3 ) ;
        hco = ( 7 ) ;
        aco = ( 7.615773106 ) ;
        sco = ( (Math.PI * rco * aco) + (Math.PI * (Math.pow(rco , 2))) ) ;
        vco = (( Math.PI * 7 * ( Math.pow( rco , 2 ))) /3 ) ;




        System.out.println ("Le cercle") ;
        System.out.println (" - rayon      : " + rce ) ;
        System.out.println (" - Surface    : " + df.format (sce) ) ;

        System.out.println ("Le cube") ;
        System.out.println (" - longueur   : " + lcb ) ;
        System.out.println (" - Surface    : " + df.format (scb) ) ;
        System.out.println (" - Volume     : " + df.format (vcb) ) ;

        System.out.println ("Le cylindre") ;
        System.out.println (" - rayon      : " + rcy ) ;
        System.out.println (" - hauteur    : " + hcy ) ;
        System.out.println (" - Surface    : " + df.format (scy) ) ;
        System.out.println (" - Volume     : " + df.format (vcy) ) ;

        System.out.println ("Le cone") ;
        System.out.println (" - rayon      : " + rco ) ;
        System.out.println (" - hauteur    : " + hco ) ;
        System.out.println (" - apotheme   : " + df.format (aco) ) ;
        System.out.println (" - Surface    : " + df.format (sco) ) ;
        System.out.println (" - Volume     : " + df.format (vco) ) ;

        sc.close();

    }
}