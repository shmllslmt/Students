import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("D240001C", "Pang Yih Xuan");

//        ArrayList<Double> studentMarks = new ArrayList<Double>();
//        studentMarks.add(80.0);
//        studentMarks.add(100.0);
//        studentMarks.add(75.0);
//        studentMarks.add(80.0);
//
//        student.setMarks(studentMarks);

        student.setMarks(75.5);
        student.setMarks(81.5);
        student.setMarks(99.5);
        student.setMarks(100);

        student.printInfo();

        Undergraduate ugStudent = new Undergraduate();
        ugStudent.printInfo();

        Postgraduate pgStudent = new Postgraduate();
        pgStudent.printInfo();
    }
}
