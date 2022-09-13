package structural.facade.student_portal.facade;

import structural.facade.student_portal.course.CSCourse;
import structural.facade.student_portal.course.Department;
import structural.facade.student_portal.course.ElectiveCourse;
import structural.facade.student_portal.graduation.StudentGrad;
import structural.facade.student_portal.insurance.InsurancePlan;
import structural.facade.student_portal.insurance.StudentInsurance;

public class StudentPortalFacade {

    public void generateStudentReport(String id){
        CSCourse comp234 = new CSCourse("comp-algorithms", "Mr.Jackson", 234, Department.Engineering);
        ElectiveCourse history21 = new ElectiveCourse("history-21st-century", "Ms.Parker", 21, Department.Arts);
        StudentInsurance insurancePlan = new StudentInsurance(InsurancePlan.General);
        StudentGrad graduation = new StudentGrad();

        System.out.println(comp234.getCourseInfo());
        System.out.println(history21.getCourseInfo());
        System.out.println(insurancePlan.generatePlan());
        graduation.calculateGraduationDate();
    }
}
