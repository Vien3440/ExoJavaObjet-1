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


public class Armoire extends Meuble {
 // Declaration des propriete de meuble 
    String nom;
    String couleur;
    int nbTiroire;
    int hauteurTiroires;
    int hauteurPorte;
    int nbPieds;
    int hauteurPied;
   public Armoire(){ // constructeur
       nom = "IKEA";
       couleur = "rouge";
       nbTiroire = 1; //  pour moi une armoir cest sa  :  http://images.google.fr/imgres?imgurl=http%3A%2F%2Fwww.pimpamela.com%2Fwp-content%2Fuploads%2F2012%2F10%2Farmoire-a-3temps.jpg&imgrefurl=http%3A%2F%2Fwww.pimpamela.com%2Ftout-range%2Fles-armoires-de-laurette-550.htm&h=2362&w=2362&tbnid=kiegAiMvKSo5IM%3A&vet=1&docid=KE5R1LjRoD5gdM&ei=sox-WP-SLYjaapfLifAM&tbm=isch&iact=rc&uact=3&dur=757&page=6&start=146&ndsp=28&ved=0ahUKEwj_s4nzj8rRAhUIrRoKHZdlAs44ZBAzCEgoRjBG&bih=629&biw=1301
       hauteurTiroires = nbTiroire * 15;
       hauteurPorte = 2000;
       hauteurPied = 50;
       nbPieds = 4;
       ArrayList listePieds = new ArrayList();
        int i;
       for (i=0;i<nbPieds;i++){
           listePieds.add(new Pied());
       }
       System.out.println("Création d'une armoire " + nom + "  listePieds" + listePieds + couleur +"!");
       
   }
    @Override
void getHeight() {
        int height = hauteurPied +hauteurTiroires + hauteurPorte;
        System.out.println("Hauteu Armoire "+nom+" = " +height+" cm !");
}

}
