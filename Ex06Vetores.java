package ex06vetores;
import java.util.Scanner;

public class Ex06Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] vetor = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println("Digite o numero que deseja remover:");
        int numero = scanner.nextInt();
        
        boolean encontrado = false;
        
        System.out.println("Vetor apos remoção:");
        for (int i=0; i<vetor.length; i++){
            if (vetor [i] == numero && !encontrado){
                encontrado = true;
                continue;
            }
            System.out.println(vetor[i]+"");
        }
        
        if (!encontrado){
            System.out.println("\nNumero nao encontrado no vetor");
        }
    }
}
