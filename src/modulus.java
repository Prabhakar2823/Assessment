public class modulus {
    public static void main(String[] args) {

        double x = 22.7;
        int y = 4;
        int result_1 = (int)x % y;
        double result_2 = x + (double)y;
        boolean result_3 = (int)x == y * 5;
        boolean result_4 = x > 20 && y < 10;

        System.out.println("(int)x % y =" + result_1);
        System.out.println("x + (double)y =" + result_2);
        System.out.println("(int)x == y * 5 =" + result_3);
        System.out.println("x > 20 && y 10 = " + result_4);
    }
}
