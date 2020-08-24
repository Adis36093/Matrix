/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixmultipyandadd;

import java.util.Scanner;

/**
 *
 * @author adis3
 */
public class MatrixMultipyAndAdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int[][] result = new int[3][3];
       
       int[][] array1 = new int[3][3];
       for(int i=0; i<3; i++){
           for(int j=0; j<3; j++){
               array1[i][j]=scan.nextInt();
           }
       }
       
       int[][] array2= new int[3][3];
       for(int i=0; i<3; i++){
           for(int j=0; j<3; j++){
               array2[i][j]=scan.nextInt();
           }
       }
       
       for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
               result[i][j] = array1[i][j]+array2[i][j];
               }
               }
       System.out.println();
       
       for(int[] i:result){
           for(int j:i){
               System.out.print(j+" ");
           }
           System.out.println();
       }
       
       
       }
       
       
    }
       


