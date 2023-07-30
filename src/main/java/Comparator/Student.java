package Comparator;

public class Student {
    String Name;
    int englishScore;
    int mathsScore;
    int scienceScore;


    public Student(String name, int englishScore, int mathsScore, int scienceScore) {
        Name = name;
        this.englishScore = englishScore;
        this.mathsScore = mathsScore;
        this.scienceScore = scienceScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", englishScore=" + englishScore +
                ", mathsScore=" + mathsScore +
                ", scienceScore=" + scienceScore +
                '}';
    }
}
