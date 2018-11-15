package chapter3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class WorkingWithDatesAndTime {
	public static void main(String[] args) {
		// ---Creating Dates and Times---
		System.out.println("---Creating Dates and Times---");
		System.out.println("Local Date: " + LocalDate.now());
		System.out.println("Local Time: " + LocalTime.now());
		System.out.println("Locate Date Time: " + LocalDateTime.now());
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);	// easier to read
		LocalDate date2 = LocalDate.of(2015, 1, 20);				// works; however, harder to read internationally
		System.out.println("date1: " + date1);
		System.out.println("date2 " + date2);
		LocalTime time1 = LocalTime.of(6, 15);			// time1: hour minute
		LocalTime time2 = LocalTime.of(6, 15, 30);		// time2: hour minute second
		LocalTime time3 = LocalTime.of(6, 15, 30, 200);	// time3: hour minute second nano
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println("dateTime1: " + dateTime1);
		System.out.println("dateTime2: " + dateTime2);
		
		// ---Manipulating Dates and Times---
		System.out.println("\n---Manipulating Dates and Times---");
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);	// date(2014,1,22)
		System.out.println("date: " + date);
		date = date.plusDays(2);								// date(2014,1,22)
		System.out.println("date: " + date);
		date = date.plusWeeks(1);								// date(2014,1,29)
		System.out.println("date: " + date);
		date = date.plusMonths(1);								// date(2014,2,28)
		System.out.println("date: " + date);
		date = date.plusYears(1);								// date(2015,2,28)
		System.out.println("date: " + date);
		
		date = LocalDate.of(2020, Month.JANUARY, 20);			// date(2020,1,20)
		LocalTime time = LocalTime.of(5, 15);					// time(5:15)
		LocalDateTime dateTime = LocalDateTime.of(date, time);	// dateTime(2020,1,20T5:15)
		System.out.println("dateTime: " + dateTime);
		dateTime = dateTime.minusDays(1);						// dateTime(2020,1,19T5:15)
		System.out.println("dateTime: " + dateTime);
		dateTime = dateTime.minusHours(10);						// dateTime(2020,1,18T19:15)
		System.out.println("dateTime: " + dateTime);
		dateTime = dateTime = dateTime.minusSeconds(30);		// dateTime(2020,1,18T19:14:30)
		System.out.println("dateTime: " + dateTime);
		
		// -Period Class-
		System.out.println("-Period Class-");
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1);
		performAnimalEnrichment(start, end, period);
		
		// -Formatting Dates and Times-
		System.out.println("-Formatting Date and Times-");
		date = LocalDate.of(2020,  Month.JANUARY, 20);
		System.out.println("date Day of Week: " + date.getDayOfWeek());
		System.out.println("date Month: " + date.getMonth());
		System.out.println("date Year: " + date.getYear());
		System.out.println("date Day of Year: " + date.getDayOfYear());
		
		date = LocalDate.of(2020, Month.JANUARY, 20);
		time = LocalTime.of(11, 12, 34);
		dateTime = LocalDateTime.of(date, time);
		
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println("shortF format: " + shortF.format(dateTime));
		System.out.println("mediumF format: " + mediumF.format(dateTime));
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println("dateTime custom format: " + dateTime.format(f));
		
		// ---Parsing Dates and Times---
		System.out.println("---Parsing Dates and Times---");
		f = DateTimeFormatter.ofPattern("MM dd yyyy");
		date = LocalDate.parse("01 02 2015", f);
		time = LocalTime.parse("11:22");
		System.out.println(date);
		System.out.println(time);
	}
	
	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period);
		}
	}
}
