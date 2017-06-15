package com.shihu;

public class User {
	private String username;  
    private String password;  
    private int gender;
    private Integer userId;
    public String getUsername() {  
        return username;  
    }  
  
    public void setUsername(String username) {  
        this.username = username;  
    }  
  
    public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }  
  
    public int getGender() {  
        return gender;  
    }  
  
    public void setGender(int gender) {  
        this.gender = gender;  
    } 
    
    public Integer getUserId() {
        return userId;  
    }  
  
    public void setUserId(Integer userId) {
        this.userId = userId;  
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", userId='" + userId + '\'' +
                '}';
    }
}
