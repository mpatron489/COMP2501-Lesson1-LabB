package comp2501.lesson1.lab1b;

public class Student {
    private Name studentName;
    private String studentNumber;
    private Date birthDate;
    private boolean graduated;

    public Student (final Name studentName, final String studentNumber, final Date birthDate, final boolean graduated){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.birthDate = birthDate;
        this.graduated = graduated;
}

    public Name getStudentName(){
        return studentName;
    }

    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    public void setGraduated(boolean graduated){
        this.graduated = graduated;
    }
    public String getStudentNumber(){
        return studentNumber;
    }

    public Date getBirthDate(){
        return birthDate;
    }

    public String isGraduated(){
        if (this.graduated == true){
            return "The student has graduated.";
        }
        else {
            return "The student has not graduated.";
        }
    }
}
