package teste;

import java.util.Scanner;

public class PerguntaUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite FaturamentoMensal número inteiro: ");
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int fib = 0;
        while (fib < num) {
            fib = a + b;
            a = b;
            b = fib;
        }
        if (fib == num) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}
