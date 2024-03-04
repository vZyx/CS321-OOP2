package staffmemberstest;

    public abstract class StaffMember
{

    private String name;
    private int ID;
    private int recruitmentYear;

    public StaffMember(String name, int ID, int recruitmentYear) {
        this.name = name;
        this.ID = ID;
        this.recruitmentYear = recruitmentYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getRecruitmentYear() {
        return recruitmentYear;
    }

    public void setRecruitmentYear(int recruitmentYear) {
        this.recruitmentYear = recruitmentYear;
    }

    public abstract double getMonthlySalary();

    @Override
    public String toString() {
        return  "\tName: " + name + "\n\tID: " + ID + "\n\tRecruitment Year: " + recruitmentYear;
    }


}


