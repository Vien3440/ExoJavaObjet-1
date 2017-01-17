/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList; // Pour utiliser ArrayList
import java.util.List; // Pour utiliser les List

/**
 *
 * @author vivien // c'est moi :)
 */
public class Test {
    public static void main(String[] args) {
       Meuble tableCaca = new Table(); //  je crees une nouvel table: tableCaca
//       tableCaca.getHeight(); Pour appeler la methode  getHeight() de mon object
        
       Meuble armoireCaca = new Armoire();  // je crees une nouvel armoire: armoireCaca
//       armoireCaca.getHeight();
       


       List <Meuble> meubles = new ArrayList();//  Je fait une liste de meuble 
       
       meubles.add(new Table()); //  je crees une nouvel table que je met dans ma liste
       meubles.add(tableCaca); // j'appel ma tableCaca
       meubles.add(armoireCaca); //  j'appel ma armoireCaca
       
      // c'ette boucle sert a appler ma methode a tout mes object de ma List meubles
        for (Meuble meuble : meubles) {
            meuble.getHeight();
        }
    }
}
