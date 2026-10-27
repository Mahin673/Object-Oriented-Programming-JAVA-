package User.Teacher;

public class Teacher {

    private final int teacher_id;

    public String t_name;

    private String designation;

    public String department;


    public Teacher(int teacher_id, String t_name, String designation, String department) {
        this.teacher_id = teacher_id;
        this.t_name = t_name;
        setDesignation(designation);
        this.department = department;
    }


    public int getTeacher_id() {
        return teacher_id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        if (designation != null && (
                designation.equals("Lecturer") ||
                        designation.equals("Assistant Professor") ||
                        designation.equals("Professor"))) {
            this.designation = designation;
        } else {
            System.out.println("Invalid designation! Allowed values: Lecturer, Assistant Professor, Professor.");
        }
    }
}