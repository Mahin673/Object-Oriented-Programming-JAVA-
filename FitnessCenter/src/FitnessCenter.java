public class FitnessCenter {

    String centerName;
    String establishmentDate;
    boolean hasCertifiedTrainers;
    int totalMembers;
    double dailyCharge;
    int numberOfBranches;
    String[] recentlyOpenedBranches;


    FitnessCenter(String centerName, String establishmentDate,
                  boolean hasCertifiedTrainers, int totalMembers,
                  double dailyCharge) {

        this.centerName = centerName;
        this.establishmentDate = establishmentDate;
        this.hasCertifiedTrainers = hasCertifiedTrainers;
        this.totalMembers = totalMembers;
        this.dailyCharge = dailyCharge;


        this.numberOfBranches = 0;


        this.recentlyOpenedBranches = new String[5];
    }

    void calculateMonthlyRevenue(String months)
    {


           String[]month ={"January","February","March",
                   "April","May","June","July","August",
                   "September","October","November","December"};

           int[] daysInMonth = { 31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31};

        int days =0;

        boolean found = false;

        for(int i=0; i<months.length(); i++)
        {
            if (months.equalsIgnoreCase(month[i]))
            {
                days = daysInMonth[i];
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Month: " + months);
            System.out.println("Days: " + days);
        } else {
            System.out.println("Invalid month name!");
        }

        double monthlyRevenue =
                totalMembers * dailyCharge * days;

        System.out.println("Fitness Center: " + centerName);
        System.out.println("Month: " + months);
        System.out.println("Monthly Revenue: " + monthlyRevenue);
        System.out.println("--------------------------------");
        System.out.println("The revenue was calculated as:");
        System.out.println("100 × 90 × 30 = 270000 BDT");
    }
}