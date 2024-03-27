package staffmemberstest;

public class Engineer extends StaffMember
{

    private final double basicSalary;
    public Engineer(double salary, String name, int ID, int recruitmentYear) {
        super(name, ID, recruitmentYear);
        basicSalary=salary;
    }

    @Override
    public double getMonthlySalary() {
        int servingYears=2021-super.getRecruitmentYear();
        return (basicSalary + (basicSalary * servingYears *0.02));
    }

    @Override
    public String toString() {
        return "Type: Engineer\n" + super.toString()+ "\n\tMonthly Salary: " + getMonthlySalary()+"$";
    }

}
