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
public class Armoire extends Meuble {
    String nom;
    String couleur;
    int tiroire;
    int hauteurTiroires;
    int hauteurPorte;
    void deplacement() {}
   public Armoire(){
       nom = "IKEA";
       couleur = "rouge";
       tiroire = 1;
       hauteurTiroires = tiroire * 15;
       hauteurPorte = 2000;
       System.out.println("Création d'une armoire " + nom + " " + couleur +"!");
       
   }
    @Override
void getHeight() {
    int getHeight = this.hauteurTiroires + this.hauteurPorte; 
        System.out.println("Hauteur = "+ getHeight + "cm !");
}

}
