package OOPs;

public class Constructorrs {
    public static void main(String[] args) {
        student s1 = new student("Surya");
        // System.out.println(s1.name); 
        // student s2 = new student(25);
        // System.out.println(s2.roll); 
        // student s3= new student();
        // System.out.println(s3); 
        s1.name = "Surya";
        s1.roll = 112;
        s1.password = "abcde";

        student s2 = new student(s1);
        s2.password = "XYZ";

    }
}


class student {
    String name;
    int roll;
    String password;
  
    //Copy Constructors
    student(student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }

    student(String name) {
        this.name = name;     // parameterized constructor
    }

     student() {
        System.out.println("Constructor called....");     // Non-parameterized constructor
    }

        student(int roll) {
        this.roll = roll;     // parameterized constructor
    }
}