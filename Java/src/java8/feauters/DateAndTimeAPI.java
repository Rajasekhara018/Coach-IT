package java8.feauters;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeAPI
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		LocalTime time =LocalTime.now();
		/*int h=time.getHour();
		int s=time.getSecond();
		int m=time.getMinute();
		int n=time.getNano();
		System.out.print(h);*/
		//System.out.println(date);
		//System.out.print(time);
		LocalDateTime dt = LocalDateTime.now();
		System.out.print(dt);
		
		

	}

}
