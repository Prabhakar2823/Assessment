package Assessment;

public class Test_3 {
    public static void main(String[] args) {

        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));//20 5*(10/5 + 5/10)
        int exp2= (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}
