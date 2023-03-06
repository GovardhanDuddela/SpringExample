public class SalariedEmployee extends Employee{
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double collectPay(){
        double payCheck=annualSalary/26;
        double adjustSalary=(isRetired)?0.9*payCheck:payCheck;
        return (int)adjustSalary;
    }
    public void retire(){
        terminate("13/10/2090");
        isRetired=true;
    }
}
