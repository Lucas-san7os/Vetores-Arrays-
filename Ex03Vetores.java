package ex03vetores;
import java.util.Scanner;

public class Ex03Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int[] numeros= new int [20];
        int quantidadePares = 0;
        
        for (int i=0; i< numeros.length; i++){
            System.out.println("Digite o"+ (i+1)+ "°numero:");
            numeros[i]= scanner.nextInt();
                       
           if (numeros[i] %2 == 0 ) {
               quantidadePares++;
           }
        }
        System.out.println("Quantidade de numeros pares e:"+ quantidadePares);
    }
}
