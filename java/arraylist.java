import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student(name:'" + name + "', age:" + age + ", grade:'" + grade + "')";
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.println("Enter age of student " + (i + 1) + ":");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter grade of student " + (i + 1) + ":");
            String grade = scanner.nextLine();

            students.add(new Student(name, age, grade));
        }

        for (Student student : students) {
            System.out.println(student);
        }

        
    }
}
