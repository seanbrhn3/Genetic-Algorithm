/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjunk;
import java.util.*;
/**
 *
 * @author root
 */

public class NewJunk {
public static int[] passwords = new int[3];
public static String[] usernames = new String[3];
public static int[] passlist = new int[] {1231,14353453, 2344};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      login("tiffany", 14353453);
      crackingThatPass(passwords, passlist);
      printArr(passwords, usernames);
    }
    private static void login(String usr,int pass){
        //add the usernames to the array
        usernames[0] = usr;
       
        //adds to the password array
        passwords[0] = pass;
        
        //verifies whether the usernames are the same
        if(usernames[0] == usernames[1] || usernames[0] == usernames[2]){
            System.out.println("usernamse cannot equal each other");
        }else{
            System.out.println("add username succefully");
        }
        
        //verifies if the passwords are the same
        if(passwords[0] == passwords[1] || passwords[0] == passwords[1]){
            System.out.println("passwords cannot be the same");
        }else{
            System.out.println("passwords accepted");
        }
    }
    
public static void printArr(int[] arr, String[] arr2){
    // shows you the passwords
        for(int i : passwords){
            System.out.println(i);
        }
        int arrl = arr2.length;
        for(String  i : usernames){
            System.out.println(i);
        }
    }
private static void crackingThatPass(int[] arr, int[] cracker){
        if(arr[0] == cracker[0] || arr[0] == cracker[1] || arr[0] == cracker[2]){
            System.out.println("cracker succesful, password is:" + arr[0]);
        }else{
            System.out.println("no dice cracker fail");
        }
    }
}
