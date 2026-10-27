public class Main{
    public static void main(String[] args) {

        Student s1 = new Student("Bob", 11);
        Student s2 = new Student("Carol",33 );


        s1.setID (55);
        s2.setName ("Mahin");
        //s1.showDetail();
        System.out.println(s1.getID());
        System.out.println(s2.getName());
    }
}