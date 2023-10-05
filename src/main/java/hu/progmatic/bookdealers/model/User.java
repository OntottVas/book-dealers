package hu.progmatic.bookdealers.model;

public class User {

    public String userName;
    String email;
    public int id;

    public User() {
    }

    public User(String userName,String email, int id) {
        this.userName = userName;
        this.email=email;
        this.id = id;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
