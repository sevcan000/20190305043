import java.util.*;

public class Main {


    public static <integer> void main(String[] args) {


        System.out.println("     WELCOME TO UNIVERSITY AUTOMATION SYSTEM");

        System.out.println(" ");
        Scanner scan = new Scanner(System.in);


        String secenekler = "General Automation System of Assistants 1\n"
                + "General Automation System of Lecturers  2\n"
                + "Daily Automation System of Lecturers  3\n"
                + "Daily Automation System of Assistants 4\n";
        System.out.println(secenekler);




        System.out.println(" Please Select Transaction");
        Scanner scanner;
        String secenek = scan.nextLine();


        switch (secenek) {
            case "1":
                BaseUI baseUI = new BaseUI();
                baseUI.enter(new Assistant());
                baseUI.Exit(new Assistant());
                baseUI.EntryLesson(new Assistant());
                baseUI.EntryLab(new Assistant());
                baseUI.add(new Assistant());


                break;
            case "2":
                BaseUI baseUII = new BaseUI();
                baseUII.enter(new Lecturer());
                baseUII.Exit(new Lecturer());
                baseUII.EntryLesson(new Lecturer());
                baseUII.add(new Lecturer());

                break;


            case "3":
                EmployeeData<String> NameSurname = new EmployeeData<String>();
                NameSurname.add("Sevcan Çoşkun     ");
                NameSurname.add("Ayşe Kaya         ");
                NameSurname.add("Ali Demir         ");
                NameSurname.add("Ali Kılınç        ");

                LinkedList<String> NameSurnameList = NameSurname.takeLinkedList();


                EmployeeData<Integer> LessonTime = new EmployeeData<Integer>();
                LessonTime.add(12);
                LessonTime.add(13);
                LessonTime.add(14);
                LessonTime.add(15);

                LinkedList<Integer> LessonTimeList = LessonTime.takeLinkedList();


                EmployeeData<String> Lesson = new EmployeeData<String>();
                Lesson.add("Data Structures");
                Lesson.add("Finance");
                Lesson.add("Marketing Management");
                Lesson.add("Object Programming");

                LinkedList<String> LessonList = Lesson.takeLinkedList();


                for (int i = 0; i < NameSurnameList.size(); i++) {
                    System.out.print("Lecturer: " + NameSurnameList.get(i));
                    System.out.print("Lesson Entered: " + LessonList.get(i));
                    System.out.println("     Lesson Time : " + LessonTimeList.get(i));
                    ;
                }

                break;
            case  "4":

                ArrayData<String> LabName = new ArrayData<String>();
                LabName.add("Merve Kaya    ");
                LabName.add("Mehmet Demir  ");
                LabName.add("Zeynep Büyük  ");
                LabName.add("Ahmet Küçük   ");

                ArrayList<String> LabNameList = LabName.takeArrayList();



                ArrayData<Integer> LabTime = new ArrayData<Integer>();
                LabTime.add(11);
                LabTime.add(12);
                LabTime.add(13);
                LabTime.add(14);

                ArrayList<Integer> LabTimeList = LabTime.takeArrayList();


                ArrayData<String> Labclass = new ArrayData<String>();
                Labclass.add(" Lab A101 ");
                Labclass.add(" Lab A102 ");
                Labclass.add(" Lab A103 ");
                Labclass.add(" Lab A104 ");

                ArrayList<String> LabclassList = Labclass.takeArrayList();





                for (int i = 0; i < LabNameList.size(); i++) {
                    System.out.print("Assistant: " + LabNameList.get(i));
                    System.out.print("Lab lesson time: " + LabTimeList.get(i));
                    System.out.println("     Lab class: " + LabclassList.get(i));


                    ;
                }

                break;

            default: System.out.println("Geçersiz bir değer girdiniz.");

        }
    }
}




