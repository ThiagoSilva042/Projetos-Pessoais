package hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class javaLoops2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
        int soma = 0;
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            if ((n >= 1 && n <= 15) && (a >= 0 && a <= 50) && (b >= 0 && b <= 50)) {
                int j = 0;
                while (j < n) {
                    int calculo = (int) Math.pow(2, j) * b;
                    soma = soma + calculo;
                    int resultado = soma + a;
                    System.out.print(resultado + " ");
                    j++;
                }
                soma = 0;
                int resultado = 0;
            }
            System.out.println("");
        }
        sc.close();

	}

}
