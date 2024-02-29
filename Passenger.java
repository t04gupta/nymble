import java.util.ArrayList;
import java.util.List;

public class Passenger {
    String passengerName;
    int passengerNumber;
    String passengerType;
    double balance;
    List<Activity> participatingActivities;

    Passenger(String passengerName, int passengerNumber, String passengerType, double balance){
        this.passengerName = passengerName;
        this.passengerNumber = passengerNumber;
        this.passengerType = passengerType;
        this.balance = balance;
        this.participatingActivities = new ArrayList<Activity>();
    }

    //working
    public void signUpForActivity(Activity activity, Destinations destination){
        //check if activity is at capacity
        if(activity.participatingPassengers.size()+1>activity.activityCapacity){
            System.out.println("This activity is already at it's max capacity");
        }
        else{
            //check if the activity exists at that destination
            boolean activityExists = false;
            for(Activity iter : destination.activityList){
                if(iter.activityName.equalsIgnoreCase(activity.activityName)){
                    activityExists = true;
                }
            }
            if(activityExists == false){
                System.out.println("This activity does not exist at the specified destination");
            }
            else{
                if(passengerType.equalsIgnoreCase("Premium")){
                    //all activities are free for premium passengers
                    System.out.println(passengerName + " has successfully signed up for activity " + activity.activityName);
                }
                else if(passengerType.equalsIgnoreCase("Gold")){
                    //10 percent discount for gold passenger
                    double cost = activity.activityCost*0.9;
                    if(balance<cost){
                        System.out.println(passengerName + " cannot sign up due to insufficient balance");
                    }
                    balance = balance - cost;
                    System.out.println(passengerName + " has successfully signed up for activity " + activity.activityName);
                }
                else if(passengerType.equalsIgnoreCase("Standard")){
                    //standard price for standard passengers
                    if(balance<activity.activityCost){
                        System.out.println(passengerName + " cannot sign up due to insufficient balance");
                    }
                    balance = balance - activity.activityCost;
                    System.out.println(passengerName + " has successfully signed up for activity " + activity.activityName);
                }
                participatingActivities.add(activity);
            }
        }       
    }

    //working
    public void getParticipatingActivities(){
        
        if(participatingActivities.size()==0){
            System.out.println(passengerName + " has not signed up for any activites yet");
        }
        else{
            System.out.println(passengerName + " is participating in the following activities");
            for(Activity activity : participatingActivities){
                System.out.println(activity.activityName);
            }
        }
    }

}
    

