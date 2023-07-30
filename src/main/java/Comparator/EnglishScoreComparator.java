package Comparator;

import java.util.Comparator;

public class EnglishScoreComparator implements Comparator<Student> {
    public int compare(Student stud1, Student stud2) {
        if (stud1.englishScore < stud2.englishScore) {
            return -1;
        } else if (stud1.englishScore > stud2.englishScore) {
            return 1;
        }
        return 0;
    }
}
