/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypothesis.testing;

/**
 *
 * @author root
 */
public class HypothesisTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hoa("coco puffs are better than fruity pebbles","coco puffs are better than fruity pebbles","<");
        
    }
    public static void hoa(String ho, String ha, String symbol){
    ha = ho;
        System.out.println(ho + " " + "for ha is it >, < not =");
    if(symbol.equals(">")){
    System.out.println(ho.substring(1).equals("greater than"));
    }if(symbol.equals("<")){
    System.out.println(ho.substring(1).equals("less than"));
    }if(symbol.equals("not =")){
        System.out.println(ho.substring(1).equals("not ="));
    }else{
    System.out.println("invalud input");
    }
    
    }
}
