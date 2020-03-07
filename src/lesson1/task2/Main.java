package lesson1.task2;

import java.util.Scanner;

public class Main {

    /**
     * Возвращает случайное целое число в заданном диапазоне [min, max]
     * @param min левая граница диапазона
     * @param max правая граница диапазона
     * @return случайное число в отрезке [min, max]
     */
    private static int getRandomInteger(int min, int max) {
        return (int) (min + Math.random() * (max + 1));
    }

    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество генерируемых чисел: ");
        int numbersCount = scanner.nextInt();

        for (int i = 0; i < numbersCount; i++) {
            int k = getRandomInteger(-100, 100);

            if (k < 0) throw new IllegalArgumentException();

            double squareRoot = Math.sqrt(k);
            int decimalPartOfSquareRoot = (int) squareRoot;

            if (decimalPartOfSquareRoot * decimalPartOfSquareRoot == k) System.out.println(k);
        }
    }
}
