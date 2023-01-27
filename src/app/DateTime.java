package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatterBuilder.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 =  LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-01-22");
		LocalDateTime d05 = LocalDateTime.parse("2023-01-22T12:45:52");
		Instant d06 = Instant.parse("2023-01-22T12:45:52Z");
		Instant d07 = Instant.parse("2023-01-22T12:45:52-03:00");
		
		LocalDate d08 = LocalDate.parse("25/01/2023",fmt1);
		LocalDateTime d09 = LocalDateTime.parse("25/01/2023 11:46",fmt2);
		
		LocalDate d10 = LocalDate.of(2023, 01, 25);
		LocalDateTime d11 = LocalDateTime.of(2023, 01, 25, 11, 57);
		
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		System.out.println(d10);
		System.out.println(d11);
	}

}
