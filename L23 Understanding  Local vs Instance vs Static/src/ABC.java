public class ABC {

    public int temp;
    public static int x = 4;

    public ABC (int val)
    {
        temp = val;
    }

    public void method1()
    {
        int temp = 5;   //local variable
        int x = 6;      //local variable
        System.out.println(temp);       //local variable
        System.out.println(x);          //local
        System.out.println(this.temp);  //instance
        System.out.println(ABC.x);      //static
        System.out.println("========");

    }
}
