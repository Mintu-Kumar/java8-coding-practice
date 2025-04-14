package Capg;

public class StudentBuilder {

    private String fName;
    private String mName;
    private String lName;
    private int rollNumber;

    public String getfName() {
        return fName;
    }

    public StudentBuilder setfName(String fName) {
        this.fName =  fName;
        return this;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
