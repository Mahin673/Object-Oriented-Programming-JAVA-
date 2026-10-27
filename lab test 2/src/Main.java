import User.Teacher.Teacher;
import User.Student.Student;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(101, "Rakib Hasan",
                "Assistant Professor", "CSE");
        Teacher t2 = new Teacher(102, "Shumon Ahmed",
                "Professor", "CSE");

        Student s1 = new Student(24215113, "Akib", t1);
        s1.Display_information();
    }
}