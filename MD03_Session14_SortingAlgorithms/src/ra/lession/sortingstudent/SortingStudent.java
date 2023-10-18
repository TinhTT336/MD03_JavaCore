package ra.lession.sortingstudent;

import java.util.Arrays;

public class SortingStudent {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Nam", 7);
        students[1] = new Student("Lan", 7.6);
        students[2] = new Student("Ha", 8.4);
        students[3] = new Student("Mai", 9.0);
        students[4] = new Student("Nga", 9.5);

        System.out.println("Mang Student ban dau: " + Arrays.toString(students));

        System.out.println("Mang Student sap xep theo bubbleSort: " + Arrays.toString(sortBubble(students)));
        System.out.println("Mang Student sap xep theo selectionSort: " + Arrays.toString(sortSelection(students)));
        System.out.println("Mang Student sap xep theo insertionSort: " + Arrays.toString(sortInsertion(students)));
        ;

    }

    public static Student[] sortBubble(Student[] student) {
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = 0; j < student.length - 1 - i; j++) {
                if (student[j].getScore() < student[j + 1].getScore()) {
                    Student temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
        return student;
    }

    public static Student[] sortSelection(Student[] student) {
        int max;
        for (int i = 0; i < student.length - 1; i++) {
            max = i;
            for (int j = i + 1; j < student.length; j++) {
                if (student[j].getScore() > student[max].getScore()) {
                    max = j;
                }
                if(max!=i){
                    Student temp=student[max];
                    student[max]=student[j];
                    student[j]=temp;
                }
            }
        }
        return student;
    }

    public static Student[]sortInsertion(Student[]student){
        int position;
        Student value;
        for (int i = 0; i < student.length; i++) {
            position=i;
            value=student[i];
          while(position>0&&value.getScore()>student[position-1].getScore()){
              student[position]=student[position-1];
              position--;
          }

        }

        return student;

    }
}
