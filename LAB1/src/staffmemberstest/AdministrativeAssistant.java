package staffmemberstest;

public class AdministrativeAssistant extends StaffMember{

    private double workingHours , hourlyWage;
    public AdministrativeAssistant(double hours, double wage, String name, int ID, int recruitmentYear) {
        super(name, ID, recruitmentYear);
        workingHours=hours;
        hourlyWage=wage;
    }

    @Override
    public double getMonthlySalary() {

        return workingHours*hourlyWage;
    }

    @Override
    public String toString() {
        return "Type: Administrative Assistant\n" + super.toString()+ "\n\tMonthly Salary: " + getMonthlySalary()+"$";
    }

}
