import java.util.ArrayList;
import java.util.List;

public class Activity {
    String activityName;
    String activityDescription;
    double activityCost;
    int activityCapacity;
    Destinations activityDestination;
    List<Passenger> participatingPassengers;

    Activity(String activityName, String activityDescription, double activityCost, int activityCapacity, Destinations destination){
        this.activityName = activityName;
        this.activityDescription = activityDescription;
        this.activityCost = activityCost;
        this.activityCapacity = activityCapacity;
        this.activityDestination = destination;
        this.participatingPassengers = new ArrayList<Passenger>();
    }
}
