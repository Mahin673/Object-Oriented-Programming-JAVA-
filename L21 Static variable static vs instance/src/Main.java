public class Main{

    public static void main(String []args){

        System.out.println("Start Team run: "+Player.teamRun);

        Player sakib = new Player();
        Player tamim = new Player();

        tamim.hit_four();
        sakib.hit_six();

        System.out.println("Sakib run: "+sakib.run);
        System.out.println("Tamim run: "+tamim.run);
        System.out.println("Team run: "+Player.teamRun);
    }
}