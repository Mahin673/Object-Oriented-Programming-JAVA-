public class Main{

    public static void main(String[]args)
    {
        Car c1 = new Car();
        Car c2 = new Car("BMW", "M4");
        Car c3 = new Car("Audi", "R8", 2025);
        Car c4 = new Car("TOYOTA", "PREMIO");
        c1.details();
        c2.details();
        c3.details();
        c4.details();
    }
}