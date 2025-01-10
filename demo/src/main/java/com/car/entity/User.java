package com.car.entity;

import java.util.Objects;
public class User {

    //variables
    private long UserId;
    private String UserName;
    private String UserEmail;
    private String UserPassword;
    private String UserAddress;
    private boolean UserBlocked;
    private UserRole UserRole;
    

    //constructor
    public User(long userId, String userName, String userEmail, String userPassword, String userAddress, boolean userBlocked, UserRole userRole) {
        UserId = userId;
        UserName = userName;
        UserEmail = userEmail;
        UserPassword = userPassword;
        UserAddress = userAddress;
        UserBlocked = userBlocked;
        UserRole = userRole;
    }


    //getters and setters
    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserAddress() {
        return UserAddress;
    }

    public void setUserAddress(String userAddress) {
        UserAddress = userAddress;
    }

    public boolean isUserBlocked() {
        return UserBlocked;
    }

    public void setUserBlocked(boolean userBlocked) {
        UserBlocked = userBlocked;
    }

    public UserRole getUserRole() {
        return UserRole;
    }

    public void setUserRole(UserRole userRole) {
        UserRole = userRole;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", UserName='" + UserName + '\'' +
                ", UserEmail='" + UserEmail + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", UserAddress='" + UserAddress + '\'' +
                ", UserBlocked=" + UserBlocked +
                ", UserRole=" + UserRole +
                '}';
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return UserId == user.UserId &&
                UserBlocked == user.UserBlocked &&
                Objects.equals(UserName, user.UserName) &&
                Objects.equals(UserEmail, user.UserEmail) &&
                Objects.equals(UserPassword, user.UserPassword) &&
                Objects.equals(UserAddress, user.UserAddress) &&
                UserRole == user.UserRole;
    }

    @Override
    public int hashCode() {
        return Objects.hash(UserId, UserName, UserEmail, UserPassword, UserAddress, UserBlocked, UserRole);
    }

}
