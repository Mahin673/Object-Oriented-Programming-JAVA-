public class Main{
    public static void main(String[] args) {

        Student s1 = new Student("Bob", 11);
        Student s2 = new Student("Carol",33 );

        s1.updateID (0);
        s1.showDetail();
        //s2.showDetail();
    }
}