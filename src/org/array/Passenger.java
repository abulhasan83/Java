package org.array;

public class Passenger implements Airport{
	
@Override
public void flightId(int id) {
	System.out.println("The flight id is:" + id);
}

@Override
	public void flightName(String name) {
		System.out.println("The flight name is:"+ name);
		
	}
       @Override
    	public void airportId(int id) {
    		System.out.println("The airport id is:"+ id);
    		
    	}
       @Override
    	public void airportName(String name) {
           System.out.println("The airport name is:"+ name);
    		
    	}
       public static void main(String[] args) {
		Passenger p = new Passenger();
		p.airportId(11);
		p.airportName("Fly Emirates");
		p.flightId(12);
		p.flightName("Air canada");
	}

}
