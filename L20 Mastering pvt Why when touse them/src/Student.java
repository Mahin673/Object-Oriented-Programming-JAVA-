public class Student {
    private String name;
    private int id;

    public Student(String nm, int i)
    {
        name = nm;
        id = i;
    }

    private double calculateCGPA()
    {
       return 4.0;
    }
    public void showDetail()
    {
        double cg = calculateCGPA();
        System.out.println("Name: "+name);
        System.out.println("ID  : "+id);
        System.out.println("CGPA: "+cg);
    }

}