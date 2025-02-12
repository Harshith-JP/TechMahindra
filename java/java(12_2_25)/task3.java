import java.io.*;

class Employee implements Serializable {
    private int Eno;
    private String Ename;
    private String email; 

    public Employee(int eno, String ename, String email) {
        this.Eno = eno;
        this.Ename = ename;
        this.email = email;
    }

    public int getEno() {
        return Eno;
    }

    public String getEname() {
        return Ename;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Employee [Eno=" + Eno + ", Ename=" + Ename + ", email=" + email + "]";
    }
}

public class task3 {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "John Doe", "john.doe@example.com");

        // Serialize 
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            oos.writeObject(emp);
            System.out.println("Serialization done.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize 
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("Deserialization done.");
            System.out.println("Employee details: Eno=" + deserializedEmp.getEno() + ", Ename=" + deserializedEmp.getEname());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
