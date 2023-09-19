public class Flight
{
	private int flightNumber;
	
    private FlightCrew    theCrew;
    private Aircraft      thePlane;
    private FlightPlan    flightPlan;
    private PassengerList thePassengers;
    
    public Flight()                  
    {
        flightNumber = 0;
		theCrew       = new FlightCrew();
        thePlane      = new Aircraft();
		flightPlan    = new FlightPlan();
		thePassengers = new PassengerList();
    }
    
    public Flight(int f, FlightCrew crew, Aircraft plane, FlightPlan plan, PassengerList pList)
    {
        flightNumber = f;
		theCrew       = crew;
        thePlane      = plane;
		flightPlan    = plan;
		thePassengers = pList;
    }

    public String toString()
    { 
        return "Flight: " + flightNumber + "\n" +
                theCrew.toString()       + "\n" +
                thePlane.toString()      + "\n" +
                flightPlan.toString()    + "\n" +
                thePassengers.toString();
    }
}

