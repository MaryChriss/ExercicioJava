import java.util.Scanner;

public class InversaoString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine();
        scanner.close();

        String stringInvertida = inverter(input);
        System.out.println("Palavra invertida: " + stringInvertida);
    }

    public static String inverter(String s) {
        String invertida = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertida += s.charAt(i);
        }
        return invertida;
    }
}

