class student {
    String name;
    int age;
    float marks;

    public void displayInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
    }

    student(String name, int age, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}
//Driver code
public class infoOfStudent {
    public static void main(String[] args) {
        student std1 = new student("Nandkishor Jadhav", 23, 87.90f);
        std1.displayInfo();
        System.out.println(std1.marks);
    }
}
