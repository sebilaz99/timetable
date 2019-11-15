import domain.*;
import insfrastructure.Repository;

import java.util.ArrayList;

public class Controller
{
    private repository.FileRepository<Activity> activityRepository;
    private repository.FileRepository<Discipline> disciplineRepository;
    private repository.FileRepository<Formation> formationRepository;
    private repository.FileRepository<Room> roomRepository;
    private repository.FileRepository<Teacher> teacherRepository;
    private Repository<Relation> roomActivityRepository;
    private Repository<Relation> activityFormationRepository;
    private Repository<Relation> teacherActivityRepository;

    //constructor
    public Controller()
    {
        Activity activity = new Activity();
        Discipline discipline = new Discipline();
        Formation formation = new Formation();
        Room room = new Room();
        Teacher teacher = new Teacher();

        this.activityRepository = new repository.FileRepository<Activity>(Activity.class,"activity.csv");
        this.disciplineRepository = new repository.FileRepository<Discipline>(Discipline.class,"discipline.csv");
        this.formationRepository = new repository.FileRepository<Formation>(Formation.class,"formation.csv");
        this.roomRepository = new repository.FileRepository<Room>(Room.class,"room.csv");
        this.teacherRepository = new repository.FileRepository<Teacher>(Teacher.class,"teacher.csv");
        this.teacherActivityRepository = new Repository<Relation>();
        this.activityFormationRepository = new Repository<Relation>();
        this.roomActivityRepository = new Repository<Relation>();
    }


    //methods on TEACHER
    public void addTeacher (String teacherName, String teacherRank)
    {
        Teacher teacher = new Teacher(teacherName, teacherRank);
        this.teacherRepository.addEntry(teacher);
    }

    public ArrayList<Teacher> getAllTeacherCtrl()
    {
        return this.teacherRepository.getAllEntries();
    }

    public Teacher getTeacherByIndexCtrl(int index)
    {
        return this.teacherRepository.getByIndex(index);
    }

    public void updateTeacherCtrl(int index, String neww)
    {
        Teacher teacher = this.teacherRepository.getByIndex(index);
        teacher.setName(neww);
        this.teacherRepository.setAtIndex(teacher,index);
    }

    public void deleteTeacherCtrl(int index)
    {
        this.teacherRepository.deleteIndex(index);
    }

    //methods on DISCIPLINE
    public void addDiscipline(String disciplineName)
    {
        Discipline discipline = new Discipline(disciplineName);
        this.disciplineRepository.addEntry(discipline);
    }

    public ArrayList<Discipline> getAllDisciplineCtrl()
    {
        return this.disciplineRepository.getAllEntries();
    }

    public Discipline getDisciplineByIndexCtrl(int index)
    {
        return this.disciplineRepository.getByIndex(index);
    }

    public void updateDisciplineCtrl(int index, String name)
    {
        Discipline discipline = this.disciplineRepository.getByIndex(index);
        discipline.setName(name);
        this.disciplineRepository.setAtIndex(discipline,index);
    }

    public void deleteDisciplineCtrl(int index)
    {
        this.activityRepository.deleteIndex(index);
    }

    //methods on ACTIVITY
    public void addActivity(String activityName)
    {
        Activity activity = new Activity(activityName);
        this.activityRepository.addEntry(activity);
    }

    public ArrayList<Activity> getAllActivityCtrl()
    {
        return this.activityRepository.getAllEntries();
    }

    public Activity getActivityByIndexCtrl(int index)
    {
        return this.activityRepository.getByIndex(index);
    }

    public void updateActivityCtrl(int index, String neww)
    {
        Activity activity = this.activityRepository.getByIndex(index);
        activity.setType(neww);
        this.activityRepository.setAtIndex(activity,index);
    }

    public void deleteActivityCtrl(int index)
    {
        this.disciplineRepository.deleteIndex(index);
    }

    //methods on ROOM
    public void addRoom(String roomName, String building)
    {
        Room room = new Room(roomName, building);
        this.roomRepository.addEntry(room);
    }

    public ArrayList<Room> getAllRoomCtrl()
    {
        return this.roomRepository.getAllEntries();
    }

    public Room getRoomByIndexCtrl(int index)
    {
        return this.roomRepository.getByIndex(index);
    }

    public void updateRoomCtrl(int index, String code)
    {
        Room room = this.roomRepository.getByIndex(index);
        room.setCode(code);
        this.roomRepository.setAtIndex(room,index);
    }

