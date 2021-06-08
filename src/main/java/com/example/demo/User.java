package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    int profileID;
    String firstName;
    String lastName;
    String userName;
    String passcode;
    String bio;
    String homeCourt;
    String position;
    String postalCode;

    User(int profileID, String firstName, String lastName, String userName, String passcode, String bio,
         String homeCourt, String position, String postalCode){
        this.profileID=profileID;
        this.firstName=firstName;
        this.lastName=lastName;
        this.userName=userName;
        this.passcode=passcode;
        this.bio=bio;
        this.homeCourt=homeCourt;
        this.position=position;
        this.postalCode=postalCode;
    }

    public int getProfileID() {
        return profileID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPasscode() {
        return passcode;
    }

    public String getBio() {
        return bio;
    }

    public String getHomeCourt() {
        return homeCourt;
    }

    public String getPosition() {
        return position;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public static User sqlUser(ResultSet rs) throws SQLException {
        int profileID = rs.getInt("profileID");
        String firstName = rs.getString("firstName");
        String lastName= rs.getString("lastName");
        String userName= rs.getString("username");
        String passcode = rs.getString("passcode");
        String bio= rs.getString("bio");
        String homeCourt= rs.getString("homeCourt");
        String position= rs.getString("position");
        String postalCode= rs.getString("postalCode");
        return new User(profileID,firstName,lastName,userName,passcode,bio,homeCourt,position, postalCode);
    }

}
