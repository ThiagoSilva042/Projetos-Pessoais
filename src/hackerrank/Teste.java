package hackerrank;
import java.util.Scanner;

public class Teste {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("================================");
	for(int i = 0; i <3; i++) {
		String s1= sc.next();
		int number = sc.nextInt();
		
		System.out.printf("%-15s%03d%n",s1, number);
	}
	System.out.println("================================");
}
 
}
