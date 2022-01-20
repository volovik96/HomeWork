
    public class homeWork2 {

        public static void main(String[] args) {

            System.out.println(summer(4, 16));
            System.out.println("------------------------");
            System.out.println(positiveNegativeNumber(0));
            System.out.println("------------------------");
            System.out.println(signNumber(-5));
            System.out.println("------------------------");
            stringNumber("Hello,master", 3);
            System.out.println("------------------------");
            System.out.println(leapYear(240));

        }

        public static boolean summer(int a, int b ) {
            return (a + b) >= 10 && (a + b) <= 20;
        }

        public static String positiveNegativeNumber(int a) {
            if (a >= 0) {
                return "Positive number";
            }
            else {
                return "Negative number";
            }
        }

        public static boolean signNumber(int a) {
            return a < 0;
        }

        public static void stringNumber(String abc, int sign) {

            for (int i = 1; i <= sign; i++) {
                System.out.println(abc);
            }

        }

        public static boolean leapYear(int b) {

            if (b % 4 == 0 || b % 400 == 0) {
                return true;
            } else if (b % 100 == 0) {
                return false;
            } else {
                return false;
            }
        }



    }

