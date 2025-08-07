class Department {
    private String dep;

    public Department(String dep) {
        this.dep = dep;
    }
    public String getDep(){
        return dep;
    }
    public void showDep() {
        System.out.println("Department: " + dep);
    }
}

class Student {
    private String name;
    private String id;
    private Department[] departments;

    public Student(String name, String id, Department[] departments) {
        this.name = name;
        this.id = id;
        this.departments = departments;
    }

    public void showStd() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        for (Department d : departments) {
            d.showDep();
        }
    }
}

public class studentda {
    public static void main(String[] args) {
        Department d1 = new Department("CSE");
        Department d2 = new Department("IT");
        Department[] deps1 = {d1};
        Department[] deps2 = {d2};

        Student s1 = new Student("Suhaib", "12", deps1);
        Student s2 = new Student("Rayan", "13", deps2);
        s1.showStd();
        s2.showStd();
    }
}
