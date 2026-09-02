import java.util.Scanner;

public class lab4_prg1 {
    static class Student {
        int id;
        String name;
        int age;
        String gender;
        String branch;
        String city;
        int year;

        Student() {
            id = 0;
            name = "";
            age = 0;
            gender = "";
            branch = "";
            city = "";
            year = 0;
        }

        void input(Scanner sc) {
            System.out.print("Enter student ID: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter student name: ");
            name = sc.nextLine();

            System.out.print("Enter age: ");
            age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter gender: ");
            gender = sc.nextLine();

            System.out.print("Enter branch: ");
            branch = sc.nextLine();

            System.out.print("Enter city: ");
            city = sc.nextLine();

            System.out.print("Enter year: ");
            year = sc.nextInt();
            sc.nextLine();
        }

        void display() {
            System.out.println("---------------------------");
            System.out.println("Student ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Branch: " + branch);
            System.out.println("City: " + city);
            System.out.println("Year: " + year);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students (max 5): ");
        int n = sc.nextInt();
        sc.nextLine();

        if (n > 5) {
            n = 5;
            System.out.println("Only first 5 students will be recorded.");
        }

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i].input(sc);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}
