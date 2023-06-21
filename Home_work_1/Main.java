package Exeption_Lessons.Home_work_1;

import java.net.SocketPermission;
import javax.print.DocFlavor.STRING;


//  Задание 1
//  Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
// public class Main {
//     public static void main(String[] args) throws Exception {

//         //System.out.println(divByZyero(6,0));
//         //System.out.println(outsideArr(3));
//         //System.out.println(positiveNum(-1));
//     }

//     public static int divByZyero(int a, int b) {
//         if (b == 0) {
//             throw new ArithmeticException("Деление на 0!");
//         }else return a / b;
//     };

//      public static int outsideArr (int num) { 
//         int[] arr = {1,2,3};
//         if (num > arr.length - 1) {
//             throw new ArrayIndexOutOfBoundsException("Выход за пределы массива!");
//         }else return arr[num];
//      }

//      public static String positiveNum (int num) { 
//         if (num < 0){
//             throw new IllegalArgumentException("Отрицательное значение!");
//         }else return "Значение пушка!";
//      }



//  Задание 2
//  Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

 private static int sum2d (String[][]arr){ //может выбросить NullPointerException: Cannot read the array length because "arr" is null
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {// Может быть выход за пределы массива - ArrayIndexOutOfBoundsException
                    int val = Integer.parseInt(arr[i][j]);//Массив типа String, поэтому элементы могут быть буквами или символами, тогда метод parseInt выбросит NumberFormatException
                    sum += val;
                }
            }
            return sum;
        }
    };
