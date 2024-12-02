package org.miu.lesson3.problem3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EventsPlanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            System.out.println("Enter your event name:");
            String eventName=sc.nextLine().trim();
            System.out.println("Please, enter the event date in the format-(yyyy-MM-dd) - Example 1989-04-14");
            LocalDate eventDate=LocalDate.parse(sc.nextLine());

           if(!eventDate.isAfter(LocalDate.now())) throw new IllegalArgumentException("Event date should be in the future");

            System.out.println("Enter event time (HH:mm):");
            LocalTime eventTime = LocalTime.parse(sc.nextLine().trim());

            LocalDateTime eventDateTime=LocalDateTime.of(eventDate,eventTime);
            System.out.println("The event takes place on "+eventDateTime.getDayOfWeek());
            String leap=eventDate.isLeapYear()?"Event date is a leap year":"Event date is not a leap year";
            System.out.println(leap);
            long daysToEvent = ChronoUnit.DAYS.between(LocalDate.now(), eventDate);
            System.out.println(String.format("%d days to event!", daysToEvent));
            //int daysToEvent=Period.between(LocalDate.now(),eventDate).getDays(); //2025-01-01 wrong
            //System.out.println(String.format("%d day(s) to event!",daysToEvent));

            formatEventDetails(eventDateTime);
            System.out.println("Which time zone would you like to display in? e.g America/Chicago, Europe/Paris, etc");
            String zone=sc.next().trim();
            displayEventInTimeZone(eventDateTime,zone);
        } catch (Exception e) {
            throw new RuntimeException("Invalid date or time");
        }
        sc.close();
        
    }
    public static void formatEventDetails(LocalDateTime ldt){
        ZonedDateTime zonedDateTime=ZonedDateTime.of(ldt,ZoneId.systemDefault());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy @ HH:mm VV");
        System.out.println(zonedDateTime.format(formatter));
    }

    public static void displayEventInTimeZone(LocalDateTime eventDate, String zone){
        try {
        ZonedDateTime currentEventTimeZone=ZonedDateTime.of(eventDate,ZoneId.systemDefault());
        ZonedDateTime selectedZoneOfCurrent=currentEventTimeZone.withZoneSameInstant(ZoneId.of(zone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy @ HH:mm [VV]");
        System.out.println(selectedZoneOfCurrent.format(formatter));
        } catch (DateTimeException e) {
            System.out.println("Invalid time zone specified.");
        }
    }
}
