/**
 * 业务逻辑类
 */

public class UserManager {
    private UserDao userDao = new UserDao();

    //登陆验证
    public boolean checkUser(String name, String password) {
        boolean flag = false;
        User user = userDao.getUserByName(name);
        if (user != null && user.getPass() == password) {
            flag = true;
        }
        return flag;
    }

    //注册用户
    public void register(User user) {
        if (userDao.getUserByName(user.getUserName()) != null) {
            System.out.println("此用户名已被注册");
            return;
        }else {
            System.out.println("注册成功");
        }

    }

}
