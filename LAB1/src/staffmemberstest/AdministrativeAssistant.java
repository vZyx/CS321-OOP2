package staffmemberstest;

public class AdministrativeAssistant extends StaffMember{

    private final double workingHours;
    private final double hourlyWage;
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
