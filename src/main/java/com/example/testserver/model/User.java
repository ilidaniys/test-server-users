package com.example.testserver.model;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String nickName;
    private Boolean status;
    private String location;
    private String phoneNumber;

    public User(String name, String lastName, String nickName, Boolean status, String location, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.nickName = nickName;
        this.status = status;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
