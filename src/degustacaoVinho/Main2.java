package degustacaoVinho;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] respostasCompetidores = new int[5];
        for (int i=0; i < 5; i++){
            respostasCompetidores[i] = scan.nextInt();
        }
        int count = 5;
        for (int resposta : respostasCompetidores){
            if (resposta != T)count--;
        }
        System.out.println(count);
    }
}
