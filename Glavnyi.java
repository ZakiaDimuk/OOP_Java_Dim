package OOP_Sem5_1;

import java.util.List;

public class Glavnyi {
    public static void main(String[] args){
        Teacher teacher = new Teacher();
        teacher.setId(1);

        List<Student> students = List.of(
            new Student(1),
            new Student(2),
            new Student(3)
        );

        Controller controller = new Controller();

        StudyGroup studyGroup = controller.createStudyGroupWithTeacherAndStudents(teacher, students);
        
// Вывод информации о созданной учебной группе
        System.out.println("Teacher id: " + studyGroup.getTeacher().getId());
        for (Student student : studyGroup.getStudents()){
            System.out.println("Student id: " + student.getId());
        }
    }
}
