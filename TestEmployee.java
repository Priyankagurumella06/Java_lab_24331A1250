public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("Priya", 500000, 2026, "INS12345");
        System.out.println("Name : " + e.getName());
        System.out.println("Salary : " + e.getAnnualSalary());
        System.out.println("Year Started : " + e.getYearStarted());
        System.out.println("Insurance No : " + e.getInsuranceNumber());
    }
}