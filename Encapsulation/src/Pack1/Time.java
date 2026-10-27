package Pack1;

public class Time {

    private int hour;
    private int min;
    private int sec;

    //Getter method
    public int getHour()
    {
    return this.hour;
    }

    // Setter method

    public void setHour(int h)
    {
        if (h >= 0 && h <= 23)
        {
            this.hour = h;
        }
        else
        {
            System.out.println("Invalid value : setting to 0");
            this.hour = 0;
        }
    }


    //Constructor
    public Time(int hour, int min, int sec)
    {
        if(hour >=0 && hour <= 23)
        {
            this.hour = hour;
        }
        else
        {
            System.out.println("Invalid value : setting to the value 0");
            this.hour = 0;
        }

        //this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    //Method
    public void displayTime()
    {
        System.out.println("Time = " +this.hour +" : "+this.min +" : "+this.sec);
    }

    public void displayTime(int diffHr)
    {
        int value = this.hour + diffHr;
        if(value >23)
        {
            int actual_value = value%24;
            System.out.println("USA Time = "+(actual_value) " : "+this.min+" : "+this.sec);
        }
        else {
            System.out.println("USA Time = " + (this.hour + diffHr) + " : " + this.min + " : " + this.sec);
        }
    }
}
