public class Student {
    public String name;
    public int id;

    public Student (String nm, int i)
    {
        name = nm;
        id = i;
    }

    public void makeCall(Student obj){
        System.out.println("I am "+name);
        System.out.println("hey,"+obj.name);
        System.out.println("Sir is calling you.");
    }
    public void showDetail(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
