public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(); //object or instance
        Student s2 = new Student();

        s1.name = "Mahin";
        s1.id = "731";

        s2.name = "Shahin";
        s2.id = "951";

        s1.showDetail();
        System.out.println("=========");
        s2.showDetail();

        s1.standup();
        System.out.println("=========");
        s2.standup();

    }
}