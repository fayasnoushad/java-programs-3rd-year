import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    String name, rollNo;

    void readDetails() {
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class Result extends Student {
    int[] marks = new int[5];
    int total = 0;
    double average;
    char grade;

    void readMarks() {
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        average = total / 5.0;
    }

    void calculateGrade() {
        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 50) grade = 'D';
        else grade = 'F';
    }

    void displayResult() {
        displayDetails();
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Result r = new Result();
        r.readDetails();
        r.readMarks();
        r.calculateGrade();
        r.displayResult();
    }
}