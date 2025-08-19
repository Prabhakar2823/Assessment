public class casting {
    public static void main(String[] args) {
        int a = 9;
        double b = 4.0;

        double sum = a + b;
        double div = (a / b);
        boolean greater = a >(int) b;
        boolean divisible = a % 3 == 0 && b > 2.5;
        System.out.println("(double) a + b =" + sum);
        System.out.println("a / b = " + div);
        System.out.println("a > (int)b ? " + greater);
        System.out.println("a % 3 and b > 2.5 ? " + divisible);
    }
}
