import domain.*;
import insfrastructure.*;
import java.util.ArrayList;
import java.util.Scanner;

public class main
{

    public static void main(String[] args)
    {

//populating the lists



        Controller ctrl = new Controller();
        ctrl.addTeacher("Apatean Anca","lecturer");
        ctrl.addTeacher("Pop Emilia","lecturer");
        ctrl.addTeacher("Bocicor Iuliana","professor");
        ctrl.addTeacher("Chira Camelia","professor");

        ctrl.addRoom("A310", "Avram Iancu");
        ctrl.addRoom("C513", "FSEGA");
        ctrl.addRoom("A310", "Avram Iancu");

        ctrl.addDiscipline("MAP");
        ctrl.addDiscipline("Databases");
        ctrl.addDiscipline("ASC");
        ctrl.addDiscipline("Differential Equations");
        ctrl.addDiscipline("Complex Analysis");

        ctrl.addActivity("seminar");
        ctrl.addActivity("lecture");
        ctrl.addActivity("laboratory");

        ctrl.addFormation("821");
        ctrl.addFormation("210");
        ctrl.addFormation("931");
        ctrl.addFormation("811");
        ctrl.addFormation("333");

        ctrl.addTeacherActivity("1", "1");
        ctrl.addTeacherActivity("Activity 1", "Teacher 1");
        ctrl.addTeacherActivity("Activity 2", "Teacher 2");
        ctrl.addTeacherActivity("Activity 3", "Teacher 2");
        ctrl.addTeacherActivity("Activity 4", "Teacher 3");

        ctrl.addActivityFormation("Activity 0", "Formation 1");
        ctrl.addActivityFormation("Activity 1", "Formation 1");
        ctrl.addActivityFormation("Activity 3", "Formation 2");
        ctrl.addActivityFormation("Activity 4", "Formation 3");

        ctrl.addRoomActivity("Activity 0", "Room 1");
        ctrl.addRoomActivity("Activity 1", "Room 1");
        ctrl.addRoomActivity("Activity 2", "Room 2");
        ctrl.addRoomActivity("Activity 3", "Room 2");
        ctrl.addRoomActivity("Activity 4", "Room 3");


        ui ui = new ui(ctrl);

        ui.menu();

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        while (true) {
            System.out.println("Give your option");
            int option = sc.nextInt();
            switch (option) {

                case 1:
                    System.out.println("Give discipline's name ");
                    String discipline = sc2.nextLine();
                    ctrl.addDiscipline(discipline);
                    System.out.println("Added successfully");
                    break;

                case 2:
                    ArrayList<Discipline> disciplineList = ctrl.getAllDisciplineCtrl();
                    for (int i = 0; i < disciplineList.size(); i++) {
                        System.out.printf("\t%d - %s\n", i, disciplineList.get(i));
                    }
                    break;

                case 3:
                    sc2.nextLine();
                    System.out.println("Give the index of the discipline you want to change");
                    int oD = sc2.nextInt();
                    sc2.nextLine();
                    System.out.println("Give the discipline's name ");
                    String nD = sc2.nextLine();
                    ctrl.updateDisciplineCtrl(oD, nD);
                    System.out.println("The discipline was successfully updated! ");
                    break;

                case 4:
                    System.out.println("Give discipline(index you want to delete ");
                    int di = sc2.nextInt();
                    ctrl.deleteDisciplineCtrl(di);
                    System.out.println("Deleted successfully");
                    break;

                case 5:
                    System.out.println("Give teacher's name ");
                    String name = sc2.nextLine();
                    sc2.nextLine();
                    System.out.println("Give teacher's rank ");
                    String rank = sc2.nextLine();
                    ctrl.addTeacher(name, rank);
                    System.out.println("Added successfully");
                    break;

                case 6:
                    ArrayList<Teacher> teacherList = ctrl.getAllTeacherCtrl();
                    for (int i = 0; i < teacherList.size(); i++) {
                        System.out.printf("\t%d - %s\n", i, teacherList.get(i));
                    }
                    break;

                case 7:
                    System.out.println("Give the index of the teacher you want to change");
                    int iT = sc2.nextInt();

                    sc2.nextLine();
                    System.out.println("Give the teacher's name");
                    String nT = sc2.nextLine();
                    ctrl.updateTeacherCtrl(iT, nT);
                    System.out.println("Updated successfully! ");
                    break;

                case 8:
                    System.out.println("Give teacher(index) you want to delete ");
                    int ti = sc2.nextInt();
                    ctrl.deleteTeacherCtrl(ti);
                    System.out.println("Deleted successfully");
                    break;

                case 9:
                    System.out.println("Give activity type");
                    String t = sc2.nextLine();
                    ctrl.addActivity(t);
                    System.out.println("Added successfully");
                    break;

                case 10:
                    ArrayList<Activity> activityArrayList = ctrl.getAllActivityCtrl();
                    for (int i = 0; i < activityArrayList.size(); i++) {
                        System.out.printf("\t%d - %s\n", i, activityArrayList.get(i));
                    }
                    break;

                case 11:
                    System.out.println("Give activity index");
                    int iA = sc2.nextInt();
                    ctrl.deleteActivityCtrl(iA);
                    System.out.println("Deleted successfully");
                    break;

                case 12:
                    System.out.println("Give activity index");
                    int inA = sc2.nextInt();
                    sc2.nextLine();
                    System.out.println("Give the new activity type");
                    String yA = sc2.nextLine();
                    ctrl.updateActivityCtrl(inA, yA);
                    System.out.println("Updated successfully");
                    break;

                case 13:
                    System.out.println("Give formation's name ");
                    String formation = sc2.nextLine();
                    ctrl.addDiscipline(formation);
                    System.out.println("Added successfully");
                    break;

                case 14:
                    ArrayList<Formation> formationArrayList = ctrl.getAllFormationCtrl();
                    for (int i = 0; i < formationArrayList.size(); i++) {
                        System.out.printf("\t%d - %s\n", i, formationArrayList.get(i));
                    }
                    break;

                case 15:
                    System.out.println("Give formation index");
                    int fI = sc2.nextInt();
                    sc2.nextLine();
                    System.out.println("Give the formation code");
                    String fN = sc2.nextLine();
                    ctrl.updateFormationCtrl(fI, fN);
                    System.out.println("Updated successfully");
                    break;

                case 16:
                    System.out.println("Give formation index");
                    int foI = sc2.nextInt();
                    ctrl.deleteFormationCtrl(foI);
                    System.out.println("Deleted successfully");
                    break;

                case 17:
                    System.out.println("Give room's code ");
                    String room = sc2.nextLine();
                    sc2.nextLine();
                    System.out.println("Give building's name ");
                    String building = sc2.nextLine();
                    ctrl.addRoom(room, building);
                    System.out.println("Added successfully");
                    break;

                case 18:
                    ArrayList<Room> roomArrayList = ctrl.getAllRoomCtrl();
                    for (int i = 0; i < roomArrayList.size(); i++) {
                        System.out.printf("\t%d - %s\n", i, roomArrayList.get(i));
                    }
                    break;

                case 19:
                    System.out.println("Give room index");
                    int ri = sc2.nextInt();
                    sc2.nextLine();
                    System.out.println("Give the room code");
                    String rc = sc2.nextLine();
                    ctrl.updateRoomCtrl(ri, rc);
                    System.out.println("Updated successfully");
                    break;

                case 20:
                    System.out.println("Give room index");
                    int roi = sc2.nextInt();
                    ctrl.deleteRoomCtrl(roi);
                    System.out.println("Deleted successfully");
                    break;

                case 21:
                    System.out.println("Give teacher's key ");
                    String k1 = sc2.nextLine();
                    sc2.nextLine();
                    System.out.println("Give activity's key ");
                    String k2 = sc2.nextLine();
                    ctrl.addTeacherActivity(k1, k2);
                    System.out.println("Added successfully");
                    break;

                case 22:
                    System.out.println("Give activity's key ");
                    String k11 = sc2.nextLine();
                    sc2.nextLine();
                    System.out.println("Give formation's key ");
                    String k3 = sc2.nextLine();
                    ctrl.addActivityFormation(k11, k3);
                    System.out.println("Added successfully");
                    break;

                case 23:
                    System.out.println("Give room's key ");
                    String k4 = sc2.nextLine();
                    sc2.nextLine();
                    System.out.println("Give activity's key ");
                    String k12 = sc2.nextLine();
                    ctrl.addRoomActivity(k4, k12);
                    System.out.println("Added successfully");
                    break;

                case 24:
                    ArrayList<Relation> relationArrayList = ctrl.getAllTeacherActivityCtrl();
                    for (int i = 0; i < relationArrayList.size(); i++) {
                        System.out.printf("\t%d - %s\n", i, relationArrayList.get(i));
                    }
                    break;

                case 25:
                    ArrayList<Relation> relationArrayList1 = ctrl.getAllActivityFormationCtrl();
                    for (int i = 0; i < relationArrayList1.size(); i++) {
                        System.out.printf("\t%d - %s\n", i, relationArrayList1.get(i));
                    }
                    break;

                case 26:
                    ArrayList<Relation> relationArrayList2 = ctrl.getAllRoomActivityCtrl();
                    for (int i = 0; i < relationArrayList2.size(); i++) {
                        System.out.printf("\t%d - %s\n", i, relationArrayList2.get(i));
                    }
                    break;

                case 27:
                    System.out.println("Give teacher-activity relation index: ");
                    int index = sc2.nextInt();
                    Relation relation = ctrl.getTeacherActivityByIndexCtrl(index);
                    System.out.printf("\t%s", relation);
                    break;

                case 28:
                    System.out.println("Give activity-formation relation index: ");
                    int index1 = sc2.nextInt();
                    Relation relation1 = ctrl.getActivityFormationByIndexCtrl(index1);
                    System.out.printf("\t%s", relation1);
                    break;

                case 29:
                    System.out.println("Give room-activity relation index: ");
                    int index2 = sc2.nextInt();
                    Relation relation2 = ctrl.getRoomActivityByIndexCtrl(index2);
                    System.out.printf("\t%s", relation2);
                    break;

                case 30:
                    System.out.println("Enter teacher-activity relation index : ");
                    int index3 = sc2.nextInt();
                    sc2.nextLine();
                    System.out.println("Enter new keyA");
                    String keyA = sc2.nextLine();
                    sc2.nextLine();
                    System.out.println("Enter new keyB");
                    String keyB = sc2.nextLine();
                    ctrl.updateTeacherActivityCtrl(index3, keyA, keyB);
                    System.out.printf("Updated teacher-activity relation at %d!", index3);
                    break;

                case 31:
                    System.out.println("Enter activity-formation relation index : ");
                    int index4 = sc2.nextInt();
                    sc2.nextLine();
                    System.out.println("Enter new keyA");
                    String key1A = sc2.nextLine();
                    sc2.nextLine();
                    System.out.println("Enter new keyB");
                    String key1B = sc2.nextLine();
                    ctrl.updateActivityFormationCtrl(index4, key1A, key1B);
                    System.out.printf("Updated activity-formation relation at %d!", index4);
                    break;

                case 32:
                    System.out.println("Enter room-activity relation index : ");
                    int index5 = sc2.nextInt();
                    sc2.nextLine();
                    System.out.println("Enter new keyA");
                    String key2A = sc2.nextLine();
                    sc2.nextLine();
                    System.out.println("Enter new keyB");
                    String key2B = sc2.nextLine();
                    ctrl.updateRoomActivityCtrl(index5, key2A, key2B);
                    System.out.printf("Updated room-activity relation at %d!", index5);
                    break;

                case 33:
                    System.out.println("Enter teacher-activity relation index: ");
                    int index6 = sc2.nextInt();
                    ctrl.deleteTeacherActivityCtrl(index6);
                    break;

                case 34:
                    System.out.println("Enter activity-formation relation index: ");
                    int index7 = sc2.nextInt();
                    ctrl.deleteActivityFormationCtrl(index7);
                    break;

                case 35:
                    System.out.println("Enter room-activity relation index: ");
                    int index8 = sc2.nextInt();
                    ctrl.deleteRoomActivityCtrl(index8);
                    break;

                case 36:
                    System.out.println("Enter teacher's rank: ");
                    String trank = sc2.nextLine();
                    ArrayList<Teacher> teacherArrayList = ctrl.sortTeachersByRank(trank);
                    for (int i = 0; i < teacherArrayList.size(); i++) {
                        System.out.printf("\t%d - %s\n", i, teacherArrayList.get(i));
                    }
                    break;

                case 0:
                    return;
            }
        }

    }
}

