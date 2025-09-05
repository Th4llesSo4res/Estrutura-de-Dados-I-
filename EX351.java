import java.util.Scanner;

public class EX351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        int num;

        for (int L = 0; L <= 4; L++) {
            System.out.print("Digite " + (L + 1) + "o nome: ");
            nomes[L] = scanner.nextLine();
        }

        do {
            System.out.print("\nDigite o numero da pessoa (1 a 5): ");
            num = scanner.nextInt();
            scanner.nextLine();

            if (num < 1 || num > 5) {
                System.out.println("O numero esta fora do intervalo");
            } else {
                System.out.println("Nome: " + nomes[num - 1]);
            }
        } while (num < 1 || num > 5);

        scanner.close();
    }
}