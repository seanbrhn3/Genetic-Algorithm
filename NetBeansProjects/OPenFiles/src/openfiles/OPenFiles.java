/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openfiles;

import java.net.*;

public class OPenFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(scratch(90,90));
        System.out.println(correction(true,false,true));
        getIP();
    }
    public static int scratch(int a, int b){
        try{
            int c = 5;
              if(a == b) return c;
    }
   
    catch(ArithmeticException e){
        System.out.println("stop!!!");
    }
    if(a >b) return a;
    else return b;
    
    }
    public static boolean correction(boolean correct, boolean wrong, boolean neither){
    try{
    if(neither == true);
    }catch(Exception g){
    return false;
    }
    if(correct == true && wrong == false && neither == false) return true;
    else return false;
    }
    public static void getIP(){
    InetAddress ip;
    try{
        ip = InetAddress.getLocalHost();
        System.out.println("My IP is:" + " "  + ip.getHostAddress());
    }catch(UnknownHostException e){
    e.printStackTrace();
    }

    }
}
