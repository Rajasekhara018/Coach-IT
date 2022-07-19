package exception.handlings;

public class InvalidLogin  extends RuntimeException
{
	 InvalidLogin(String msg)
	 {
		 super(msg);
	 }
}
