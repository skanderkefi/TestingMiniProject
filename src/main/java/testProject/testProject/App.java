package testProject.testProject;


public class App 
{
    public static void main( String[] args )
    {
    	
    	    	Flight economyFlight = new Flight("1", "Economy");
    	    	Flight businessFlight = new Flight("2", "Business");
    	    	
    	    	Passenger john = new Passenger("john", true);
    	    	Passenger mike = new Passenger("mike", false);
    	    	
    	    	businessFlight.addPassenger(john);
    	    	businessFlight.removePassenger(john);
    	    	businessFlight.addPassenger(mike);
    	    	economyFlight.addPassenger(mike);
    	    	
    	    	System.out.println("business Flight passengers list");
    	    	for (Passenger passenger:businessFlight.getPessengerList()) {
    				System.out.println(passenger.getName());
    			}
    	    	
    	    	System.out.println("eco Flight passengers list");
    	    	for (Passenger passenger:economyFlight.getPessengerList()) {
    				System.out.println(passenger.getName());
    			}
    	    	

    	    
    }
}
