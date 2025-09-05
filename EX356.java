import java.util.Scanner;

public class EX356 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        double[] media = new double[15];
        String[] sit = new String[15];

        for (int L = 0; L < 15; L++) {
            System.out.print("Digite o " + (L + 1) + "o nome: ");
            nomes[L] = scanner.nextLine();

            System.out.print("Digite a 1a nota: ");
            pr1[L] = scanner.nextDouble();
            System.out.print("Digite a 2a nota: ");
            pr2[L] = scanner.nextDouble();
            scanner.nextLine();

            media[L] = (pr1[L] + pr2[L]) / 2;

            if (media[L] >= 7) {
                sit[L] = "AP";
            } else if (media[L] >= 4) {
                sit[L] = "RF";
            } else {
                sit[L] = "RP";
            }
        }

        System.out.println("\n\n\n\t\t\tRELACAO FINAL\n");
        for (int L = 0; L < 15; L++) {
            System.out.printf("\t%s\t%.1f\t%.1f\t%.1f\t%s\n", nomes[L], pr1[L], pr2[L], media[L], sit[L]);
        }

        scanner.close();
    }
}