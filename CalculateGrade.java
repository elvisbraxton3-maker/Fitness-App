public class GradeCalculator {
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75 && marks < 90) {
            return "B";
        } else if (marks >= 50 && marks < 75) {
            return "C";
        } else {
            return "D";
        }
    }
}