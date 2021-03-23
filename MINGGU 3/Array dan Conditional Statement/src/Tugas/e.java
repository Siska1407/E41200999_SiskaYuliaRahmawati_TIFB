package Tugas;
import java.util.Scanner;
public class e { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("       CAFE CERIA            ");
        System.out.println("      ANEKA MINUMAN          ");
        System.out.println("-----------------------------");
        System.out.println("      SPECIAL MENU:        ");
        System.out.println("1. Soft drinks");
        System.out.println("2. Mix juice");
        System.out.println("3. Nescafe");
        System.out.println("4. Soda milk");
        System.out.println("5. Tea");
        System.out.println("-----------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama pembeli :  ");
        String nama = s.nextLine();
        
        System.out.println("Silahkan masukkan pilihan anda: ");
        int pilih = s.nextInt();
        String pilihan = "";
        
        switch (pilih){
            case 1 :
                System.out.println("Soft drinks");
                break;
            case 2 :
                System.out.println(" Mix juice");
                break;
            case 3 :
                System.out.println("nescafe");
                break;
            case 4 :
                System.out.println(" Soda milk");
                break;
            case 5 :
                System.out.println("Tea");
                break;   
            default:
                System.out.println("pilihan anda tidak ada di menu");
                break;       
        }
            System.out.println("Minuman yang anda pesan adalah : " + pilih);
            System.out.println("Pesanan anda akan segera di antar");
            System.out.println("Terima Kasih " + nama + " telah berkunjung ke CAFE CERIA"); 
    }
    
}
