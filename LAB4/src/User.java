/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class User {
    private final String firstName;
    private final String lastName;
    private final String pwd;
    private final String userName;
    private final String secondPwd;
    public User(String firstName, String lastName, String userName, String pwd, String secondPwd) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName=userName;	
        this.pwd = pwd;
        this.secondPwd = secondPwd;
    }
    public String getFirstName() { return firstName;}
    public String getLastName() {return lastName;}
    public String getPwd() {return pwd;}
    public String getUserName() {return userName; }
    public String getSecondPwd() {return secondPwd;}
} 
