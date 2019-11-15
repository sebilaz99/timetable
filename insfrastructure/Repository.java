package insfrastructure;

import java.util.ArrayList;

public class Repository<Type>
{
    private ArrayList<Type> entities = new ArrayList<Type>();

    public void add(Type entity)
    {
        this.entities.add(entity);
    }

    public ArrayList<Type> showAll()
    {
        return this.entities;
    }

    public Type getByIndex(int index)
    {
        return this.entities.get(index);
    }

    public void delete(int index)
    {
        this.entities.remove(index);
    }

    public void update(Type neww, int index)
    {
        this.entities.set(index,neww);
    }
}
