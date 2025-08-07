import java.util.*;

class College {
    static int collegeCode = 1000;
    static int regAssigner = 001;
    String collegeName;
    int code;
    int noofDept;

    College(String collegeName, int noofDept) {
        code = collegeCode++;
        this.collegeName = collegeName;
        this.noofDept = noofDept;
    }
}

//    void Display(){
//        System.out.println("College Code : "+code);
//        System.out.println("College Name : "+collegeName);
//        System.out.println("No of Department : "+noofDept);
//        System.out.println();
//    }
class Students extends College{
        String student_name;
        static int std_reg=7200;
        int reg;

        Students(String student_name,String college_Name,int noofDept){
            super(college_Name,noofDept);
            reg=std_reg++;
            this.student_name=student_name;
        }

        void Show(){
            System.out.println("Student Name : "+student_name);
            System.out.println("Student Register : "+std_reg);
            System.out.println("College Code : "+code);
            System.out.println("College Name : "+collegeName);
            System.out.println("No of Department : "+noofDept);
            System.out.println();

        }

    }
    class  Department extends Students{
        String dept;
        Department(String dept, String college_name, int noofDept){
            super(college_name, dept, noofDept);
            this.Show();
        }
    }


public class inherit {
    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Students students= new Students("Sudharsan","Hicet",15);
        Students students1= new Students("Suhaib","Hicet",20);
        Students students2= new Students("Prag","Hit",99);
        Students student3 = new Department("Revi", "Hicet", 20);
        students.Show();
        students1.Show();
        students2.Show();
        student3.Show();


    }
}
