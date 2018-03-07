import java.sql.*;

public class ConnMySql {
    public Connection connection = null;
    public Statement statement = null;

    //用来连接数据库
    public void connDatabase(String connName, String schemaName, String sqlUser, String sqlPassword){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println("Class not found on loading driver");
            e.printStackTrace();
        }
        try{
            String url = "jdbc:mysql://" + connName + "/" + schemaName + "?useSSL=false";
            Connection connection = DriverManager.getConnection(url, sqlUser, sqlPassword);
            statement = connection.createStatement();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void closeConnection(){
        try{
            connection.close();
            statement.close();
        }catch(SQLException e){
            System.out.println("onConnMysql/closeConnection: connection or statement not been initialize");
            e.printStackTrace();
        }
    }

    //

    public Statement getStatement(String connName, String schemaName, String sqlUser, String sqlPassword) {
        connDatabase(connName, schemaName, sqlUser, sqlPassword);
        return statement;
    }

    public Connection getConnection() {
        return  connection;
    }
}
