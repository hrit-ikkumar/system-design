package single_responsibility.after;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAgeService {
    // Calculate Age of person
    public int calculateAge(Person p) {
        return Period.between(p.getDob(), LocalDate.now()).getYears();
    }
}