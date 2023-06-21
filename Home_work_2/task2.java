package Exeption_Lessons.Home_work_2;

// Задание 2 
// Если необходимо, исправьте данный код

public class task2 {
    public static void main(String[] args) {

        int d = 1;
        double catchedRes1 = 0;
        boolean flag = true;
        int[] intArray = {1,2,3,4,5,6,7,8};
        try {
            catchedRes1 = intArray[7] / d ;
        } catch (IndexOutOfBoundsException e) {
            flag = false;
            System.err.println("Индекс не корректный");
        } catch (ArithmeticException e) {
            flag = false;
            System.out.println("Catching exception: " + e);
        }
        if (flag) System.out.println("catchedRes1 = " + catchedRes1);


        
    }

}
