package mokeexam;

public class Course {

    private String courseId ;
    private String courseName;
    private int creditHours;

    public Course (String courseId , String courseName , int creditHours ) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

        public void setCourseName(String courseName) {

        this.courseName = courseName;
    }


    public String getCourseName() {

        return courseName;
    }

}

