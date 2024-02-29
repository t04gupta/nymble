import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    
    String name;
    int passengerCapacity;
    List<Destinations> itinerary;
    List<Passenger> passengerList;

    TravelPackage(String name, int passengerCapacity){
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<Destinations>();
        this.passengerList = new ArrayList<Passenger>();
    }

    //working
    public void printItinerary(){
        System.out.println("Travel package name is " + name);
        for(Destinations destination : itinerary){
            System.out.println(destination.destinationName);
            System.out.println("Activities available at "+ destination.destinationName + " are");
            for(Activity activity : destination.activityList){
                System.out.println(activity.activityName + " : " + activity.activityDescription + " at cost " + activity.activityCost + " and capacity " + activity.activityCapacity);
            }
        }
    }

    //working
    public void printPassengerList(){
        System.out.println("Travel package name is " + name);
        System.out.println("Passenger capacity is " + passengerCapacity);
        System.out.println("Passengers currently enrolled are " + passengerList.size());
        for(Passenger passenger : passengerList){
            System.out.println("Passenger name is " + passenger.passengerName + " and their number is " + passenger.passengerNumber);
        }
    }

    //this function needs parameter because each passenger can only be identified by their unique passenger number
    //working
    public void printIndividualPassengerDetails(int passengerNumber){
        for(Passenger passenger : passengerList){
            if(passenger.passengerNumber == passengerNumber){
                System.out.println("Passenger name is " + passenger.passengerName);
                System.out.println("Passenger number is " + passenger.passengerNumber);
                System.out.println("Passenger balance is " + passenger.balance);
                System.out.println("Activities are ");
                for(Activity activity : passenger.participatingActivities){
                    System.out.println(activity.activityName);
                    System.out.println(activity.activityDestination.destinationName);
                    if(passenger.passengerType.equalsIgnoreCase("Premium")){
                        System.out.println("Price paid is 0");
                    }
                    else if(passenger.passengerType.equalsIgnoreCase("Gold")){
                        System.out.println("Price paid is " + (activity.activityCost*0.9));
                    }
                    else{
                        System.out.println("Price paid is " + activity.activityCost);
                    }

                }
            }
        }
    }

    //working
    public void printAvailableActivities(){
        for(Destinations destination : itinerary){
            for(Activity activity : destination.activityList){
                if(activity.activityCapacity - activity.participatingPassengers.size()>0){
                    System.out.println("Activity name is " + activity.activityName);
                    System.out.println("Activity description is " + activity.activityDescription);
                    System.out.println("Activity cost is " + activity.activityCost);
                    System.out.println("Spots available are " + (activity.activityCapacity - activity.participatingPassengers.size()));
                }
            }
        }
    }

    //working
    public void addDestinationToItinerary(Destinations destination){
        if(itinerary.contains(destination)){
            System.out.println("Destination already exists");
        }
        else{
            itinerary.add(destination);
            System.out.println("Successfully added destination");
        }
    }

    //working
    public void addPassengerToPassengerList(Passenger passenger){
        if(passengerList.size()+1>passengerCapacity){
            System.out.println("Package is already at capacity");
        }
        else{
            boolean passengerExists = false;
            for(Passenger iterPassenger : passengerList){
                if(iterPassenger.passengerNumber == passenger.passengerNumber){
                    System.out.println("Passenger is already in the list");
                    passengerExists = true;
                }
            }
            if(passengerExists == false){
                passengerList.add(passenger);
                System.out.println("Successfully added passenger");
            }
        }
    }
}
