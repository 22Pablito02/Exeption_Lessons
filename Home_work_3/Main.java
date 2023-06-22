package Exeption_Lessons.Home_work_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

// волков павел борисович 22.02.2000 88005553535 m

public class Main {

    private static Scanner input = new Scanner(System.in, "Cp866");

    public static void main(String[] args) {
        boolean flag = false;
        while (!flag) {
            String[] psd = getPersonData();
            writeFile(String.join(" ", getFIO(psd), getBirthday(psd), getPhoneNumber(psd), getGender(psd)));
            System.out.println("Хотите сделать еще одну записать?\n1 - ДА\n2 - НЕТ");
            int check = input.nextInt();
            if (check == 2){
                flag = true;
            }
            input.nextLine();
        }

        // System.out.println(getFIO(psd));
        // System.out.println(getBirthday(psd));
        // System.out.println(getPhoneNumber(psd));
        // System.out.println(getGender(psd));
    }

    public static String[] getPersonData() {
        String[] personData = new String[0];
        boolean inputCorrect = false;
        while (!inputCorrect) {
            System.out.println(
                    "Введите следующие данные через пробел,\n'Фамилия Имя Отчество, дата рождения, номер телефона, пол'\n Формат дыты рождения: dd.mm.yyyy\n");
            personData = input.nextLine().split(" ");
            if (personData.length > 6 || personData.length < 6) {
                System.err.println("Количество введеных элементов не соответствуют нужному! \nПопробуйте еще раз!\n");
                input.nextLine();
            } else
                inputCorrect = true;
        }
        return personData;
    }

    public static String getFIO(String[] data) {
        for (int i = 0; i <= 2; i++) {
            data[i] = data[i].substring(0, 1).toUpperCase() + data[i].substring(1);
        }
        String FIO = String.join(" ", Arrays.copyOfRange(data, 0, 3));
        if (!FIO.matches("[а-яА-Я ]+")) {
            throw new IllegalArgumentException("Некоректно введеное ФИО!");
        } else
            return FIO;

    }

    public static String getBirthday(String[] data) {
        String Birthday = data[3];
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);

        try {
            dateFormat.parse(Birthday);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Дата не является валидной!");
        }
        return Birthday;
    }

    public static String getPhoneNumber(String[] data) {

        String number = data[4];
        if (!number.matches("[0-9]+") || number.length() > 11 || number.length() < 11) {
            throw new IllegalArgumentException("Неверно введен номер телефона!");
        } else
            return number;

    }

    public static String getGender(String[] date) {

        String sex = date[5].toUpperCase();
        if (!sex.equals("M") && !sex.equals("F")) {
            throw new IllegalArgumentException("Неверно указан пол!");
        } else
            return sex;

    }

    public static void writeFile(String res) {
        String fileName = res.substring(0, res.indexOf(' ')) + ".txt";

        try {
            FileWriter fileWriter = new FileWriter(fileName, true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(res);
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("\nСтрока успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
