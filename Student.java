public class Student {
    
    private String name;
    private int age;
    private String subject;
    private double height; 
    private double gpa;

    public Student(String studentName, int studentAge, String favSubject, double heightInCm, double studentGpa) {
        name = studentName;
        age = studentAge;
        subject = favSubject;
        height = heightInCm;
        gpa = studentGpa;
    }

    public void printStudentInfo() { // prints all of the student's information
        System.out.println("Student's name: " + name);
        System.out.println("Student's age: " + age);
        System.out.println("Student's favorite subject: " + subject);
        System.out.println("Student's height: " + height + " cm");
        System.out.println("Student's gpa: " + gpa);
    }

    public void printIntroduce() { //prints the student's name and their favorite subject
        System.out.println("Hello! My name is " + name + " and I'm " + age + " years old. \n" + "My favorite subject in school is " + subject + ".");
    }

    public void printTall() { //prints whether or not the stundent is tall based on their height
        System.out.print("I am " + height + " cm tall, so I am ");
        if(height < 182.88) {
            System.out.println("not that tall.");
        } else {
            System.out.println("really tall!");
        }
    }

    public void printGoodGrades() { // prints whether or not the student has good grades
        System.out.print("My GPA is " + gpa + ", so my grades are ");
        if(gpa < 2.7) {
            System.out.println("not as good as they can be. I need to try a little harder. \n");
        } else {
            System.out.println("great! Hard work pays off! \n");
        }
    }
}