package staffmemberstest;

import java.util.Scanner;
public class StaffMembersTest {

    static Scanner read = new Scanner(System.in);
    static StaffMember[] members = new StaffMember[100];
    static int membersCount;



    public static int displayMenu() {
        System.out.println("1- Add a new staff member. \n"
                + "2- Remove a staff member.\n"
                + "3- Display all staff members in the organization with complete information. \n"
                + "4- Exit. \n" + "Choice: ");

        return read.nextInt();
    }

    public static void printMembers() {
        for (int i = 0; i < membersCount; i++) {
            System.out.println(members[i]);

        }

    }

    public static void addMember() {
        String name;
        int ID;
        int recruitmentYear;
        double basicSalary, workingHours, hourlyWage;

        System.out.println("Choose staff member type:\n\t1-Manager");
        System.out.println("\t2-Engineer.");
        System.out.println("\t3-Admin Assistant.");
        int type = read.nextInt();

        System.out.println("Name:");
        read.nextLine();
        name = read.nextLine();

        System.out.println("ID:");
        ID = read.nextInt();

        System.out.println("Recruitment Year:");
        recruitmentYear = read.nextInt();

        switch (type) {
            case 1:

                System.out.println("Basic Salary:");
                basicSalary = read.nextDouble();
                members[membersCount++] = new Manager(basicSalary, name, ID, recruitmentYear);
                break;

            case 2:
                System.out.println("Basic Salary:");
                basicSalary = read.nextDouble();
                members[membersCount++] = new Engineer(basicSalary, name, ID, recruitmentYear);
                break;

            case 3:
                System.out.println("Working Hours:");
                workingHours = read.nextDouble();
                System.out.println("Hourly Wage:");
                hourlyWage = read.nextDouble();
                members[membersCount++] = new AdministrativeAssistant(workingHours, hourlyWage, name, ID, recruitmentYear);
                break;
        }

    }

    public static boolean removeMember(int id) {
        for (int i = 0; i < membersCount; i++) {
            if (id == members[i].getID()) {
                for (int j = i; j < membersCount; j++) {
                    members[j] = members[j + 1];
                }
                membersCount--;
                return true; //found & removed
            }
        }
        return false; //not found

    }

    public static void main(String[] args) {
        membersCount = 0;
        int choice = displayMenu();

        while (choice != 4) {
            switch (choice) {
                case 1:
                    addMember();
                    break;

                case 2:

                    System.out.println("Enter ID:");
                    int toBeRemoved_ID = read.nextInt();
                    if (removeMember(toBeRemoved_ID)) {
                        System.out.println("Staff member was removed successfully");
                    } else {
                        System.out.println("Unable to remove staff member. (Not found)");
                    }

                    break;

                case 3:
                    if (membersCount == 0) {
                        System.out.println("No members available.");
                    } else {
                        printMembers();
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice..");
            }

            System.out.println("\n\n");
            choice = displayMenu();
        }
    }


}
