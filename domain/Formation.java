package domain;

public class Formation  {
    private String name;

    //constructor
    public Formation(String name)
    {
        this.name = name;
    }

    public Formation() {

    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Formation{" +
                "name='" + name + '\'' +
                '}';
    }
}
