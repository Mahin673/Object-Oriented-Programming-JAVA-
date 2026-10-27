import Pack1.Time;

public class Main {
    public static void main()
    {

        Time t1 = new Time(20,54,32);
        System.out.println(t1.getHour());
        t1.setHour(25);
        t1.displayTime();

        Time t2 = new Time(17,54,12);
        t2.displayTime();
        t2.displayTime(12); //method overloading polymorphysm.


//        System.out.println("T2 time");
//        Time t2 = new Time(27,57,42);
//       // t2.hour =23;
//        t2.displayTime();
//
//        System.out.println("T3 time");
//        Time t3 = new Time(28,48,12);
//        // t2.hour =23;
//        t3.displayTime();
//
    }

}
