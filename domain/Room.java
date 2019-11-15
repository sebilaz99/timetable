package domain;
import java.util.ArrayList;
import java.util.Objects;

public class Room  {
    private String code;
    private String building;
    //private ArrayList<Activity> activityList= new ArrayList<Activity>();

    //constructor
    public Room(String code, String building) //ArrayList<Activity> activityList)
    {
        this.code=code;
        this.building=building;
        //this.activityList=activityList;
    }

    public Room(String name) {
    }

    public Room() {

    }


    //getters and setters
    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getBuilding()
    {
        return building;
    }

    public void setBuilding(String building)
    {
        this.building = building;
    }

    /*public ArrayList<Activity> getActivityList()
    {
        return activityList;
    }

    public void setActivityList(ArrayList<Activity> activityList)
    {
        this.activityList = activityList;
    }*/

    @Override
    public String toString()
    {
        return "Room{" +
                "code='" + code + '\'' +
                ", building='" + building + '\'' /*+
                ", activityList=" + activityList +
                '}'*/;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(code, room.code) &&
                Objects.equals(building, room.building);
                //Objects.equals(activityList, room.activityList);
    }
}
