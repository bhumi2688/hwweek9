package methodoverriding24;

// Test class to create object and call the methods
public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI rate of Interest: " +s.getRateofInterest());
        System.out.println("ICICI rate of Interest: " +i.getRateofInterest());
        System.out.println("AXIS rate if Interest: " +a.getRateofInterest());
    }
}
