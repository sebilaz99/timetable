package insfrastructure;

import java.util.ArrayList;

import domain.Discipline;

public class DisciplineRepository
{
    private ArrayList<Discipline> disciplineList = new ArrayList<Discipline>();

    //methods
    public int findDiscipline(Discipline d)
    { for(int index=0; index<this.disciplineList.size(); index++)
        {
            if(this.disciplineList.get(index).getName().equals(d.getName()))
                return index;
        }
        return -1;
    }

    public boolean add(Discipline d)
    {
        if(this.findDiscipline(d) == -1)
        {
            this.disciplineList.add(d);
            return true;
        }
        return false;
    }

    public ArrayList<Discipline> getAll()
    {
        return disciplineList;
    }

    public boolean delete(Discipline d)
    {
        int index = this.findDiscipline(d);
        if(index != -1)
        {
            this.disciplineList.remove(index);
            return true;
        }
        return false;
    }

    public boolean update(Discipline old, Discipline neww)
    {
        int index = this.findDiscipline(old);
        if(index!=-1)
        {
            this.disciplineList.set(index, neww);
            return true;
        }
        return false;
    }
}
