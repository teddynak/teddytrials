import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter registration number: ");
        String registrationNumber = input.nextLine();

        System.out.print("Enter mark for subject 1: ");
        int mark1 = input.nextInt();

        System.out.print("Enter mark for subject 2: ");
        int mark2 = input.nextInt();

        System.out.print("Enter mark for subject 3: ");
        int mark3 = input.nextInt();

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        String result;
        if (average >= 50) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        System.out.println("\nStudent Results");
        System.out.println("---------------");
        System.out.println("Name: " + name);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Mark: " + average);
        System.out.println("Result: " + result);

        input.close();
    }
}
