package domain;

import java.util.Objects;


public class Teacher {
    private String name;
    private String rank;

    //constructor
    public Teacher(String name, String rank)
    {
        this.name=name;
        this.rank=rank;
    }

    public Teacher() {

    }

    //getters and setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
