package coxinhaBueno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H, P;
        H = scan.nextInt();
        P = scan.nextInt();

        double media = Double.parseDouble(String.valueOf(H))/Double.parseDouble(String.valueOf(P));
        System.out.printf("%.2f",   media  );
    }
}
