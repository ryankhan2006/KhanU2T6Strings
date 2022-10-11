public class Student {
    /* Instance Variables */
    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores;
    private int testScoreCount;

    /* Constructor */
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        accumulatedTestScores = 0.0;
        testScoreCount = 0;
    }

    /* Getter Methods */
    // returns firstName
    public String getFirstName() {
        return firstName;
    }

    // returns lastName
    public String getLastName() {
        return lastName;
    }

    /* Setter Methods */
    // Sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    // Adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    public void addTestScore(double newTestScore) {
        accumulatedTestScores += newTestScore;
        testScoreCount++;
    }

    // Returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        if (averageTestScore() >= 65) {
            return true;
        } else {
            return false;
        }
    }

    // Returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        double average = accumulatedTestScores / testScoreCount;
        return average;
    }

    // this method prints all info of a Student object to the console
    public String printStudentInfo() {
        String studentInfo= "Student Full Name: " + firstName + " " + lastName+ "\n";
        studentInfo+="Number of tests: " + testScoreCount+"\n";
        studentInfo+="Average Test Score: " + averageTestScore()+"\n";
        studentInfo+="Is passing: " + isPassing();
        return studentInfo;
    }

    // ADD YOUR NEW getStudentInfo() METHOD HERE

    public String getStudentInfo() {
        String studentInfo= printStudentInfo();
        return studentInfo;
    }
}


