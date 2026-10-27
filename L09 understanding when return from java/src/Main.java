public class Main {

    public static void main(String []args) {

        myCalculator c1 = new myCalculator();
        //case 1
        c1.add(50,20);

        System.out.println("========");

        //case 2
        int ans = c1.add(50,20);
      //  System.out.println(ans);

       // System.out.println("========");

        //case 3
        System.out.println(c1.add(50,20));
        System.out.println("====++====");
        //case 4
        int z = 7+ c1.add(50,20);

    }
}
