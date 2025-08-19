public class program_1 {
    public static void main(String[] args) {
        String  StudentName = "jordan";
        int age = 20;
        float weight = 55.8f;
        char Grade = 'A';
        boolean HasClearedFee = true;
        short Score = 92;
        byte level = 3;
        char Gender = 'M';


        System.out.println("StudentName =" + StudentName);
        System.out.println("age =" + age);
        System.out.println("weight =" + weight);
        System.out.println("Grade =" + Grade);
        System.out.println("HasClearedFee =" + HasClearedFee);
        System.out.println("Score =" +Score);
        System.out.println("level =" + level);
        System.out.println("Gender =" + Gender);

        if(age >= 18) {
            System.out.println("done");
            if (HasClearedFee) {
                System.out.println("cleared");
            } else {
                System.out.println("not cleared");
            }
        }
    }
}
