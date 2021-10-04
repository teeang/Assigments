package mokeexam;

public class Student {

    private String stdName;
    private int stdId;
    private double gpa;


    public Student  (  String stdName,  int stdId,  double gpa) {
        this.stdName = stdName;
        this.stdId = stdId;
        this.gpa = gpa;

    }

    public String getStdName() {

        return stdName;
    }

    public void setStdName(String stdName) {

        this.stdName = stdName;
    }


}

