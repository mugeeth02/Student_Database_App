package studentdatabaseapp;

import java.util.Scanner;

public class Student{
    private String firstName;
    private String lastName;
    private String gradYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    public static int id = 1001;

// add arul

    //    Constructor : prompt user to enter student's name and year
    public Student(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Student First Name: ");
        this.firstName = obj.nextLine();
        System.out.println("Enter Student Last Name: ");
        this.lastName= obj.nextLine();
        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\n Enter Student Class Level: ");
        this.gradYear= obj.nextLine();
        setStudentID();
//        System.out.println(firstName + " " + lastName + " " + gradYear + " " + studentID);
    }
//    Generate an ID
    private void setStudentID(){
        //Grad level + ID
        id++;
       this.studentID =  gradYear + "" + id;
    }

//    Enroll in courses
    public void enroll(){
//        Get inside a loop,user hits 0
        do {
            System.out.print("Enter courses to enroll(Q to quit): ");
            Scanner obj = new Scanner(System.in);
            String course = obj.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
//                System.out.println("BREAK");
                break;
            }
        } while (1 != 0) ;
//        System.out.println("ENROLLED IN: " + courses);
//        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

//    View Balanace
    public void viewBalance(){
        System.out.println("your Balance is: $" + tuitionBalance);
    }

//    Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: ");
        Scanner obj = new Scanner(System.in);
        int payment = obj.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

//    Show Status
    public String toString(){
        return "Name: " + firstName +" "+ lastName +
                "\ngradyear: " + gradYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}

