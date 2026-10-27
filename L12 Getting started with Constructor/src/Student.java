public class Student {

    public String name;
    public int id;

    public Student(String name, int id)
    {
        System.out.println("I was called.");
        this.name = name;
        this.id = id;
    }
    public void standUp()
    {
        System.out.println(name+" is now standing");
    }

    public void showDetail()
    {
        System.out.println(name+" "+id);
    }

}

