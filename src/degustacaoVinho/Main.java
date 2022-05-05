package degustacaoVinho;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Código que passou por todos os testes
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        String respostasCompetidores = scan.nextLine();

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" ");
        int count = 0;
        for (String respostas : respostasCompetidoresSplit) {
            if (respostas.equals(T)){
                count++;
            }
        }

        System.out.println(count);
    }
}
