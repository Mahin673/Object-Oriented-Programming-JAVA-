public class Main {

    public static void main(String[] args) {

        // Create first FitnessCenter object
        FitnessCenter center1 = new FitnessCenter(
                "ActiveFit",
                "2021-04-10",
                true,
                100,
                90.0
        );

        // Create second FitnessCenter object
        FitnessCenter center2 = new FitnessCenter(
                "PowerGym",
                "10-08-2023",
                false,
                350,
                150.0
        );


        center1.calculateMonthlyRevenue("September");

    }
}