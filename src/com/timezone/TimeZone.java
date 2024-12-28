package com.timezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {
	public static void main(String[] args) {

		// LocalDateTime ldt = LocalDateTime.now();
		// System.out.println(ldt);
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		ZoneId us=ZoneId.of("America/Chicago");
		//System.out.println(us);
		System.out.println(zdt.withZoneSameInstant(us));
	}

}