    public void deleteRoomCtrl(int index)
    {
        this.roomRepository.deleteIndex(index);
    }

    //methods on FORMATION
    public void addFormation(String formationName)
    {
        Formation formation = new Formation(formationName);
        this.formationRepository.addEntry(formation);
    }

    public ArrayList<Formation> getAllFormationCtrl()
    {
        return this.formationRepository.getAllEntries();
    }

    public Formation getFormationByIndexCtrl(int index)
    {
        return this.formationRepository.getByIndex(index);
    }

    public void updateFormationCtrl(int index, String name)
    {
        Formation formation = this.formationRepository.getByIndex(index);
        formation.setName(name);
        this.formationRepository.setAtIndex(formation,index);
    }

    public void deleteFormationCtrl(int index)
    {
        this.formationRepository.deleteIndex(index);
    }

    //methods on RELATIONS
//21
    public void addTeacherActivity(String keyA, String keyB)
    {
        Relation relation = new Relation(keyA, keyB);
        this.teacherActivityRepository.add(relation);
    }
//24
    public ArrayList<Relation> getAllTeacherActivityCtrl()
    {
        return this.teacherActivityRepository.showAll();
    }
//27
    public Relation getTeacherActivityByIndexCtrl(int index)
    {
        return this.teacherActivityRepository.getByIndex(index);
    }
//30
    public void updateTeacherActivityCtrl(int index, String keyA, String keyB)
    {
        Relation relation = this.teacherActivityRepository.getByIndex(index);
        relation.setkA(keyA);
        relation.setkB(keyB);
        this.teacherActivityRepository.update(relation, index);
    }
//33
    public void deleteTeacherActivityCtrl(int index)
    {
        this.teacherActivityRepository.delete(index);
    }
//22
    public void addActivityFormation(String keyA, String keyB)
    {
        Relation relation = new Relation(keyA, keyB);
        this.activityFormationRepository.add(relation);
    }
//25
    public ArrayList<Relation> getAllActivityFormationCtrl()
    {
        return this.activityFormationRepository.showAll();
    }
//28
    public Relation getActivityFormationByIndexCtrl(int index)
    {
        return this.activityFormationRepository.getByIndex(index);
    }
//31
    public void updateActivityFormationCtrl(int index, String keyA, String keyB)
    {
        Relation relation = this.activityFormationRepository.getByIndex(index);
        relation.setkA(keyA);
        relation.setkB(keyB);
        this.activityFormationRepository.update(relation, index);
    }
//34
    public void deleteActivityFormationCtrl(int index)
    {
        this.activityFormationRepository.delete(index);
    }
//23
    public void addRoomActivity(String keyA, String keyB)
    {
        Relation relation = new Relation(keyA, keyB);
        this.roomActivityRepository.add(relation);
    }
//26
    public ArrayList<Relation> getAllRoomActivityCtrl()
    {
        return this.roomActivityRepository.showAll();
    }
//29
    public Relation getRoomActivityByIndexCtrl(int index)
    {
        return this.roomActivityRepository.getByIndex(index);
    }
//32
    public void updateRoomActivityCtrl(int index, String keyA, String keyB)
    {
        Relation relation = this.roomActivityRepository.getByIndex(index);
        relation.setkA(keyA);
        relation.setkB(keyB);
        this.roomActivityRepository.update(relation, index);
    }
//35
    public void deleteRoomActivityCtrl(int index)
    {
        this.roomActivityRepository.delete(index);
    }

   /*public ArrayList<Teacher> sortTeachersByRank (String rank)
   {
       ArrayList<Teacher> teacherArrayList = this.teacherRepository.showAll();
       Stream<Teacher> stream = teacherArrayList.stream().filter(teacher -> teacher.getRank()==rank).sorted(Comparator.comparing(Teacher::getName));
       ArrayList<Teacher> result = new ArrayList<Teacher>();
       stream.forEach(result::add);
       return result;
   }*/

    public ArrayList<Teacher> sortTeachersByRank (String rank)
    {
        ArrayList<Teacher> result = new ArrayList<>();
        ArrayList<Teacher> teacherArrayList = this.teacherRepository.getAllEntries();
        for (int i=0; i<teacherArrayList.size(); i++)
        {
            if (this.teacherRepository.getByIndex(i).getRank()==rank)
                result.add(teacherRepository.getByIndex(i));
        }
        return result;
    }

}

