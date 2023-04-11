package teste;

import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {

        // ler o string a ser invertido
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um string: ");
        String input = scanner.nextLine();

        // inverter o string
        StringBuilder output = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }

        // exibir o resultado
        System.out.println("O string invertido é: " + output);

        scanner.close();
    }
}
