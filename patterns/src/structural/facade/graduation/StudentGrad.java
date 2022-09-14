package structural.facade.graduation;

public class StudentGrad implements Graduation{

    @Override
    public void calculateGraduationDate() {
        System.out.println("Graduation is on August 23rd");
    }
}
