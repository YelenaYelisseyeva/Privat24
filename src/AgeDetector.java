public class AgeDetector{

    public static void main(String []args) {
        // Task 1
        int num = 18;
        if (num <= 0) {
            System.out.println("wrong age");
        } else if (num > 18) {
            System.out.println("you have become an adult");
        } else {
            System.out.println("underage");
        }
        // Task 2

        float a = 15;
        float b = 4;

        if (a % b == 0) {
            System.out.println("division without remainder " + a % b);
        } else {
            System.out.println("division with remainder " + a / b);
        }

        // Task 3
        
        double years = 2;
        double salary = 1000;

        if (years > 1 && years <= 3) {
            salary = salary * 1.1;
        } else if (years > 3) {
            salary = salary * 1.2;
        } else {
            System.out.println("incorrect initial data");
        }

        if (salary < 4000) {
            salary = salary + 1000;
        } else {
            salary = salary + 500;
        }

        System.out.println(salary);
    }
}