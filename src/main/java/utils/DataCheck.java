package utils;

import java.util.Scanner;

public class DataCheck {
    
    public static void checkEnteredNumber(Scanner scanner, int requiredNumber) {
        int getNumber = 0;
            try {
                getNumber = Integer.valueOf(scanner.next().trim());
                if (getNumber == requiredNumber) {
                    System.out.println("Привет");
                } else {
                    System.out.println("Введенное целое число не соответствует требуемому");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введенные данные должны быть целым числом");
            }
        }

    public static void checkEnteredName(Scanner scanner, String requiredName) {
        String getName = scanner.next();
        if (getName.equalsIgnoreCase(requiredName)) {
            System.out.println("Привет, " + getName + "\n");
        } else {
            System.out.println("Нет такого имени\n");
        }
    }
}
