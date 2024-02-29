public class Main {
    public static void main(String[] args){
        Destinations destination1 = new Destinations("India");
        Destinations destination2 = new Destinations("Sri Lanka");
        Destinations destination3 = new Destinations("Nepal");

        Activity activity1 = new Activity("Sightseeing", "Exploring the country", 10000, 3, destination1);
        destination1.addActivity(activity1);

        Activity activity2 = new Activity("Boating", "Exploring the sea", 5000, 6, destination2);
        destination2.addActivity(activity2);

        Activity activity3 = new Activity("Trekking", "Exploring the mountains", 50000, 2, destination3);
        destination3.addActivity(activity3);

        Passenger passenger1 = new Passenger("Tushar", 1, "Premium", 500000.0);
        Passenger passenger2 = new Passenger("Shikhar", 2, "Premium", 100000.0);
        Passenger passenger3 = new Passenger("Shivangi", 3, "Gold", 150000.0);
        Passenger passenger4 = new Passenger("Naman", 4, "Standard", 200000.0);

        passenger1.signUpForActivity(activity1, destination1);
        activity1.participatingPassengers.add(passenger1);

        passenger1.signUpForActivity(activity2, destination2);
        activity2.participatingPassengers.add(passenger1);

        passenger1.signUpForActivity(activity3, destination3);
        activity3.participatingPassengers.add(passenger1);
       
        passenger2.signUpForActivity(activity1, destination1);
        activity1.participatingPassengers.add(passenger2);

        passenger2.signUpForActivity(activity2, destination2);
        activity2.participatingPassengers.add(passenger2);
        
        passenger3.signUpForActivity(activity2, destination2);
        activity2.participatingPassengers.add(passenger3);

        passenger3.signUpForActivity(activity3, destination3);
        activity3.participatingPassengers.add(passenger3);
        
        passenger4.signUpForActivity(activity1, destination1);
        activity1.participatingPassengers.add(passenger4);


        passenger4.signUpForActivity(activity3, destination3);
        activity3.participatingPassengers.add(passenger4);

        TravelPackage holidayTour = new TravelPackage("Holiday Tour", 4);
        
        holidayTour.addDestinationToItinerary(destination1);
        holidayTour.addDestinationToItinerary(destination2);
        holidayTour.addDestinationToItinerary(destination3);

        holidayTour.addPassengerToPassengerList(passenger1);
        holidayTour.addPassengerToPassengerList(passenger2);
        holidayTour.addPassengerToPassengerList(passenger3);
        holidayTour.addPassengerToPassengerList(passenger4);
        
        
        holidayTour.printItinerary();
        holidayTour.printPassengerList();
        holidayTour.printAvailableActivities();
        holidayTour.printIndividualPassengerDetails(1);
        passenger4.getParticipatingActivities();

        
    }
}
