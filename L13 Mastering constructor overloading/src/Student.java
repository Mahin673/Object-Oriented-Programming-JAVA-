public class Student {

    public String name;
    public int id;
    public double cgpa;

    public Student()
    {
        System.out.println("No parameter I was called");
    }
    public Student(String name, int id)
    {
        System.out.println("2 parameter I was called.");
        this.name = name;
        this.id = id;
    }
    public Student(String name, int id,double cgpa)
    {
        System.out.println("3 parameter I was called.");
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    public void standUp()  //instance method
    {
        System.out.println(name+" is now standing");
    }

    public void showDetail()  //instance method
    {
        System.out.println(name+" "+id+" "+cgpa);
    }

}

