import java.util.Scanner;

public class EX348 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] pr1 = new double[5];
        double[] pr2 = new double[5];
        double[] media = new double[5];

        for (int L = 0; L <= 4; L++) {
            System.out.println("\nDigite " + (L + 1) + " nome: ");
            nomes[L] = scanner.nextLine();
            System.out.println("Digite 1a nota: ");
            pr1[L] = scanner.nextDouble();
            System.out.println("Digite 2a nota: ");
            pr2[L] = scanner.nextDouble();
            media[L] = (pr1[L] + pr2[L]) / 2;
            scanner.nextLine();
        }

        System.out.println("\n\n\n\t\t\tRELACAO FINAL\n");
        for (int L = 0; L <= 4; L++) {
            System.out.println("\n\t" + (L + 1) + " - " + nomes[L] + "\t" + pr1[L] + "\t" + pr2[L] + "\t" + media[L]);
        }

        scanner.close();
    }
}