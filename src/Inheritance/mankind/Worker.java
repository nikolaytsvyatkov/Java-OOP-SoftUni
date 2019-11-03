package Inheritance.mankind;

public class Worker extends Human {
    private double weekSalary;
    private int workingHours;
    public Worker(String firstName, String lastName, double weekSalary, int workingHours) {
        super(firstName, lastName);
        setWeekSalary(weekSalary);
        setWorkingHours(workingHours);
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if (weekSalary <= 10) {
            throw new IllegalStateException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public void setLastName(String lastName) {
        if (lastName.length() <= 3) {
            throw new IllegalStateException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    public void setWorkingHours(int workingHours) {
        if (workingHours < 1 || workingHours > 12) {
            throw new IllegalStateException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.workingHours = workingHours;
    }
    public double calculateSalaryPerHour() {
        return this.weekSalary / (workingHours * 7);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Week salary: %.2f",this.weekSalary)).append(System.lineSeparator());
        sb.append(String.format("Hours per day: %d", this.workingHours)).append(System.lineSeparator());
        sb.append(String.format("Salary per hour: %.2f", this.calculateSalaryPerHour()));
        return super.toString() + sb.toString();

    }
}
