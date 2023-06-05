import java.time.LocalDate;                //time class 
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ch15_p4 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
}