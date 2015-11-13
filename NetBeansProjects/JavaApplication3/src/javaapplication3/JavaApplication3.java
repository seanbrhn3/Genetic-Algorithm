/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author root
 */
public class JavaApplication3{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(peak("Mount Killinmynegros"));
        System.out.println("Mintutes:" + ClimbTime(13));
       
    }
   public static String peak(String peakName){
   return "you climbed:" + " " + peakName;
   }
   public static int ClimbTime(int time){
   return time;
   }
}

