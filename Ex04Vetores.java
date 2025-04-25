package ex04vetores;
import java.util.Scanner;

class Ex04Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] vetor = new int[8];
        
        for (int i = 0; i<vetor.length; i++){
            System.out.println("Digite o numero:"+ (i+1) +":");
            vetor[i]= scanner.nextInt();
        }
        
        System.out.println("Vetor na ordem inversa:");
        for (int i = vetor.length - 1; i>0; i--){
            System.out.println(vetor[i]+"");
        }
    }
}
