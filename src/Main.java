public class Main {
    public static void main(String[] args) {
        // create instances of the Student class
        Student alex = new Student();
        Student mary = new Student("S002", "Mary Jane", 19, "Diploma in Computer Science");

        Student[] arrayStudents = new Student[5];

        arrayStudents[0] = new Student();
        arrayStudents[1] = new Student();
        arrayStudents[2] = new Student();
        arrayStudents[3] = new Student();
        arrayStudents[4] = new Student();

        Student[] arrStudents = {
                new Student(),
                new Student("S002", "Peter Parker", 19, "DIT"),
                new Student(),
                new Student("S004", "Diana Prince", 19, "DCS"),
                new Student()
        };

        System.out.println("Array of Student Objects:");
        System.out.println(arrayStudents[0]);
        System.out.println(arrayStudents[1]);
        System.out.println(arrayStudents[2]);
        System.out.println(arrayStudents[3]);
        System.out.println(arrayStudents[4]);

        alex.setName("Alexander Graham Bell");
        System.out.println("\nStudent ID: "+alex.getStudentID());
        System.out.println("Name: "+alex.getName());
        System.out.println("Age: "+alex.getAge());
        System.out.println("Programme: "+alex.getProgramme());

        System.out.println("\n"+mary);

        System.out.println("Total Number of Students: "+Student.numOfStudents);

        mary.addSubject("PROG2013 Object-Oriented Programming");
        mary.addSubject("CSIS2023 Database System Design");
        mary.addSubject("BTIS3013 Operating System");
        mary.dropSubject("BTIS3013 Operating System");

        System.out.println("Mary enrols to the following subject(s): ");
        for(String subject: mary.getSubjects()) {
            System.out.println("  "+subject);
        }
    }
}