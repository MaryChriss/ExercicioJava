import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");

        int num = scanner.nextInt();
        scanner.close();

        if (isFibonacci(num)) {
            System.out.println("O número " + num + " faz parte da sequencia.");
        } else {
            System.out.println("O número " + num + " NÃO faz parte da sequencia .");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        while (b <= num) {
            if (b == num) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }
}
