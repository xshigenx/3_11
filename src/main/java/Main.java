import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę wierszy:");
        int rows = scanner.nextInt();

        System.out.println("Podaj liczbę kolumn:");
        int columns = scanner.nextInt();

        System.out.println("Podaj znak, z którego ma być zbudowana macierz:");
        char symbol = scanner.next().charAt(0);

        generateMatrix(rows, columns, symbol);
    }

    public static void generateMatrix(int rows, int columns, char symbol) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
