package Comparator;

import java.util.List;

public class InsertionSort {

    ComparatorImplementation comparatorImplementation = new ComparatorImplementation();
    EnglishScoreComparator englishScoreComparator = new EnglishScoreComparator();

    public void sortUsingIntegerComparator(List<Student> students){
        for(int i=0; i<students.size(); i++){
            for (int j= i+1; j<students.size(); j++){
                if(comparatorImplementation.compare(students.get(i).englishScore, students.get(j).englishScore)==1){
                    int temp = students.get(i).englishScore;
                    students.get(i).englishScore = students.get(j).englishScore;
                    students.get(j).englishScore = temp;
                }
            }
        }
    }

    public void sortUsingComparator(List<Student> students){
        for(int i=0; i<students.size(); i++){
            for (int j= i+1; j<students.size(); j++){
                if(englishScoreComparator.compare(students.get(i), students.get(j)) ==1){
                    Student temp = students.get(i);
                    students.set(i,students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }
}
