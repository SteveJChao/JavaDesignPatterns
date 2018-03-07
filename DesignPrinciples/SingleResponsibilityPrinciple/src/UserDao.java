/**
 * 单一职责原则
 *   数据持久层
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    ConnMySql connMySql = new ConnMySql();
    public Statement statement = connMySql.getStatement("UserSystem", "usersystem",
            "root", "123456");

    Connection connection = connMySql.getConnection();

    //返回所有用户
    public List<User> getAllUser() {

        List<User> userList = new ArrayList<User>();
        String sql = "select * from user";
        try {
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                User user = new User();
                user.setUserName(rs.getString("UserName"));
                user.setPass(rs.getString("password"));
                user.setRole(rs.getInt("role"));
                userList.add(user);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                statement.close();
                connection.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return userList;
    }

    //根据用户名查询
    public User getUserByName(String userName) {
        User user = null;
        String sql = "select * from user where username = " + userName;
        try {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                user = new User();
                user.setUserName(resultSet.getString("UserName"));
                user.setPass(resultSet.getString("password"));
                user.setRole(resultSet.getInt("role"));
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                statement.close();
                connection.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return user;
    }

    //添加新用户
    public boolean addUser(User user) {
        boolean flag = false;
        try {
            String sql = "insert into user(username, pass, role) values (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPass());
            preparedStatement.setInt(3, user.getRole());

            preparedStatement.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try{
                statement.close();
                connection.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
