import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String studentName = input.nextLine();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter average mark: ");
        double averageMark = input.nextDouble();

        System.out.print("Enter gender initial: ");
        char genderInitial = input.next().charAt(0);

        System.out.print("Scholarship status (true/false): ");
        boolean scholarshipStatus = input.nextBoolean();

        System.out.println("\nStudent Information");
        System.out.println("-------------------");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Average Mark: " + averageMark);
        System.out.println("Gender Initial: " + genderInitial);
        System.out.println("Scholarship Status: " + scholarshipStatus);

        input.close();
    }
}
