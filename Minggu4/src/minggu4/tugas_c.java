/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class tugas_c {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int [] arr;
        int n, max, min, sum = 0, count = 0;
        int avg = 0;
        
        System.out.println("Masukkan banyak nya data nilai");
        n = sc.nextInt();
        arr= new int [n];
        
        for (int i =0; i<arr.length; i++){
        System.out.println("Masukkan nilai ke-" + (i+1) +" : ");
        arr[i] = sc.nextInt();    
    }
        max = arr[0];
        min = arr [0];
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            count++;
            if (arr[i]>max) {
                max= arr[i];
                
            } else if (arr[i]<min){
                min = arr[i];    
            }
        }
        System.out.println("nilai minimum = "+ min);
        System.out.println("nilai maksimum = " + max);
        
        avg = sum/count;
        System.out.println("nilai rata - ratanya adalah = " + avg);
    }
    
}
