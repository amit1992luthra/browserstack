package selenium1;

import org.testng.annotations.Test;

public class dependsonmethodexample {
	
	@Test
	public void ticketbooking()
	{
		System.out.println("ticket booking tests case");
	}
	
	@Test(dependsOnMethods = "ticketbooking")
	public void CheckReservationStatus()
	{
		System.out.println("Checking reservation Status");
	}
	
}
