package rd.epam.com;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    private static void addStudent(List<Student> students,String name, String lastName, String secondName, int group){
        Student student = new Student(name, lastName);
        switch(group){
            case 1:
                student.setGroup(Group.FIRST);
                break;
            case 2:
                student.setGroup(Group.SECOND);
                break;
        }
        student.setSecondName(secondName);
        students.add(student);
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList();

        /*Student student = new Student("Андрей", "Юрьевич");
        student.setGroup(Group.FIRST);
        student.setSecondName("Иванов");

        students.add(student);*/

        addStudent(students,"Андрей","Юрьевич","Иванов",1);
        addStudent(students,"Ирина","Сергеевна","Сирукова",1);

        students.forEach(System.out::println);


    }
}
