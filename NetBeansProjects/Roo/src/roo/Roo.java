/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roo;

/**
 *
 * @author root
 */
public class Roo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(triangle(45 ,0,45));
    }
    public static boolean triangle(int a, int b, int c){
    int g = a + b + c;
        if(g == 180){
            return true;
           
        }if(a == 0 && b > 0 && c >0){
        a = b + c - 180;
        g = a + b + c;
        if( g == 180) return true;
        else return false;
        }
        if(a > 0 && b ==0 && c > 0){
        b = a + c -180;
        if(a + b +c == 180) return true;
        else return false;
        }if(a >0 && b > 0 && c == 0){
        c = a + b - 180;
        if(a + b + c == 180) return true;
        else return false;
        }
        
        else{
            return false;
        }
    }
}
