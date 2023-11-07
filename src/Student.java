public class Student {
    // attributes
    private String studentID;
    private String name;
    private int age;
    private String programme;
    // no-arg constructor
    Student() {
        this("S001", "John Doe", 20, "Diploma in Information Technology");
    }
    // parameterized constructor
    Student(String studentID, String name, int age, String programme) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.programme = programme;
    }

    // getter / accessor - to retrieve value of attributes
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getProgramme() {
        return programme;
    }

    // setters / mutators - to change or to update the value of attributes
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
    // toString - to display attribute values
    @Override
    public String toString() {
        return "Student ID: "+studentID+
                "\nName: "+name+
                "\nAge: "+age+
                "\nProgramme: "+programme;
    }
    // task / helper method
}
