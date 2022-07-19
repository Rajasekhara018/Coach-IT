package java8.feauters;

import java.time.LocalDate;

public class Period {

	public static void main(String[] args) 
	{
			LocalDate today = LocalDate.now();
			LocalDate birthday = LocalDate.of(2000,04,06);
			Period p = Period.plus(birthday,today);
			System.out.printf("age is %d year %d months %d days",p.getYears(),p.getMonths(),p.getDays());

	}

}
