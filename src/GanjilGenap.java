import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " adalah angka genap.");
        } else {
            System.out.println(number + " adalah angka ganjil.");
        }

        scanner.close();
    }
}
