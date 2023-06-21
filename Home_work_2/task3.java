package Exeption_Lessons.Home_work_2;

import java.io.FileNotFoundException;

public class task3 {

    // Дан следующий код, исправьте его там, где требуется

    // public static void main(String[] args) throws Exception {
    // try {
    // int a = 90;
    // int b = 3;
    // System.out.println(a / b);
    // printSum(23, 234);
    // int[] abc = { 1, 2 };
    // abc[3] = 9;
    // } catch (Throwable ex) {
    // System.out.println("Что-то пошло не так...");
    // } catch (NullPointerException ex) {
    // System.out.println("Указатель не может указывать на null!");
    // } catch (IndexOutOfBoundsException ex) {
    // System.out.println("Массив выходит за пределы своего размера!");
    // }
    // }
    // public static void printSum(Integer a, Integer b) throws
    // FileNotFoundException {
    // System.out.println(a + b);
    // }

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException e) {
            System.err.println("Деление на 0 " + e);
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b){
        try{
        System.out.println(a + b);
        }catch (NullPointerException e){
            System.out.println("Входные параметры не могут быть пустыми");
        }
    
    }

}
