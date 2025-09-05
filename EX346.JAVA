import java.util.Scanner;

public class EX346 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("OPCAO: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite uma frase: ");
                    String frase1 = scanner.nextLine();
                    System.out.println("Numero de caracteres da frase: " + frase1.length());
                    break;
                case 2:
                    System.out.print("Digite uma frase: ");
                    String frase2 = scanner.nextLine();
                    int tam = frase2.length();
                    System.out.println("Dois primeiros caracteres: " + frase2.substring(0, 2));
                    System.out.println("Dois ultimos caracteres: " + frase2.substring(tam - 2));
                    break;
                case 3:
                    System.out.print("Digite uma frase: ");
                    String frase3 = scanner.nextLine();
                    String fraseEspelhada = new StringBuilder(frase3).reverse().toString();
                    System.out.println("Frase espelhada: " + fraseEspelhada);
                    break;
                case 4:
                    System.out.println("Fim do algoritmo");
                    break;
                default:
                    System.out.println("Opcao nao disponivel");
                    break;
            }

            System.out.println();
        } while (op != 4);

        scanner.close();
    }
}