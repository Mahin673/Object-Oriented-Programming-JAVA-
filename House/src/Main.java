public class Main {
    public static void main(String[]args)
    {
        House h1 = new House();
        h1.window = 6;
        h1.door = 2;

        House h2 = new House();
        h2.window = 4;
        h2.door = 3;

        System.out.println("h1 =========");
        h1.view();
        System.out.println("h2============");
        h2.view();
    }

}