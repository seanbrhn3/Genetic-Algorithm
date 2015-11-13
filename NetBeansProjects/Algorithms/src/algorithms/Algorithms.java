/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author root
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] mixed = {1001,1,5,78,34,900};
      insertionSort(mixed);
      
    }
public static void printArray(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
//The infamous insertion sort algorithm
  public static void insertionSort(int array[]){
  for(int j=0; j < array.length; j++){
  int key = array[j];
  int i = j -1;
  while((i > -1) && (array[i] > key)){
  array[i+1] = array[i];
  i--;
  }
  array[i+1] = key;
  printArray(array);
  }
  }
  //Next up is the merge sort algorithm the fastest of all the array algorithms
   public static void mergeSort(int[] array){
   // Divide
       for(int j = 0; j < array.length; j++){
            if(array[j] == 0 || array.length == 1){
                return;
            }else{
                int[] fhalf = array.length/2;
                int[] shalf = array.length/2-1;
                if(fhalf > shalf){
                    printArray(fhalf);
                }
            }
                  
            
            
       }
     
       
   }
   
   
}
