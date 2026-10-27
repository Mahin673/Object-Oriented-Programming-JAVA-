public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Mahin";
        s1.id = "731";
        s2.name = "Shahin";
        s2.id = "700";

        s1.standUp();
        s2.seatDown();
        s1.showDetails();
        System.out.println("===========");
        s2.showDetails();
    }
}