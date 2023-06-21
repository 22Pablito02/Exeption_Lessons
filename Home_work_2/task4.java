package Exeption_Lessons.Home_work_2;

import java.util.Scanner;

public class task4 {

    // Разработайте программу, которая выбросит Exception, когда пользователь вводит
    // пустую строку. Пользователю должно показаться сообщение, что пустые строки
    // вводить нельзя.

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите что-нибудь: ");
        String str = input.nextLine();
        if (str.isEmpty() || str.isBlank()) {
            throw new IllegalArgumentException("Пустые строки вводить нельзя! \nНе красавчик!");
        }else System.out.println("Красавчик!");
    }
}
