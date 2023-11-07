public class Main {
    public static void main(String[] args) {
        // create instances of the Student class
        Student alex = new Student();
        Student mary = new Student("S002", "Mary Jane", 19, "Diploma in Computer Science");

        alex.setName("Alexander Graham Bell");
        System.out.println("Student ID: "+alex.getStudentID());
        System.out.println("Name: "+alex.getName());
        System.out.println("Age: "+alex.getAge());
        System.out.println("Programme: "+alex.getProgramme());

        System.out.println(mary);

        System.out.println("Total Number of Students: "+Student.numOfStudents);

        mary.addSubject("PROG2013 Object-Oriented Programming");
    }
}