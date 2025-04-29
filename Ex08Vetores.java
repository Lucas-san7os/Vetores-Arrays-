package ex08vetores;
import java.util.Scanner;

public class Ex08Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] A= new int[5];
        int[] B= new int[5];
        int[] C= new int[10];
        
        System.out.println("Degite os numeros do vetor A:");
        for( int i=0; i<5; i++){
            System.out.println("A ["+ i +"]:");
            A[i]= scanner.nextInt();
        }
        
        System.out.println("Degite os numeros do vetor B:");
        for( int i=0; i<5; i++){
            System.out.println("B ["+ i +"]:");
            B[i]= scanner.nextInt();
    }
         for (int i = 0; i < 5; i++) {
            C[i] = A[i];    
            C[i + 5] = B[i];
        }
         System.out.println("Vetor C:");
         for (int i=0; i<10; i++){
             System.out.print(C[i] + " ");
         }
    }
        
}
