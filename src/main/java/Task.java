import utils.DataCheck;
import utils.RandomArray;

import java.util.Arrays;
import java.util.Scanner;

public class Task {

    public static final int REQUIRED_NUMBER = 7;
    public static final String REQUIRED_NAME = "Вячеслав";
    public static final int MULTIPLE_NUMBER = 3;
    public static final int MENU_CHECK_NUMBER1 = 1;
    public static final int MENU_CHECK_NUMBER2 = 2;
    public static final int MENU_CHECK_NUMBER3= 3;
    public static final int MENU_CHECK_NUMBER4 = 4; 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int lengthArray = 0;
        int minGeneratedRange = 0;
        int maxGeneratedRange = 0;

        do {
            do {
                System.out.println("------------Главное меню------------\n" +
                        "Задание №1 - Проверить вводимое целое число - введите цифру 1 \n" +
                        "Задание №2 - Проверить вводимое имя - введите цифру 2 \n" +
                        "Задание №3 - Вывести элементы массива кратные 3 - введите цифру 3 \n" +
                        "Для выхода из программы введите цифру 4 \n" +
                        "_________________________________________________________________");
                System.out.println("Выберите номер задания, которое хотите выполнить:");
                try{
                    choice = Integer.valueOf(scanner.next().trim());
                }
                catch (NumberFormatException e) {
                    System.out.println("Введенные данные должны быть целым числом");
                }
                if (choice < 1 || choice > 4) {
                    System.out.println("Вы ввели некорректное значение\n");
                }
            } while (choice < MENU_CHECK_NUMBER1 || choice > MENU_CHECK_NUMBER4);
            switch (choice) {
                case MENU_CHECK_NUMBER1:
                    System.out.println("Введите целое число:");
                    DataCheck.checkEnteredNumber(scanner, REQUIRED_NUMBER);
                    break;
                case MENU_CHECK_NUMBER2:
                    System.out.println("Введите имя:");
                    DataCheck.checkEnteredName(scanner, REQUIRED_NAME);
                    break;
                case MENU_CHECK_NUMBER3:
                    System.out.println("Введите размерность массива");
                    try{
                        lengthArray = Integer.valueOf(scanner.next().trim());
                        System.out.println("Введите минимальное значения диапазона значений для заполнения массива");
                        minGeneratedRange = Integer.valueOf(scanner.next().trim());
                        System.out.println("Введите максимальное значение диапазона значений для заполнения массива");
                        maxGeneratedRange = Integer.valueOf(scanner.next().trim());
                    } catch (NumberFormatException e) {
                        System.out.println("Введенные данные должны быть целым числом");
                    }
                    int [] generatedArray = RandomArray.getGeneratedArray(
                            lengthArray, minGeneratedRange, maxGeneratedRange);
                    System.out.println("Сгенерированный массив:" +
                            Arrays.toString(generatedArray));
                    System.out.println(String.format("Элементы сгенерированного массива кратные %d:",
                            MULTIPLE_NUMBER));
                    RandomArray.getMultipleElement(generatedArray, MULTIPLE_NUMBER);
                    break;
                case MENU_CHECK_NUMBER4:
                    System.out.println("Вы вышли из системы \n");
                    break;
            }
        } while (choice != MENU_CHECK_NUMBER4);
        scanner.close();
    }
}
