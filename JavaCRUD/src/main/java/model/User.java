package model;

/**
 * Represents a User with basic details like name, email, and credentials.
 */
public class User {

    private int id;
    private String fname;
    private String lname;
    private String email;
    private String uname;
    private String passwd;

    // Default constructor
    public User() {}

    // Constructor with all fields (optional - useful for quick object creation)
    public User(int id, String fname, String lname, String email, String uname, String passwd) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.uname = uname;
        this.passwd = passwd;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getUname() {
        return uname;
    }

    public String getPasswd() {
        return passwd;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    // Override toString - Masks the password for security reasons
    @Override
    public String toString() {
        return "User [id=" + id 
                + ", fname=" + fname 
                + ", lname=" + lname 
                + ", email=" + email 
                + ", uname=" + uname 
                + ", passwd=" + (passwd != null ? "****" : "null") + "]";
    }
}
