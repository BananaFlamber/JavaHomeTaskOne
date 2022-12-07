public class program {
    public static void main(String[] args) {
        int numbA = -15;
        int numbB = 5;
//        System.out.println(checkMethod(numbA, numbB));
//        checkNumb(numbA);
    }
    public static boolean checkMethod(int numbA,int numbB) {
        return numbA + numbB >= 10 && numbA + numbB <= 20;
    }
    public static void checkNumb(int numbA) {
        if (numbA > 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

}

