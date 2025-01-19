package pharmacy;
import java.time.LocalDate;


public class main {
    public static void main(String[] args) {
    medicine med1 = new medicine("Paracetamol", "MED001", 50, 100, LocalDate.of(2023, 12, 31));
        medicine med2 =new medicine("Ibuprofen", "MED002", 75, 50, LocalDate.of(2024, 1, 15));

    
        // Check expiry status
        med1.checkExpiry();
        med2.checkExpiry();

        // Print details
        System.out.println(med1);
        System.out.println();
        System.out.println(med2);
    }
}
