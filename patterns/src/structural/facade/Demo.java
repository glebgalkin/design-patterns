package structural.facade;

import structural.facade.facade.StudentPortalFacade;

public class Demo {

    public static void main(String[] args) {
        StudentPortalFacade studentPortalFacade = new StudentPortalFacade();
        studentPortalFacade.generateStudentReport("id-40026736");
    }
}
