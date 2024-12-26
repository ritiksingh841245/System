package Student.Management.System;

import java.util.Scanner;


/**
 * Student Management System
 * Features
 * Add a new student.
 * View all students.
 * Search for a student by ID or name.
 * Update student details.
 * Delete a student.
 * Exit the program.
 * Project Structure
 * Entity Class: Student
 * Main Class: StudentManagementSystem
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentServices students  = new StudentServices();
      loop : while (true)
        {
            System.out.println("--------WellCome-------");
            System.out.println(" 1 : Add a new student");
            System.out.println(" 2 : View all students");
            System.out.println(" 3 : Search for a student by ID or name");
            System.out.println(" 4 : Update student details");
            System.out.println(" 5 : Delete a student.");
            System.out.println(" 6 : Exit the program.");
            System.out.println("--------chosse one--------");
            try {
                int Number = sc.nextInt();
                switch (Number)
                {
                    case 1 :
                        students.addStundent();
                        break;
                    case 2 :
                        students.ViewAllStudents();
                        break;
                    case 3 :
                        students.Search();
                        break;
                    case 4 :
                        students.updateStudentDetails();
                        break;
                    case 5 :
                        students.deleteStudent();
                        break;
                    case 6 :  break loop;
                    default:
                        System.out.println("chosse valid Number");
                }

            }
            catch (Exception e)
            {
                System.out.println("please Enter Number ");
                sc.nextLine();
            }
        }
        System.out.println("HTANK YOU __/\\__ FOE COMEING ");

    }
}
