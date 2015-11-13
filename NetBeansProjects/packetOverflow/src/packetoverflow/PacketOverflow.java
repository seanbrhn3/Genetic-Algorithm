/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packetoverflow;
import java.io.*;
/**
 *
 * @author root
 */
public class PacketOverflow {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
      AtakitPakit(3);
      
      
    }
    public static void AtakitPakit(int num) throws FileNotFoundException, UnsupportedEncodingException{
        for(int i =0; i < num; i++){
            
            try (PrintWriter out = new PrintWriter("packAttack.txt", "UTF-8")) {
                out.println("attack!!!!!!!");
                out.close();
            }
        }
    }
    public static void readFile(File in){
        try{
            
        }catch(IOEception e){
        
        }
    }
}
