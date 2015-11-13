/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package open;
import java.io.*;
/**
 *
 * @author root
 */
public class Open {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     FileOutputStream fout;
     try{
         //open output stream
         fout = new FileOutputStream("file.txt");
         
         //writes to file
         new PrintStream(fout).println("hello worls");
         System.out.println(readF(fout));
         //closes file
         fout.close();
     }catch(IOException e){
         System.err.println("this wont work stop");
         System.exit(-1);
     }
     
     
    }
    public static void readF(){
    FileOutputStream fin;
        try{
        fin = new FileInputStream ("myfile.txt");
        
        //read lines
        System.out.println(new DataInputStream(fin).readline());
        
        fin.close();
        }catch(IOException e){
            System.err.println("this wont work");
            System.exit(-1);
        }
    
    }
}
