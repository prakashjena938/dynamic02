package com.prakash.jpa02.ENTITY;
import jakarta.persistence.*;

@Entity   // link or connect the db with class

@Table(name = "student" )   //table name

public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "course")
    private String course;
    @Column(name = "email")
    private String email;
    @Column(name = "age")
    private String age;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public student( String name,String course, String email, String age) {
//        this.id = id;
        this.name = name;
        this.course = course;
        this.email = email;
        this.age = age;
    }


student(){}


    @Override
    public String toString() {
        return "student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", email='" + email + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

