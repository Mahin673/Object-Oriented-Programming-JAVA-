public class Main{
    public static void main(String []args)
    {
        System.out.println("Total student: "+Student.count);

        Student s1 = new Student ("Bob",11);
        Student s2 = new Student ("Carol",33);
        Student s3 = new Student ("David",55);

        s1.showDetail();
        s2.showDetail();
        s3.showDetail();

        System.out.println("Total student: "+Student.count);
    }
}