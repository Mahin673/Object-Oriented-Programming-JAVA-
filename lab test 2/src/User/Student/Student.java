package User.Student;

import User.Teacher.Teacher;

public class Student {
    public int s_id;
    public String s_name;
    public Teacher advisor;

    public Student(int s_id, String s_name, Teacher advisor) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.advisor = advisor;
    }

    public void Display_information() {
        System.out.println("Student ID: " + s_id);
        System.out.println("Student Name: " + s_name);
        if (advisor != null) {
            System.out.println("Advisor Name: " + advisor.t_name);
            System.out.println("Advisor Designation: " + advisor.getDesignation());
        }
    }
}