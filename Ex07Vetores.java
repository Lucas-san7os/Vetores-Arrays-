package ex07vetores;
import java.util.Scanner;

public class Ex07Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] vetor = new int[15];
        System.out.println("Digite 15 numeros inteiros:");
        for(int i=0; i<vetor.length; i++){
            System.out.println("Numero"+(i+1)+":");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Digite o numero que deseja contar:");
        int numero = scanner.nextInt();
        
        int contador = 0;
        for(int i=0; i<vetor.length; i++){
            if (vetor[i] == numero){
                contador++;
            }
        }
        System.out.println("O numero"+ numero +"aparece"+ contador +"vezes no vetor:");
    }
}
