package anotherChibuzo;

public class Student {
    private  String fullName;
    private int pythonScore;
    private int javaScore;
    private int databaseScore;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPythonScore() {
        return pythonScore;
    }

    public void setPythonScore(int pythonScore) {
        this.pythonScore = pythonScore;
    }

    public int getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(int javaScore) {
        this.javaScore = javaScore;
    }

    public int getDatabaseScore() {
        return databaseScore;
    }

    public void setDatabaseScore(int databaseScore) {
        this.databaseScore = databaseScore;
    }

    public String toString(){
        int total = javaScore + pythonScore + databaseScore;
        double average = total/3.0;
        String toStringEquivalent = String.format("""
                %s      %s      %s      %s      %s      %s
                """, fullName, javaScore, pythonScore, databaseScore, total, average);
        return toStringEquivalent;
    }

}
