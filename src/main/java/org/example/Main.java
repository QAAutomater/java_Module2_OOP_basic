package org.example;

// This is our main class
public class Main {
    public static void main(String[] args) {
        // Creating object of Student class using constructor
        Student student1 = new Student("Alice", 20, "CS101");

        // Accessing public method
        student1.displayInfo();

        // Accessing static method
        Student.printCollegeName();

        // Modifying non-static member using setter
        student1.setAge(21);

        // Accessing private member via public method
        System.out.println("Updated Age: " + student1.getAge());
    }
}

// Student class demonstrating all the required concepts
class Student {

    // --- Access Modifiers ---

    public String name;       // Public: accessible everywhere
    private int age;          // Private: accessible only inside this class
    protected String rollNo;  // Protected: accessible in same package or subclasses
    String department;        // Default: accessible within the package only

    // --- Static Member ---
    static String collegeName = "OpenAI Institute";

    // --- Constructor ---
    public Student(String name, int age, String rollNo) {
        // Using 'this' keyword to distinguish class members from parameters
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // --- Non-static Method (Instance Method) ---
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("College: " + collegeName);
    }

    // --- Static Method ---
    public static void printCollegeName() {
        System.out.println("College Name: " + collegeName);
    }

    // --- Method with Return Type ---
    public int getAge() {
        return age;
    }

    // --- Method with Parameter and 'this' keyword ---
    public void setAge(int age) {
        this.age = age;  // 'this' refers to current object's age
    }
}
