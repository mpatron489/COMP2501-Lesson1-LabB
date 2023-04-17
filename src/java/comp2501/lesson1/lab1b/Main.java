package comp2501.lesson1.lab1b;


public class Main {
    public static void main(String[] args) {

        Student studentA = new Student(new Name("Tiger", "Woods"), "A00123456", new Date(1975, 12, 30), true);
        Student studentB = new Student(new Name("Bill", "Gates"), "A00987654", new Date(1955, 10, 28), false);
        System.out.println(studentA.getStudentName().getFullName()+ " (" + studentA.getStudentName().getInitials() + ") " + "(" + "st # " + studentA.getStudentNumber() + ") was born on " + studentA.getBirthDate().getYyMmDd() + ". " + studentA.isGraduated());
        System.out.println(studentB.getStudentName().getFullName()+ " (" + studentB.getStudentName().getInitials() + ") " + "(" + "st # " + studentB.getStudentNumber() + ") was born on " + studentB.getBirthDate().getYyMmDd() + ". " + studentB.isGraduated());
    }
}