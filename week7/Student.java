public class Student {
    public String studentMajor;
    public String firstName;
    public String lastName;
    public int studentCredits;

    public Student(String firstName, String lastName, String studentMajor, int studentCredits ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentMajor = studentMajor;
        this.studentCredits = studentCredits;
    }

    public Student (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentMajor = "General Studies";
        this.studentCredits = 0;
    }

    public String getMajor() {
        return studentMajor;
    }

    public int getCredits() {
        return studentCredits;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void changeMajor(String newMajor) {
        this.studentMajor = newMajor;
        System.out.println(firstName + " " + lastName + " has changed majors to " + newMajor);
    }
}