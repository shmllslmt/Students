public class Postgraduate extends Student {
    private String researchArea;
    private String thesisTopic;

    public Postgraduate() {
        this("Gamification Technology", "Gamification Technology in Computer Science Courses");
    }

    public Postgraduate(String researchArea, String thesisTopic) {
        super();
        this.researchArea = researchArea;
        this.thesisTopic = thesisTopic;
    }

    public Postgraduate(String name, String studentID, String researchArea, String thesisTopic) {
        super(name, studentID);
        this.researchArea = researchArea;
        this.thesisTopic = thesisTopic;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

//    public void displayInfo(){
//        System.out.println("Research Area: " + getResearchArea());
//        System.out.println("Thesis Topic: " + getThesisTopic());
//    }

    @Override
    public void printInfo() {
        super.printInfo();

        System.out.println("Research Area: " + getResearchArea());
        System.out.println("Thesis Topic: " + getThesisTopic());
    }
}
