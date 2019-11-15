import domain.*;

import java.util.ArrayList;

public class ui {

    private Controller ctrl;

    //constructor
    public ui(Controller ctrl)
    {
        this.ctrl = ctrl;
    }

    //getter
    public Controller getCtrl()
    {
        return ctrl;
    }

    static void menu()
    {
        System.out.println("Available options");
        System.out.println("-------------------");
        System.out.println("1. Add a new discipline");
        System.out.println("2. Show all  disciplines");
        System.out.println("3. Update discipline");
        System.out.println("4. Delete discipline");
        System.out.println("-------------------");
        System.out.println("5. Add a new teacher");
        System.out.println("6. Show all teachers");
        System.out.println("7. Update teacher");
        System.out.println("8. Delete teacher");
        System.out.println("-------------------");
        System.out.println("9. Add a new activity");
        System.out.println("10. Show all activities");
        System.out.println("11. Delete activity");
        System.out.println("12. Update activity");
        System.out.println("-------------------");
        System.out.println("13. Add a new formation");
        System.out.println("14. Show all formations");
        System.out.println("15. Update formation");
        System.out.println("16. Delete formation");
        System.out.println("-------------------");
        System.out.println("17. Add a new room");
        System.out.println("18. Show all rooms");
        System.out.println("19. Update room");
        System.out.println("20. Delete room");
        System.out.println("-------------------");
        System.out.println("21. Add teacher-activity relation");
        System.out.println("22. Add activity-formation relation");
        System.out.println("23. Add room-activity relation");
        System.out.println("-------------------");
        System.out.println("24. Show all teacher-activity relations");
        System.out.println("25. Show all activity-formation relations");
        System.out.println("26. Show all room-activity relations");
        System.out.println("-------------------");
        System.out.println("27. Show teacher-activity relation by index");
        System.out.println("28. Show activity-formation relation by index");
        System.out.println("29. Show room-activity relation by index");
        System.out.println("-------------------");
        System.out.println("30. Update teacher-activity relation by index");
        System.out.println("31. Update activity-formation relation by index");
        System.out.println("32. Update room-activity relation by index");
        System.out.println("-------------------");
        System.out.println("33. Delete teacher-activity relation by index");
        System.out.println("34. Delete activity-formation relation by index");
        System.out.println("35. Delete room-activity relation by index");
        System.out.println("-------------------");
        System.out.println("36. Sort teachers by rank");
    }
}