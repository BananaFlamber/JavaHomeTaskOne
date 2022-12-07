public class program {
    public static void main(String[] args) {
        int numbA = -15;
        int numbB = 5;
        String msg = "Hello World! ";
        int year = 2024;
        int[] arr = {1, 0, 1, 0, 1, 0};
//        System.out.println(checkMethod(numbA, numbB));
//        checkNumb(numbA);
//        System.out.println(checkNumBool(numbA));
//        printMessage(msg, numbB);
//        System.out.println(checkYear(year)); пятая
//        System.out.println(replaceArray(arr));
    }
        public static boolean checkMethod ( int numbA, int numbB){  // Первая задача - решена.
            return numbA + numbB >= 10 && numbA + numbB <= 20;
        }

        public static void checkNumb ( int numbA){                 // Вторая задача - решена.
            if (numbA > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }

        public static boolean checkNumBool ( int numbA){           // Третья задача - решена.
            return numbA < 0;
        }

        public static void printMessage (String msg,int numbB){  // Четвёртая задача - решена.
            for (int i = 0; i < numbB; i++) {
                System.out.println(msg);
            }
        }

        public static boolean checkYear ( int year){               // Пятая задача - не решена(постоянно False).
            return year % 100 != 0 && year % 4 == 0 && year % 400 == 0;
        }

        public static int[] replaceArray ( int[] arr){               // Шестая задача - не решена(принтует абракадабру).
            System.out.println(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else ;
                {
                    arr[i] = 1;
                }
            }
            return arr;
        }
    }
