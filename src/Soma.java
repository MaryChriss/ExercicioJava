public class Soma {

    public static void main(String[] args) {

        int i = 13, soma = 0, k = 0;

        while (k < i) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println("O valor da soma é: " + soma);
    }
}