package Exercise10;

public class Students {
    private String name;
    private double[] grades = new double[2];

    public Students(String name, double grade1, double grade2) {
        this.name = name;
        this.grades[0] = grade1;
        this.grades[1] = grade2;
    }

    public String getName() {
        return name;
    }

    public double[] getGrades() {
        return grades;
    }

    public boolean approved() {
        double finalGrade = (grades[0] + grades[1])/2;
        if(finalGrade >= 6) {
            return true;
        }
        return false;
    }
}
