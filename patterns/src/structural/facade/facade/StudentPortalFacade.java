package structural.facade.facade;

import structural.facade.insurance.InsurancePlan;
import structural.facade.insurance.StudentInsurance;
import structural.facade.course.CSCourse;
import structural.facade.course.Department;
import structural.facade.course.ElectiveCourse;
import structural.facade.graduation.StudentGrad;

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
