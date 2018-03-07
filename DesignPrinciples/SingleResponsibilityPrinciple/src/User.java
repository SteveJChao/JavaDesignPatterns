/**
 * 实体类
 */

public class User {
    public String userName;
    public String pass;

    public int role;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public int getRole() {
        return role;
    }

    public String getPass() {
        return pass;
    }
}
