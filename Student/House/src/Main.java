 class House
{
    public int window;
    public int door;

    public void increasedoor (int dr)
    {
        door = door + dr;
    }

    public void view()
    {
        System.out.println(window+" Window");
        System.out.println(door+" doors");
    }

}