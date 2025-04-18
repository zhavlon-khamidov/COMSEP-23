package kg.alatoo.firstproject;


import java.util.ArrayList;

class Student{
    String name, surname;
    int id;
    double gpa;
    String addres;
}

class StudentCourse{
    int studentId;
    String courseName;
    int midGrade, finalGrade, totalGrade;

}



public class Project {

    public static void main(String[] args) {

        Student s = new Student(1, 'aa', 'bbb');

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<StudentCourse> studentCourses = new ArrayList<>();
        StudentCourse sc = new StudentCourse(1, 'PL2', 85, 70);
        students.add(s);
        studentCourses.add(sc);
        studentCourses.add(new StudentCourse(1, 'Calculus', 90, 70));


    }


}
