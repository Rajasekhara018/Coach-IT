package java8.feauters;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.temporal.ChronoUnit;

public class ZoneAPI {

	public static void main(String[] args)
	{
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");
		ZoneId zone2 = ZoneId.of("Asia/Tokyo");
		LocalDateTime dt=LocalDateTime.now(zone1);
		LocalDateTime dt1=LocalDateTime.now(zone2);
		long Hours =ChronoUnit.HOURS.between(dt, dt1);
		OffsetDateTime off = OffsetDateTime.now(); 
		System.out.print(off);

	}

}
