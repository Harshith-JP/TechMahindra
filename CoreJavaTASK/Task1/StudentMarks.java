import java.util.*;

public class Student {
    String name;
    int mark1;
    int mark2;
    int mark3;
    int mark4;
    int mark5;
    int totMarks;
    double avgMarks;

    public Student(String name, int mark1, int mark2, int mark3, int mark4, int mark5) {
        super();
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;

        this.totMarks = mark1 + mark2 + mark3 + mark4 + mark5;
        this.avgMarks = totMarks / 5.0;
    }

    public int getTotalMarks() {
        return totMarks;
    }

    double getAvgMarks() {
        return avgMarks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", totMarks=" + totMarks + ", avgMarks=" + avgMarks + "]";
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, Student> studentmap = new TreeMap<>();
        System.out.print("Enter the number of students: ");
        int numOFStu = s.nextInt();

        for (int i = 0; i < numOFStu; i++) {
            s.nextLine(); 
            System.out.print("Enter student name: ");
            String name = s.next();
            System.out.print("Enter marks for 5 subjects: ");
            int mark1 = s.nextInt();
            int mark2 = s.nextInt();
            int mark3 = s.nextInt();
            int mark4 = s.nextInt();
            int mark5 = s.nextInt();

            Student student = new Student(name, mark1, mark2, mark3, mark4, mark5);
            studentmap.put(name, student);
        }

        
        System.out.println("\nStudent details:");
        for (Map.Entry<String, Student> entry : studentmap.entrySet()) {
            System.out.println(entry.getValue());
        }

        s.close();
    }
}
