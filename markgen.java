class Student {
  String name;
  String course;
  int[] marks = new int[3];
  char[] grades = new char[3];

  void calculateGrades() {
    int i = 0;
    while (i < marks.length) {
      if (marks[i] >= 90) grades[i] = 'A';
      else if (marks[i] >= 80) grades[i] = 'B';
      else if (marks[i] >= 70) grades[i] = 'C';
      else if (marks[i] >= 60) grades[i] = 'D';
      else grades[i] = 'F';
      i++;
    }
  }

  void showResult() {
    System.out.println("Name: " + name);
    System.out.println("Course: " + course);

    int total = 0;
    int i = 0;
    while (i < marks.length) {
      System.out.print("Subject ");
      System.out.print(i);
      System.out.println(" Marks: " + marks[i] + ", Grade: " + grades[i]);
      total = Integer.sum(total, marks[i]); 
      i++;
    }

    double average = Math.floorDiv(total, marks.length); 
    System.out.println("Average Marks: " + average);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.name = "Suhaib";
    s.course = "Computer Science";

    s.marks[0] = 85;
    s.marks[1] = 91;
    s.marks[2] = 76;

    s.calculateGrades();
    s.showResult();
  }
}
