package com.garvit.institute_inbox.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String gender;
    private String hostel;
    private String block;
    private boolean isAvailable;

    // print user
    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", gender='" + gender + '\'' +
        ", hostel='" + hostel + '\'' +
        ", block='" + block + '\'' +
        ", isAvailable=" + isAvailable +
        '}';
    }
}
