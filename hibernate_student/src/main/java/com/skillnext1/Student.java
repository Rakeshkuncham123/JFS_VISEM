package com.skillnext1;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int s_id;

    private String s_name;
    private String Branch;
    //private double salary;

    public Student() {}

    public Student(String s_name, String Branch) {
        this.s_name = s_name;
        this.Branch = Branch;
        //this.salary = salary;
    }

    // getters & setters
    public int getId() { return s_id; }

    public String getName() { return s_name; }
    public void setName(String s_name) { this.s_name = s_name; }

    public String getBranch() { return Branch; }
    public void setBranch(String Branch) { this.Branch = Branch; }

    
}
