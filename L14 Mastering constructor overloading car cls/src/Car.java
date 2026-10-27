public class Car {;

    public String brand;
    public String model;
    public int year;

    public Car()
    {
    }
    
    public Car(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model,int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void details()
    {
        System.out.println(brand+" "+model+" "+year);
    }

}
