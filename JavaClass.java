class Student {
    static int regNo = 1;
    String name;
    String dept;
    String age;
    String gender;

    Student(String n, String d, String a, String g) {
        name = n;
        dept = d;
        age = a;
        gender = g;

        System.out.println("Reg No: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        regNo++;
    }
}

public class JavaClass {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", "CSE", "20", "Male");
        Student s2 = new Student("Ayesha", "ECE", "21", "Female");
    }
}
