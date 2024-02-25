package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp{
    public static void main(String args[]){



//        Ask how many new users we want to add
        System.out.println("Enter the number of students to enroll: ");
        Scanner obj = new Scanner(System.in);
        int numOfStudents = obj.nextInt();
        Student[] students = new Student[numOfStudents];

//        Create n number of new Students
        for(int n=0; n<numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

        }
        for(int n=0; n<numOfStudents; n++){
            System.out.println(students[n].toString());
        }
    }

}


