/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author vivien
 */
public class Table extends Meuble{
    
    String nom;
    String couleur;
    int plateau;
    int hauteurPlateau;
    int pieds;
    int hauteurPieds;
    void deplacement() {}
   public Table(){
       nom = "IKEA";
       couleur = "rouge";
       plateau = 1;
       hauteurPlateau = 5;
       pieds = 4;
       hauteurPieds = 800;
       System.out.println("Création d'une table " + nom + " " + couleur +"!");
       
   }

    @Override
    void getHeight() {
        int getHeight = this.hauteurPieds + this.hauteurPlateau; 
        System.out.println("Hauteur = "+ getHeight + "cm !");
    }
}