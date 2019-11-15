package domain;

import java.util.Objects;

public class Discipline {
    private String name;

    public Discipline(String name)
    {
        this.name=name;
    }

    public Discipline() {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }



    @Override
    public String toString()
    {
        return "Discipline{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discipline that = (Discipline) o;
        return Objects.equals(name, that.name);
    }

}
