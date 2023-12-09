import java.util.Comparator;
import java.util.List;

class Student2 {
    String name;
    double GPA;

    public Student2(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем студентов по убыванию GPA
        if (student1.getGPA() > student2.getGPA()) {
            return -1;
        } else if (student1.getGPA() < student2.getGPA()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void quickSort(List<Student> students) {
        if (students == null || students.isEmpty()) {
            return;
        }
        quickSort(students, 0, students.size() - 1);
    }

    private static void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private static int partition(List<Student> students, int low, int high) {
        double pivot = students.get(high).getGPA();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students.get(j).getGPA() >= pivot) {
                i++;
                // Swap students[i] and students[j]
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }
        // Swap students[i+1] and students[high] (or pivot)
        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", 3.8),
                new Student("Bob", 3.6),
                new Student("Charlie", 4.0),
                new Student("David", 3.9),
                new Student("Eva", 3.7)
        );

        System.out.println("Unsorted Students:");
        for (Student student : students) {
            System.out.println(student);
        }

        SortingStudentsByGPA.quickSort(students);

        System.out.println("\nSorted Students by GPA (Descending Order):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
