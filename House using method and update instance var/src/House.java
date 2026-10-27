public class House {
    public int window;
    public int door;


    public void increaseDoor(int dr)
    {
        door = door + dr;
    }


    public void view()
    {
        System.out.println(window+" Windows");
        System.out.println(door+" Doors");
    }

}
