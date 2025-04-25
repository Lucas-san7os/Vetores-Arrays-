package ex02vetores;
import java.util.Scanner;

public class Ex02Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] vetor = new int[15];
        int maior = vetor[0];
        int indiceMaior = 0;
        
        for (int i=0; i< vetor.length; i++){
            System.out.println("Digite o valor na posicao" +i+ ":");
            vetor[i] = scanner.nextInt();
            
            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
                
                System.out.println("O maior valor e:"+ maior + "Sua posicao e:"+ indiceMaior);
                
            }
        }
    }
}
