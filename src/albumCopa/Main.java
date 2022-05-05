package albumCopa;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTotal = scan.nextInt();
        Set<Integer> setFig = new HashSet<>();
        int numFigCompradas = scan.nextInt();
        for (int i=0; i < numFigCompradas ;i++) {
            int x = scan.nextInt();
            setFig.add(x);
        }

        System.out.println(numTotal - setFig.size());
    }
}
