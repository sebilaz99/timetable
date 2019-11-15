package domain;

import java.util.Objects;

public class Activity  {
    private String type;

    //constructor
    public Activity(String type)
    {
        this.type=type;
    }

    public Activity() {
    }

    //getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "type='" + type + '\'' +
                '}';
    }
}
