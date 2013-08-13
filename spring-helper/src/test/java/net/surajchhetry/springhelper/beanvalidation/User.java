package net.surajchhetry.springhelper.beanvalidation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author surajchhetry
 */
public class User {

    private int id;
    private String userName;
    private String password;
    private String email;
    private int age;

    public User() {
        this.userName = null;
        this.password = null;
    }

    public User(String userName, String password, int age) {
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    @NotNull(message = "username is blank")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @NotNull(message = "password is blank")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Min(value = 16, message = "Under age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
