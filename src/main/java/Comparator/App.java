package Comparator;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Student johnDoe = new Student("John Doe", 43, 61, 74);
        Student janeDoe = new Student("Jane Doe", 85, 82, 95);
        Student blackSmith = new Student("Black Smith", 59, 15, 86);
        Student anaBlaze = new Student("Ana Blaze", 90, 96, 56);

        InsertionSort insertionSort = new InsertionSort();
        List<Student> students = new ArrayList<>();
        students.add(johnDoe);
        students.add(janeDoe);
        students.add(blackSmith);
        students.add(anaBlaze);

        insertionSort.sortUsingComparator(students);
        System.out.println(students);
    }
}
