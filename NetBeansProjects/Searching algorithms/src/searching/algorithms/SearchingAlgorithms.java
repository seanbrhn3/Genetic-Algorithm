/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching.algorithms;

/**
 *
 * @author root
 */
public class SearchingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arr1 = {1,4,6788,34,5,12,423,65,7,4345,63,4,6,7};
        //for the linear algorithm to work you must specify the number you are
        //looking for
       int searchkey = 34;
       System.out.println("You're key was:" + searchkey + "The index was:" + linearSearch(searchkey, arr1));
      
    }
    //linear search yay!!!!
private static int linearSearch(int key, int[] arr){
for(int i=0; i < arr.length; i++){
if(arr[i] == key){
return key;
}
}
return -1;
}
}
