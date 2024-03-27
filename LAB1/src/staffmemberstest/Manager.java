package staffmemberstest;

public class Manager extends StaffMember{

    private final double basicSalary;
    public Manager(double salary, String name, int ID, int recruitmentYear) {
        super(name, ID, recruitmentYear);
        basicSalary=salary;
    }

    @Override
    public double getMonthlySalary() {
        int servingYears=2021-super.getRecruitmentYear();
        return (basicSalary + (basicSalary * servingYears *0.01));
    }

    @Override
    public String toString() {
        return "Type: Manager\n" + super.toString()+ "\n\tMonthly Salary:" + getMonthlySalary()+"$";
    }

}
