package Student.Management.System;

import java.util.*;

/**
 * @since 2024
 * @author Ritik Singh
 * Student Management System
 * Features
 * Add a new student.
 * View all students.
 * Search for a student by ID or name.
 * Update student details.
 * Delete a student.
 *
 */

public class StudentServices {
    private List<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addStundent()
    {
            System.out.println("Enter Student Name ");
            String name = sc.nextLine();
            System.out.println("Enter id");
            String id = sc.nextLine();
            System.out.println("enter Department Name");
            String dept = sc.nextLine();
            Date adimission = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(adimission);
            calendar.add(Calendar.DAY_OF_MONTH, 14);
            students.add(new Student(name, id, dept, adimission));
            System.out.println("Student add Succesfully");


    }
    // Search for a student by ID or name.
    public void Search()
    {
        int i = 0;
        System.out.println("Enter Id or name for search ");
        String naId = sc.nextLine().toLowerCase();
        for (Student s : students)
        {
            if (s.getId().equals(naId) || s.getName().toLowerCase().equals(naId))
            {
                System.out.println(s);
                i++;
            }

        }
        if (i==0)
            System.out.println("Student is not avilabile ");

    }
    public void ViewAllStudents()
    {
        int i = 0;
        System.out.println("Student All detail");
        for (Student s : students)
        {
            i++;
            System.out.println(s);
        }
        if (i==0)
            System.out.println("-----Empty-----");

    }
    public void deleteStudent()
    {

        int i = 0;
        System.out.println("Enter Id or name for Delete Student ");
        String naId = sc.nextLine().toLowerCase();
        for (Student s : students)
        {
            if (s.getId().equals(naId) || s.getId().toLowerCase().equals(naId))
            {
                students.remove(s);
                i++;
                System.out.println("remove Student ");
            }
        }
        if (i==0)
            System.out.println("Student is not avilabile ");
    }
    public void updateStudentDetails()
    {
        int i = 0;
        System.out.println("Enter Id or name for Update Student Details ");
        String naId = sc.nextLine().toLowerCase();
        for (Student s : students)
        {
            if (s.getId().equals(naId) || s.getId().toLowerCase().equals(naId))
            {
                System.out.println(" 1 : for Name ");
                System.out.println(" 2 : for Department");
                try {
                    int number = sc.nextInt();
                    System.out.println(" chosse which one update ");
                    sc.nextLine();
                    switch (number) {
                        case 1:
                            System.out.println("Enter new Name ");
                            String name1 = sc.nextLine();
                            s.setName(name1);
                            System.out.println(" name change ");
                            break;
                        case 2:
                            System.out.println("Enter new Department ");
                            String dept = sc.nextLine();
                            s.setDept(dept);
                            System.out.println(" Department change ");
                            break;
                        default:
                            System.out.println("chosse valid Number");
                            updateStudentDetails();

                    }
                }
                catch (Exception e)
                {
                    System.out.println("Enter only Number");
                    sc.nextLine();
                }
            }
        }
        if (i==0)
            System.out.println("Student is not avilabile ");

    }

}
