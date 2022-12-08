import java.util.Arrays;

public class program {
    public static void main(String[] args) {
        int numbA = -15;
        int numbB = 5;
        String msg = "Hello World! ";
        int year = 2024;
        int[] arr = {1, 0, 1, 0, 1, 0};
        int[] nums = new int[100];
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        System.out.println(checkMethod(numbA, numbB));  // первая
//        checkNumb(numbA); // вторая
//        System.out.println(checkNumBool(numbA)); // третья
//        printMessage(msg, numbB); // четвёртая
//        System.out.println(checkYear(year)); // пятая
//        System.out.println(Arrays.toString(replaceArray(arr))); // шестая
//        System.out.println(Arrays.toString(fillArray(nums))); // седьмая
//        System.out.println(Arrays.toString(doubleArray(arr2))); // восьмая
    }

    public static boolean checkMethod(int numbA, int numbB) {  // Первая задача - решена.
        return numbA + numbB >= 10 && numbA + numbB <= 20;
    }

    public static void checkNumb(int numbA) {                 // Вторая задача - решена.
        if (numbA > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkNumBool(int numbA) {           // Третья задача - решена.
        return numbA < 0;
    }

    public static void printMessage(String msg, int numbB) {  // Четвёртая задача - решена.
        for (int i = 0; i < numbB; i++) {
            System.out.println(msg);
        }
    }

    public static boolean checkYear(int year) {               // Пятая задача - не решена(постоянно False).
        return year % 100 != 0 & year % 4 == 0 & year % 400 == 0;
    }

    public static int[] replaceArray(int[] arr) {               // Шестая задача - решена.
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            }
            else  {
                arr[i] = 1;
            }
        }
        return arr;
    }

    public static int[] fillArray(int[] arr) {                  // Седьмая задача - решена.
        for (int i = 0; i <= arr.length - 1; i++) {
            int element = i+1;
            arr[i] = element;
        }
        return arr;
    }

    public static int [] doubleArray(int[] arr) {              // Восьмая задача - решена.
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            else {
                continue;
            }
        }
        return arr;
    }
}
