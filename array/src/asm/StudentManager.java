package asm;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(int studentId, String name, double marks) {
        Student student = new Student(studentId, name, marks);
        students.add(student);
    }



    public void deleteStudent(int studentId) {
        students.removeIf(student -> student.getStudentId() == studentId);

    }
//    private void quickSort(int low, int high) {
//        if (low < high) {
//            int pi = partition(low, high);
//            quickSort(low, pi - 1);
//            quickSort(pi + 1, high);
//        }
//    }
//    private int partition(int low, int high) {
//        double pivot = students.get(high).getMarks();
//        int i = (low - 1);
//        for (int j = low; j < high; j++) {
//            if (students.get(j).getMarks() <= pivot) {
//                i++;
//                Student temp = students.get(i);
//                students.set(i, students.get(j));
//                students.set(j, temp);
//            }
//        }
//        Student temp = students.get(i + 1);
//        students.set(i + 1, students.get(high));
//        students.set(high, temp);
//
//        return i + 1;
//    }
//
//    public void sortStudents() {
//        quickSort(0, students.size() - 1);

//    }
    public void sortStudents() {
            int n = students.size();

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                // Find the index of the minimum element in the unsorted part of the array
                for (int j = i + 1; j < n; j++) {
                    if (students.get(j).getMarks() < students.get(minIndex).getMarks()) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element of the unsorted part
                if (minIndex != i) {
                    Student tmp = students.get(i);
                    students.set(i, students.get(minIndex));
                    students.set(minIndex, tmp);
                }
            }
        }

    public Student searchStudent(int studentId) {
        sortStudents();
        int low = 0;
        int high = students.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            Student student = students.get(mid);
            if (student.getStudentId() == studentId) {
                return student;
            } else if (student.getStudentId() < studentId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


