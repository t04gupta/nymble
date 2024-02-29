import java.util.ArrayList;
import java.util.List;

public class Destinations {
    String destinationName;
    List<Activity> activityList;

    Destinations(String destinationName){
        this.destinationName = destinationName;
        this.activityList = new ArrayList<Activity>();
    }

    //working
    public void addActivity(Activity activity){
        if(activityList.contains(activity)){
            System.out.println("Activity already exists at this destination");
        }
        else{
            activityList.add(activity);
            System.out.println("Successfully added activity " + activity.activityName);
        }  
    }
}
