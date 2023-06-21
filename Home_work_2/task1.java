package Exeption_Lessons.Home_work_2;

import java.util.InputMismatchException;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class task1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        inputNumber();
    }

    public static void inputNumber() {
        float num = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Введите дробное число: ");
                num = input.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Введено не число!");
                input.nextLine();
            }
            System.out.println(num);
        }
    }
}
