/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author vivien
 */
public class Table extends Meuble{
    
    String nom;
    String couleur;
    int plateau;
    int nbPieds;
    
    
   public Table(){
       nom = "IKEA";
       couleur = "rouge";
       nbPieds = 4 ;
        int i;
       ArrayList listePieds = new ArrayList();
       for(i=0; i < nbPieds;i++){
              listePieds.add(new Pied());
         
       }
       
       System.out.println("Création d'une table nom " + nom + "Couleur "+ couleur +" Nb de pieds "+ nbPieds + " Liste de Pieds" + listePieds +"!");
       
   }

    @Override
    void getHeight() {
        
        System.out.println("Hauteur = x cm !");
    }
}