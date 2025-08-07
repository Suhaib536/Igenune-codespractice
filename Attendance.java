import java.util.Scanner;

abstract class Person {
    private String name;
    private int id;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() { 
        return name; 
    }
    public int getId() { 
        return id; 
    }

    public abstract void showDetails();
}

/*----------------------------------------EMPLOYEE CLASS------------------------------------------ */

class Employee extends Person {
    private String department;
    static int employeeCount = 0;

    public Employee(String department, String name, int id){
        super(name, id);
        this.department = department;
        employeeCount++;
    }

    public String getDepartment(){
        return department;
    }

    // Overrides the abstract method to display employee details
    public void showDetails(){
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Department: " + getDepartment());
    }

    // Static method to show total number of employees created
    public static void showEmployeeCount(){
        System.out.println("Total Employees: " + employeeCount);
    }
}

/*----------------------------------------MARKABLE------------------------------------------ */


interface Markable {
    void markAttendance(int[] attendanceArray);
    int calculatePresentDays(int[] attendanceArray);
}

/*----------------------------------------ATTENDANCE CLASS------------------------------------------ */


class AttendanceEmployee extends Employee implements Markable {

    private int[] attendanceArray = new int[7]; // Stores attendance for 7 days

    public AttendanceEmployee(String department, String name, int id){
        super(department, name, id);
    }

    public void markAttendance(int[] inputArray) {
        if (inputArray.length == 7) {// Check if input array is for 7 days
            for (int i = 0; i < 7; i++) {
                this.attendanceArray[i] = inputArray[i];//if true it will store
            }
        } else {
            System.out.println("Error");//or else error
        }
    }

    // Implements method to count how many days the employee was present
    public int calculatePresentDays(int[] attendanceArray) {
        int presentDays = 0;
        for (int day : attendanceArray) {
            if (day == 1) presentDays++; //if it is one then it will count.....0 means it will avoid it
        }
        return presentDays;
    }

    public void displayAttendance() { //this will displays 7 day attendance and total present days
        System.out.print("Attendance (7 days): ");
        for (int day : attendanceArray) {
            System.out.print(day + " ");
        }
        System.out.println("\nTotal Present Days: " + calculatePresentDays(attendanceArray));
    }
}

/*----------------------------------------MAIN CLASS------------------------------------------ */

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// used scanner object to get input

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        AttendanceEmployee[] employees = new AttendanceEmployee[n];// Array to store AttendanceEmployee objects

        for (int i = 0; i < n; i++) {
            System.out.println(" Enter details for Employee ");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            AttendanceEmployee emp = new AttendanceEmployee(dept, name, id);

            int[] attendance = new int[7];// Read attendance for 7 days
            System.out.println("Enter attendance for 7");
            for (int j = 0; j < 7; j++) {
                attendance[j] = sc.nextInt();
            }
            sc.nextLine();

            // Mark and display attendance and details
            emp.markAttendance(attendance);
            emp.showDetails();
            emp.displayAttendance();

            // Store employee in array
            employees[i] = emp;
        }
        Employee.showEmployeeCount();// Display total number of employees created

        sc.close();
    }
}
