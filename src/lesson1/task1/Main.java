package lesson1.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Точка входа приложения
 */
public class Main {

    /**
     * Список ключевых цифр, используется  для определения корректности введенных данных
     */
    private static final ArrayList<String> OPTIONS = new ArrayList<>(Arrays.asList("1", "2", "3", "0"));

    /**
     * Метод для генерации NullPointerException
     */
    private static void generateNullPointerException() {
        ArrayList list = null;
        list.clear();
    }

    /**
     * Метод для генерации ArrayIndexOutOfBoundsException
     */
    private static void generateArrayIndexOutOfBoundsException() {
        int[] decimalNumbers = { 1, 2 };
        int number = decimalNumbers[decimalNumbers.length + 1];
    }

    /**
     * Метод для генерации кастомного Exception
     * @throws Exception - тип генерируемого исключения
     */
    private static void generateCustomException () throws Exception {
        throw new Exception("Some custom exception");
    }

    /**
     * Метод для проверки введенных данных на валидность
     * @param option введенные данные
     * @return true, если данные валидны, иначе генерирует исключение
     * @throws Exception - тип сгенерированного исключения, которое может быть "выброшено" методом
     */
    private static boolean isOptionValid(String option) throws Exception {
        if (!OPTIONS.contains(option)) throw new Exception("Вы мисскликнули :с");
        return true;
    }

    /**
     * Стартовый метод программы
     * @param args аргументы, которые можно указать при запуске программы
     * @throws Exception тип сгенерированного исключения, которое может быть "выброшено" методом
     */
    public static void main(String[] args) throws Exception {
        boolean isProgramWorks = true;
        Scanner scanner = new Scanner(System.in);

        while(isProgramWorks) {
            System.out.println("Нажмите 1, 2 иди 3 в зависимоти от того, какой Exception желаете смоделировать.\n" +
                    "1. Смоделировать ошибку «NullPointerException»\n" +
                    "2. Смоделировать ошибку «ArrayIndexOutOfBoundsException»\n" +
                    "3. Смоделировать кастомную ошибку\n" +
                    "0. Выход ");

            String option = scanner.nextLine();

            if (!isOptionValid(option)) isProgramWorks = false;

            switch(option) {
                case "1":
                    generateNullPointerException();
                    break;
                case "2":
                    generateArrayIndexOutOfBoundsException();
                    break;
                case "3":
                    generateCustomException();
                    break;
                case "4":
                default:
                    isProgramWorks = false;
                    break;

            }
            isProgramWorks = false;
        }
    }
}
