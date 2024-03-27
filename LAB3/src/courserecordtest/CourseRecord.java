package courserecordtest;

public class CourseRecord {
    
    private String courseCode;  
    private String  courseTitle, instructorName;
    private int classRoom;
    private double creditHours;

    
    public CourseRecord(String courseCode, String courseTitle, String instructorName, int classRoom, double creditHours) throws Exception {
    boolean condition1 = false, condition2 = false, condition3 = false;
       
        if (courseCode.toUpperCase().startsWith("CS") && courseCode.length() == 5) 
            condition1 = true;
        else  if (courseCode.toUpperCase().startsWith("CIS") && courseCode.length() == 6) 
            condition1 = true;
        
        if (classRoom > 0) 
            condition2 = true;
        
       
        if (creditHours >= 1.0 && creditHours <= 3.0) 
            condition3 = true;
        
        
        if (condition1 && condition2 && condition3) {
            this.courseCode = courseCode;
            this.courseTitle = courseTitle;
            this.instructorName = instructorName;
            this.classRoom = classRoom;
            this.creditHours = creditHours;
        }
        else  //throws an exception if one of the conditions is violated
              throw new Exception("Invalid Course Information"); 
        
    }
    
@Override
    public String toString() {
        return  "Course Code: " + courseCode + "\nTitle: " + courseTitle + "\nInstructor: " + instructorName + "\nClass Room:" + classRoom + "\nCredit Hours: " + creditHours + "\n\n";
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getCourseCode() {
        return courseCode;
    }

   

    public int getClassRoom() {
        return classRoom;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setClassRoom(int classRoom) {
        this.classRoom = classRoom;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }
    
}
