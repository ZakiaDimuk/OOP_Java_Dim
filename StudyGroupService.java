package OOP_Sem5_1;

public class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students){
        return new StudyGroup(teacher, students);
    }
}
