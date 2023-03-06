public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Govardhan", "03/01/1998", "13/10/2020");
        System.out.println(employee);
        System.out.println(employee.getAge());
        System.out.println(employee.collectPay());
        SalariedEmployee rajesh = new SalariedEmployee("RAJESH", "23/03/1998", "15/03/2021",
                300000) ;
        System.out.println(rajesh);
        System.out.println(rajesh.getAge());
        System.out.println(rajesh.collectPay());
        rajesh.retire();
        System.out.println("pension"+rajesh.collectPay());
        HourlyEmployee tharun=new HourlyEmployee("tharun","02/01/2000","20/03/2020",15);
        System.out.println(tharun);
        System.out.println(tharun.getDoublePay());
        System.out.println(tharun.collectPay());
    }
}
