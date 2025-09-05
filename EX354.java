import java.util.Scanner;

public class EX354 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[15];

        for (int L = 0; L <= 14; L++) {
            System.out.print("Digite o " + (L + 1) + "o numero: ");
            num[L] = scanner.nextInt();
        }

        System.out.println("\nRELACAO DOS NUMEROS\n");
        for (int L = 0; L <= 14; L++) {
            String mensagem = (num[L] % 2 == 0) ? "e PAR" : "e IMPAR";
            System.out.println("\t" + (L + 1) + " - " + num[L] + " " + mensagem);
        }

        scanner.close();
    }
}