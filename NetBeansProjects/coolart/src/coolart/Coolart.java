/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coolart;

/**
 *
 * @author root
 */
public class Coolart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int[] ar = {1,2,3,4,5,6,7,8};
   printArr(ar);
   searchArr(8, ar);
   insertArr(11, ar);
    }
  public static void printArr(int[] arr){
  for(int i = 0; i < arr.length; i++){
  System.out.println(i);
    }
  }
   public static void searchArr(int key, int[] arr){
   for(int i =0; i < arr.length; i++){
   if(key == arr[i]) System.out.println(key + "is at an index of:" + i );
   else System.out.println(-1);
   }
   }
   public static void insertArr(int num, int[] arr){
   System.out.println("Original array:" + arr);
   int[] a1 = new int[9];
   a1 = arr;
   for(int i = 0; i < a1.length; i++){
   if(num != a1[9]){
   a1[9] = num;
   System.out.println(a1);
   } 
   }
}
}
