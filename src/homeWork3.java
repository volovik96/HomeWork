public class homeWork3 {
    public static void main(String[] args) {
        System.out.println("Пункт 1 :");
        int[] myArrayInt = {1, 0, 1, 1, 0, 0, 1};
        array(myArrayInt);
        invert(myArrayInt);
        array1(myArrayInt);
        System.out.println("-------------------");
        System.out.println("Пункт 2 :");
        int[] array100 = new int[100];
        array2(array100);
        System.out.println("-------------------");
        System.out.println("Пункт 3 :");
        int[] arrayMultiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        array3(arrayMultiplication);
        array4(arrayMultiplication);
        System.out.println("-------------------");
        System.out.println("Пункт 4 :");
        int[][] squareArray = new int[5][5];
        array5(squareArray);
        array6(squareArray);
        System.out.println("-------------------");
        System.out.println("Пункт 5 :");
        int[] lineArray1 = array7(10, 187);
        array8(lineArray1);
        System.out.println("-------------------");
        System.out.println("Пункт 6 :");
        array3(arrayMultiplication);
        System.out.println("Min:" + "\t" + minArray(arrayMultiplication));
        System.out.println("Max:" + "\t" + maxArray(arrayMultiplication));


    }


    public static void array(int[] myArrayInt) {
        System.out.print("Было :" + "\t");
        for (int i = 0; i < myArrayInt.length; i++) {
            System.out.print(myArrayInt[i] + "\t");
        }
        System.out.println();
    }


    public static void invert(int[] myArrayInt) {

        for (int i = 0; i < myArrayInt.length; i++)
            if (myArrayInt[i] == 0) {
                myArrayInt[i] = 1;
            } else {
                myArrayInt[i] = 0;
            }
    }


    public static void array1(int[] myArrayInt) {
        System.out.print("Стало :" + "\t");
        for (int i = 0; i < myArrayInt.length; i++) {
            System.out.print(myArrayInt[i] + "\t");
        }
        System.out.println();
    }

    public static void array2(int[] array100) {

        for (int i = 0; i < array100.length; i++) {
            array100[i] = i + 1;
            System.out.print(array100[i] + "\t");
        }
        System.out.println();
    }


    public static void array3(int[] arrayMultiplication) {
        System.out.print("Было :" + "\t");
        for (int i = 0; i < arrayMultiplication.length; i++) {
            System.out.print(arrayMultiplication[i] + "\t");
        }
        System.out.println();
    }

    public static void array4(int[] arrayMultiplication) {
        System.out.print("Стало :" + "\t");
        for (int i = 0; i < arrayMultiplication.length; i++) {
            if (arrayMultiplication[i] < 6) {
                arrayMultiplication[i] *= 2;
            }
            System.out.print(arrayMultiplication[i] + "\t");
        }
        System.out.println();

    }

    public static void array5(int[][] squareArray) {
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                squareArray[i][(squareArray.length - 1) - i] = 1;
                if (squareArray[i] == squareArray[j]) {
                    squareArray[i][j] = 1;
                }
            }
        }
    }

    public static void array6(int[][] squareArray) {
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] array7(int len, int initialValue) {
        int[] lineArray = new int[len];

        for (int i = 0; i < lineArray.length; i++) {
            lineArray[i] = initialValue;
        }
        return lineArray;

    }

    public static void array8(int[] lineArray) {
        for (int i = 0; i < lineArray.length; i++) {
            System.out.print(lineArray[i] + "\t");
        }
        System.out.println();
    }

    private static int minArray(int[] arrayMultiplication) {
        int min = arrayMultiplication[0];
        for (int i = 0; i < arrayMultiplication.length; i++) {
              if (arrayMultiplication[i] < min) {
                 min = arrayMultiplication[i];
            }
        }
          return min;
    }

    private static int maxArray(int[] arrayMultiplication) {
        int max = arrayMultiplication[0];
        for (int i = 0; i < arrayMultiplication.length; i++) {
            if (arrayMultiplication[i] > max) {
                max = arrayMultiplication[i];
            }
        }
            return max;
    }
}