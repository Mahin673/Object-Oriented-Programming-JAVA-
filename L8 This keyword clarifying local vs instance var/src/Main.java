public class Main {
    public static void main(String[]args)
    {
        Cat c1 = new Cat();
        c1.color = "White";

        Cat c2 = new Cat();
        c2.color = "Purple";

        System.out.println("c1======");
        c1.details();

        System.out.println("c2========");
        c2.details();

        c1.changeAction("Jumping");
        System.out.println("c1 ========");
        c1.details();
    }
}