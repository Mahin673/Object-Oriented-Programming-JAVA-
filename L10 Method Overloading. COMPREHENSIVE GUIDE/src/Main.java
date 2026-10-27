public class Main{
    public static void main(String []args)
    {
        Dog d1 = new Dog();
       d1.name = "Rover";
       d1.bark();
       d1.eat("bread" );
       d1.eat("bread",3 );
        d1.eat("bread","& Meat" );
    }
}