package structural.facade.student_portal.course;

public abstract class Course {
    private String courseName;
    private String professor;
    private int courseNumber;
    private Department department;

    public Course(String courseName, String professor, int courseNumber, Department department) {
        this.courseName = courseName;
        this.professor = professor;
        this.courseNumber = courseNumber;
        this.department = department;
    }

    public String getCourseInfo(){
        return "Course name: " + this.courseName + " Professor: " + this.professor + " Course number: " + this.courseNumber + " Department: " + this.department;
    }
}
