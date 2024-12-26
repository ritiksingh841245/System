package Student.Management.System;

import java.util.Date;

/**
 * @since 2024
 * @author  Ritik Singh
 */

public class Student {
    private String name;
    private String id;
    private String dept;
    private Date  adimissionDate;
    private String  dateOfBirth;
    public Student(String name,String id, String dept,Date adimissionDate)
    {
       this.name           = name;
       this.id             = id;
       this.dept           = dept;
       this.adimissionDate = adimissionDate;

    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public Date getAdimissionDate() {
        return adimissionDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "{ Student name is        : "+ name+"\" "
                +"Student id is          : "+id+"\" "
                +"Student Department is  : "+dept+"\" "
                +"Student AdimissionDate : "+adimissionDate+"\""
                +"}";
    }

}
