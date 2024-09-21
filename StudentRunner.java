public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("John", 17, "Math", 183.0, 4.0); // creating one instance/object from the Student class
        student1.printStudentInfo(); // calling a method on the object
        student1.printIntroduce();
        student1.printTall();
        student1.printGoodGrades();

        Student student2 = new Student("Tyler", 16, "Comp Sci", 180.34, 5.0);
        student2.printStudentInfo(); 
        student2.printIntroduce();
        student2.printTall();
        student2.printGoodGrades();

        Student student3 = new Student("Jayden", 15, "Lunch", 165.0, 2.0); 
        student3.printStudentInfo(); 
        student3.printIntroduce();
        student3.printTall();
        student3.printGoodGrades();
    }
}