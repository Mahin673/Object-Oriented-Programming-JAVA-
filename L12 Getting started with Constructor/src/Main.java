public class Main{
    public static void main(String[]args) {
        Student s1 = new Student("Bob",11);
        Student s2 = new Student("Carol", 33);
//        s1.name = "Bob";
//        s1.id = 11;
//        s2.name ="Carol";
//        s2.id = 33;
        s1.showDetail();
        s2.showDetail();

    }
}