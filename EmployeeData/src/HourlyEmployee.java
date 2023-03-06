public class HourlyEmployee extends Employee{
    private double hourlyPerRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPerRate) {
        super(name, birthDate, hireDate);
        this.hourlyPerRate = hourlyPerRate;
    }
    @Override
    public double collectPay(){
        return 40*hourlyPerRate;
    }
    public double getDoublePay(){
        return 2*collectPay();
    }
}
