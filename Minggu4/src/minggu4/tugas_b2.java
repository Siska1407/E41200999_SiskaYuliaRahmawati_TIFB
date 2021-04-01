/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

/**
 *
 * @author user
 */
public class tugas_b2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Do_While");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        int i=0;
        do
        {
            System.out.print("  "+i*2);
            i++;
        }
        while(i<=100);
    }
    
}
