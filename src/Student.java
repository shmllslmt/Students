import java.util.ArrayList;

public class Student {
    private String studentID;
    private String name;
    private ArrayList<Double> marks;

    Student() {
        this("D240001C", "John Doe");
    }

    Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        marks = new ArrayList<Double>();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    public void setMarks(double mark) {
        this.marks.add(mark);
    }

    public void setMarks(ArrayList<Double> marks) {
        this.marks = marks;
    }

    public double calcAverage() {
        double sum = 0;
        double average = 0.0;

        if(!(marks.isEmpty())) {
            for(double mark: marks) {
                sum += mark;
            }

            average = sum / marks.size();
        }
        return average;
    }

    public String determineGrade() {
        double average = calcAverage();

        if(average >= 80)
            return "A";
        else if(average >= 60)
            return "B";
        else if(average >= 50)
            return "C";
        else if(average >= 30)
            return "D";
        else
            return "F";
    }

    public void printInfo() {
        System.out.println(studentID);
        System.out.println(name);

        if(!(marks.isEmpty())) {
            for(double mark: marks) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }

        System.out.println("Average Mark: "+ calcAverage());
        System.out.println("Grade: "+ determineGrade());
    }
}
