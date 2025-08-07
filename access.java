public class access {
    int instanceVar = 10;
    static int staticVar = 20;

    public void display() {
        int localVar = 30;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public final void main(String[] args) {
        access obj = new access();
        obj.display();
        System.out.println("Accessing Instance " + obj.instanceVar);
        System.out.println("Accessing Static  " + staticVar);
    }
}
