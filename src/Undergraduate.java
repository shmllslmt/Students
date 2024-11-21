public class Undergraduate extends Student {
    private String yearLevel;
    private String major;
    private double gpa;

    public Undergraduate() {
        this("Year 1", "Information Technology", 4.0);
    }

    public Undergraduate(String yearLevel, String major, double gpa) {
        super();
        this.yearLevel = yearLevel;
        this.major = major;
        this.gpa = gpa;
    }

    public Undergraduate(String name, String studentID, String yearLevel, String major, double gpa) {
        super(name, studentID);
        this.yearLevel = yearLevel;
        this.major = major;
        this.gpa = gpa;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println(yearLevel);
        System.out.println("Majoring in " + major);
        System.out.println(gpa);
    }
}
