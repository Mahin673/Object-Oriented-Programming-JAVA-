public class Main{
    public static void main(String[]args){
        Student s1 = new Student ("Bob", 10);
        Student s2 = new Student ("Carol", 20);

        s1.makeCall(s2);  //pass by reference
      //  System.out.println(s2.name); //carol


//        s1.makeCall(8);  //value
//        s1.showDetail();
//        s2.showDetail();

    }
}