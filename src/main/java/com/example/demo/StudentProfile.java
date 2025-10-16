package com.example.demo;

import jakarta.persistence.*;

@Entity
public class StudentProfile {
    @GeneratedValue
    @Id
    Integer id;

    String bio;

    @OneToOne
    @JoinColumn(
            name = "student_id"
    )
    private Student stud;

    public StudentProfile() {
    }

    public StudentProfile(String bio) {
        this.bio = bio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
