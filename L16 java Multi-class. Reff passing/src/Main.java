public class Main{
    public static void main(String[]args)
    {
        Student s1 = new Student("Bob",11);
        Student s2 = new Student("Carol",33);
        Course c1 = new Course ("CSE111", "Object Oriented Programming.");
        Course c2 = new Course ("MAT222", "Engineering Mathematics.");
        System.out.println(c1.code);
        System.out.println(c1.title);
        System.out.println(c2.code);
        System.out.println(c2.title);
    }
}