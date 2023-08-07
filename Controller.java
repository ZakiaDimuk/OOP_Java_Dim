package OOP_Sem5_1;

public class Controller {
    private StudyGroupService studeGroupService;

    public Controller(){
        this.studeGroupService = new StudyGroupService();
    }

    public StudyGroup createStudyGroupWithTeacherAndStudents(Teacher teacher, List<Student> students){
        return studeGroupService.createStudeGroup(teacher, students);
    }
}
