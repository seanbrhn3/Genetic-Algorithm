/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genetic.algorithm;

/**
 *
 * @author root
 */
public class GeneticAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //int z counts as a gentic markup of an organism
     // every two bits of data represent a chromosome
        int[] z = {1,0,1,0,0,0,1,1,1,1,0,0};
        int[] c = {1,1};
       System.out.println(selection(z));
       System.out.println(selection(c));
       System.out.println(mutation(z,c));
    }
    //this is the population array where the algorithm will search through
    public static String selection(int[] pop){
   for(int i = 0; i < pop.length-1; i++){
   if(pop[i+1] == 1) return "Survived";
   else if(pop[i+1] == 0) return "died";
   else if(pop[i] == 1 && pop[i+1] == 1) return "Evolved";
   return "etinct";
   } 
   return "devolved";
    }
    public static String half(int[] half){
     for(int i = 0; i < half.length/2-1; i++){
   if(half[i+2] == 1 && half[i+1] == 0) return "Survived";
   if(half[i+2] == 0) return "died";
   if(half[i] == 1 && half[i+2] == 1) return "Evolved";
   return "etinct";
    }
        return "devolved";
    }
//this method will add the two chromosomes together 
    public static String mutation(int[] ev1 , int[] ev2){
 for(int i = 0; i < ev1.length; i ++){
     for(int r=0; r < ev2.length; r++){
     if(ev2[r] == ev1[i]){
     return " Evolved sucessfully!!!";
     }else{
     return "Evolution failed deformed";
     }
     }
   
 }
   return "homeostasis";
    }
}
