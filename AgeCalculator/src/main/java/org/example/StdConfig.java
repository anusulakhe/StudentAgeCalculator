package org.example;

import java.time.LocalDate;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import java.time.LocalDate;

    public class StdConfig {
        @Bean
        public StdAgeCalculator stdAgeCalculator(LocalDate stdDob) {
            return new StdAgeCalculator(stdDob);
        }

        @Bean
        public LocalDate stdDob() {
            // Define the date of birth (example date)
            return LocalDate.of(2022, 8, 9); // Example date
        }
    }

