package ex05vetores;
import java.util.Scanner;

public class Ex05Vetores {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        int[] numeros = new int[12];
        int soma = 0;
        
        for (int i =0; i<numeros.length; i++){
            System.out.println("Digite o numero:"+ i+1);
            numeros[i]= scanner.nextInt();
            soma += numeros[i];
        }
        
        double media = (double) soma/numeros.length;
        
        int acimaDaMedia = 0;
        for (int i=0; i<numeros.length; i++){
            if (numeros[i] >media){
                acimaDaMedia++;
            }
        }
        
        System.out.println("Media:"+media);
        System.out.println("Quantidade de notas acima da media:"+ acimaDaMedia);
    }
}
