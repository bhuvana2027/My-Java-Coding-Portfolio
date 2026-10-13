//Program to Show Usage of Static keyword in Class
package Tasks;
class Student {

    static String college = "Kits";
    static String location = "Kakinada";

    void display() {

        System.out.println("college= "+college);
        System.out.println("Location= "+location);
    }
}

public class Q16 {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.print("student1:");
        s1.display();
        
        System.out.println();

        System.out.print("student2 :");
        s2.display();
    }
}
