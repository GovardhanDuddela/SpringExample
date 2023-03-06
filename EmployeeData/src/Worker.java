public class Worker {
    private String name;
    private String birthDate;
    protected String endDATE;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate=birthDate;
        this.endDATE="31/12/2023";
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDATE='" + endDATE + '\'' +
                '}';
    }
    public int getAge(){
        int currentYear=2025;
        int birthYear=Integer.parseInt(birthDate.substring(6));
        return currentYear-birthYear;
    }
    public void terminate(String endDATE){
        this.endDATE=endDATE;
    }
    public double collectPay(){
        return 0;
    }

}
