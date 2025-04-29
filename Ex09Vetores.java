package ex09vetores;
import java.util.Scanner;

public class Ex09Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] A = new int[6];
        int[] B = new int[6];
        int[] intersecao = new int[6];
        int k = 0;

        System.out.println("Digite 6 números para o vetor A:");
        for (int i = 0; i < 6; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite 6 números para o vetor B:");
        for (int i = 0; i < 6; i++) {
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (A[i] == B[j]) {
                   
                    boolean jaExiste = false;
                    for (int m = 0; m < k; m++) {
                        if (intersecao[m] == A[i]) {
                            jaExiste = true;
                            break;
                        }
                    }
                    if (!jaExiste) {
                        intersecao[k] = A[i];
                        k++;
                    }
                }
            }
        }

        if (k == 0) {
            System.out.println("Não há elementos em comum.");
        } else {
            System.out.print("Elementos em comum (interseção): ");
            for (int i = 0; i < k; i++) {
                System.out.print(intersecao[i] + " ");
            }
        }        
    }       
}
