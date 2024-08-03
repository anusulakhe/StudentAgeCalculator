package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date of birth (yyyy-MM-dd): ");
        String dateString = scanner.nextLine();
        LocalDate dobdate = parseDate(dateString);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StdConfig.class);
        StdAgeCalculator ageCalculator = context.getBean(StdAgeCalculator.class);
        int age = ageCalculator.calculateage(dobdate);
        System.out.println("Calculated Age: " + age);
    }
    private static LocalDate parseDate(String dateString) {
        try {
            return LocalDate.parse(dateString);
        } catch (DateTimeParseException e) {
            return null;
        }
    }
}