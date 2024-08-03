package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;

@Component
public class StdAgeCalculator {

    private int age;
    private LocalDate today;
    private LocalDate stdDob;

    @Autowired
    public StdAgeCalculator(LocalDate stdDob) {
        this.stdDob = stdDob;
    }

    public int calculateage(LocalDate dobDate) {
        today = LocalDate.now();
        age = Period.between(dobDate, today).getYears();
        System.out.println(age);
        return age;
    }
}
