package Task2;

public class Employee {
    int empId;
    String empName;
    double empSal;
    int yearsWorked;

    public void setEmpDetails(int empId, String empName, double empSal, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
        this.yearsWorked = yearsWorked;
    }

    public void getEmpDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSal);
        System.out.println("Years Worked: " + yearsWorked);
    }

    public void getLoanEligibility() {
        if (yearsWorked <= 5) {
            System.out.println(empName + " is not eligible for a loan because they have worked for " + yearsWorked + " years.");
        } else {
            if (empSal >= 1500000) {
                System.out.println(empName + " is eligible for a loan of 7 lakhs.");
            } else if (empSal >= 1000000) {
                System.out.println(empName + " is eligible for a loan of 5 lakhs.");
            } else if (empSal >= 600000) {
                System.out.println(empName + " is eligible for a loan of 2 lakhs.");
            } else {
                System.out.println(empName + " is not eligible for a loan due to insufficient salary.");
            }
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpDetails(101, "John Doe", 1200000, 6);
        emp.getEmpDetails();
        emp.getLoanEligibility();
    }
}
