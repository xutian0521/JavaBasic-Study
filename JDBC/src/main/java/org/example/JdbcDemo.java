package org.example;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //2.获取连接
        Connection conn= DriverManager.getConnection("jdbc:mysql://106.13.100.110/Test1","root","xutian@2020");
        //3.获取操作数据库的预处理对象
        PreparedStatement pstm= conn.prepareStatement("SELECT * FROM user;");
        //4.执行SQL，得到结果集
        ResultSet rs= pstm.executeQuery();
        //5.遍历结果集
        while (rs.next()){
            System.out.println(rs.getString("name"));
        }
        //6.释放资源
        rs.close();
        pstm.close();
        conn.close();
    }
}
