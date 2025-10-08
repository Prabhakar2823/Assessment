package Assessment;

public class ImmutableEmployee {
    public static class Employee{
        private final int id;
        private final String name;
        private final double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "[Employee: id=" + id + ", name=" + name + ", salary=" + salary + "]";
        }
    }
    public  static void main(String[] args) {
        Employee e1 = new Employee(1, "Prabhakar", 25000);
        Employee e2 = new Employee(2, "prabha", 25000);

        System.out.println(e1);
        System.out.println(e2);
    }
}
