package structural.facade.insurance;

public class StudentInsurance implements Insurance{

    private InsurancePlan insurancePlan;

    public StudentInsurance(InsurancePlan insurancePlan){
        this.insurancePlan = insurancePlan;
    }

    @Override
    public String generatePlan() {

        String result = null;

        switch (insurancePlan){
            case Pro -> {
                result = "Insurance plan: PRO";
            }
            case General -> {
                result = "Insurance plan: General";
            }

            case Basic -> {
                result = "Insurance plan: Basic";
            }

        }
        return result;
    }
}
