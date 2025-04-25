package ex01vetores;


public class Ex01Vetores {

    public static void main(String[] args) {
        
        int[] vetor= {5,8,2,10,3,7,1,9,4,6};
        int soma = 0;
        
        for (int i = 0; i < vetor.length; i++){
            soma +=vetor [i];
        }
        
        System.out.println("A soma dos vetores e:"+ soma);
    }
}
