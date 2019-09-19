/*  Laboratoire_A
standard #3 Boite Noire
par Anthony Morin
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class BoiteNoire {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.###");


        double mVolSphere ;
        double poidsSphere ;
        double rayonSphere ;
        double volumeSphere ;

        double mVolSubstanceIsolation ;
        double poidsSubstanceIsolation ;
        double volumeSubstanceIsolation ;
        double quantiteSubstanceIsolation ;

        double poidsBoite ;
        double volumeBoite ;
        double poidsTotal ;

        // informations connues
        volumeBoite = 125 ; // (m³)
        poidsBoite = 375 ; // (kg)
        mVolSphere = 3517 ; // (kg/m³)
        rayonSphere = 2.15 ; // (m)
        mVolSubstanceIsolation = 13545.88 ; // (kg/m³)


        // calcul sphère
        volumeSphere = ( (4 * Math.PI / 3) * ( Math.pow(rayonSphere , 3) ) ) ;
        poidsSphere = ( mVolSphere * volumeSphere ) ;

        // calcul substance isolante
        volumeSubstanceIsolation = ( volumeBoite - volumeSphere ) ;
        poidsSubstanceIsolation = ( mVolSubstanceIsolation * volumeSubstanceIsolation ) ;
        quantiteSubstanceIsolation = ( volumeSubstanceIsolation * 1000 ) ;

        // calcul Boite noire
        poidsTotal = ( poidsSphere + poidsSubstanceIsolation ) ;


        // Affichage du rapport d'informations
        System.out.println("-------------------------------------------");
        System.out.println("- RAPPORT D'INFORMATIONS");

        System.out.println(" Sphere");
        System.out.println(" * Masse volumique : " + (df.format(mVolSphere) + " kg/m³") );
        System.out.println(" * Poids : " + (df.format(poidsSphere) + " kg")) ;
        System.out.println(" * Rayon : " + (df.format(rayonSphere) + " m")) ;
        System.out.println(" * Volume : " + (df.format(volumeSphere) + " m³")) ;

        System.out.println(" Substance isolante");
        System.out.println(" * Masse volumique : " + (df.format(mVolSubstanceIsolation)) + " kg/m³") ;
        System.out.println(" * Poids : " + (df.format(poidsSubstanceIsolation)) + " kg") ;
        System.out.println(" * Volume : " + (df.format(volumeSubstanceIsolation)) + " m³") ;
        System.out.println(" * Quantite : " + (df.format(quantiteSubstanceIsolation)) + " L") ;

        System.out.println(" Boite noire");
        System.out.println(" * Poids : " + (df.format(poidsBoite)) + " kg") ;
        System.out.println(" * Volume : " + (df.format(volumeBoite)) + " m³") ;
        System.out.println(" * Poids total : " + (df.format(poidsTotal)) + " kg") ;
        System.out.println("-------------------------------------------") ;

        sc.close();

    }
}