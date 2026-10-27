public class Student{

    public String name; //instance vari
    public String id; // instance vari

    //access modifier
    public void showDetails()
    {
        System.out.println(name +" "+id);
    }
    public void standUp()
    {
        System.out.println(name+" is now standup");
    }
    public void seatDown()
    {
        System.out.println(name+" is now seatDown");
    }

}