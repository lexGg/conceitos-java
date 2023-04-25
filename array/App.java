import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ira digitar a altura de quantas pessoas: ");
        int n = sc.nextInt();
        double peoples[] = new double[n];
        double media = 0.0;
        for (int i = 0; i<n; i++) {
            System.out.printf("pessoa pesso: ");
            peoples[i] = sc.nextDouble();
        }

        for (double p : peoples) {
            media += p;
        }
        media /= peoples.length;
        System.out.printf("Valor medio das pessoa: %.2f", media);
    }
}
