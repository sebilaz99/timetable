package domain;

public class RoomActivity
{
    private Room room;
    private Activity activity;

    public RoomActivity(Room room, Activity activity)
    {
        this.room = room;
        this.activity = activity;
    }

    public int getId()
    {
        return Integer.parseInt(room.getCode() +activity.getType());
    }

    public Room getRoom() {return room;}
    public Activity getActivity() {return activity;}

    @Override
    public String toString() {
        return "RoomActivity{" +
                "room=" + room +
                ", activity=" + activity +
                '}';
    }
}
