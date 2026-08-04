class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String insuranceNumber;
    Employee(String name, double salary, int year, String insurance) {
        super(name);
        annualSalary = salary;
        yearStarted = year;
        insuranceNumber = insurance;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }
    public int getYearStarted() {
        return yearStarted;
    }
    public String getInsuranceNumber() {
        return insuranceNumber;
    }
    public void setAnnualSalary(double salary) {
        annualSalary = salary;
    }
    public void setYearStarted(int year) {
        yearStarted = year;
    }
    public void setInsuranceNumber(String insurance) {
        insuranceNumber = insurance;
    }
}