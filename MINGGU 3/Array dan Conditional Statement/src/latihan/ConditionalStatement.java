package latihan;
import java.util.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;

public class ConditionalStatement {
    public static void main(String[] args) {
        //membuat variabel dan scanner
        int nilai;
        String grade;
        Scanner scan = new Scanner (System.in);    
        System.out.println("Inputkan nilai : ");
        nilai = scan.nextInt();
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";    
        }else if (nilai >= 70) {
            grade = "B";
        }else if (nilai >= 60) {
            grade = "C+";
        }else if (nilai >= 50) {
            grade = "C";   
        }else if (nilai >= 40) {
            grade = "D";
        }else {
            grade = "E";
        }
        System.out.println("Grade : " + grade);
}
}
