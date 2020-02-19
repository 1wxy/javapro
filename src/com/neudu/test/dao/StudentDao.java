package com.neudu.test.dao;

import com.neudu.test.pojo.Student;
import com.neudu.test.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IStudentDao {
    String url="jdbc:mysql://192.168.153.150:3306/db1?useUnicode=true&characterEncoding=utf8";
    String usename="root";
    String password="123456";
    @Override
    //查询信息
    public List<Student> query() {
        List<Student> list=new ArrayList<>();
        Connection con=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
             con=DriverManager.getConnection(url,usename,password);
            //创建命令行 写sql语句
             pstmt=con.prepareStatement("select Sno,Sname,Sex,Sage,Sdept from Student");
            //执行sql语句
            // 如果是查询  调用 executeQuery方法 返回一个 ResultSet 结果集
             rs=pstmt.executeQuery();
            /*  ResultSet 每次调用 next()方法的时候 会做两件事
             *    1 看一下有没有下一行 如果没有返回fasle
             *    2 如果有 将游标推向下一行 返回true
             *
             *
             * */
            while (rs.next()){
                Student student=new Student();
                student.setSno(rs.getInt("Sno"));
                student.setSname(rs.getString("Sname"));
                student.setSex(rs.getString("Sex"));
                student.setSage(rs.getInt("Sage"));
                list.add(student);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (rs!=null)
                   rs.close();
                if (pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    //添加信息
    public int add(Student student) {
        //3、最简方法  第2种方法 JdbcUtil.executeUpdate（）定义了动态数组
        return JdbcUtil.executeUpdate("insert into Student(Sno,Sname,Sex,Sage) values(?,?,?,?)",student.getSno(),student.getSname(),student.getSex(),student.getSage());

        //2、封装共同增删改后的方法
       /* String sql="insert into Student(Sno,Sname,Sex,Sage) values(?,?,?,?)";
        Object[] params={student.getSno(),student.getSname(),student.getSex(),student.getSage()};
        int i=JdbcUtil.executeUpdate(sql,params);
        return i;*/


        //1、最复杂方法
       /* Connection con=null;
        PreparedStatement pstmt=null;
        int i=0;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            con=DriverManager.getConnection(url,usename,password);
            //创建命令行 写sql语句
            pstmt=con.prepareStatement("insert into Student(Sno,Sname,Sex,Sage) values(?,?,?,?)");
            //问号 的值
            pstmt.setInt(1,student.getSno());
            pstmt.setString(2,student.getSname());
            pstmt.setString(3,student.getSex());
            pstmt.setInt(4,student.getSage());
            //执行sql语句
            i=pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;*/
    }

    @Override
    //修改信息
    public int updata(Student student) {
        //3、最简方法  第2种方法 JdbcUtil.executeUpdate（）定义了动态数组
        return JdbcUtil.executeUpdate("update Student set Sname=?,Sex=?,Sage=? where Sno=?",student.getSname(),student.getSex(),student.getSage(),student.getSno());

        //2、封装共同增删改后的方法
        /*String sql="update Student set Sname=?,Sex=?,Sage=? where Sno=?";
        Object[] params={student.getSname(),student.getSex(),student.getSage(),student.getSno()};
        int i=JdbcUtil.executeUpdate(sql,params);
        return i;*/

        //1、最复杂方法
       /* Connection con=null;
        PreparedStatement pstmt=null;
        int i=0;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            con=DriverManager.getConnection(url,usename,password);
            //创建命令行 写sql语句
            pstmt=con.prepareStatement("update Student set Sname=?,Sex=?,Sage=? where Sno=?");
            //问号 的值
            pstmt.setString(1,student.getSname());
            pstmt.setString(2,student.getSex());
            pstmt.setInt(3,student.getSage());
            pstmt.setInt(4,student.getSno());
            //执行sql语句
            i=pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;*/
    }

    @Override
    //删除信息
    public int del(int Sno) {
        //3、最简方法  第2种方法 JdbcUtil.executeUpdate（）定义了动态数组
        return JdbcUtil.executeUpdate("delete from Student where Sno=?",Sno);

        //2、封装增删改后的方法
     /*   String sql="delete from Student where Sno=?";
        Object[] params={Sno};
        int i=JdbcUtil.executeUpdate(sql,params);
        return i;*/

        //1、最复发方法
        /*Connection con=null;
        PreparedStatement pstmt=null;
        int i=0;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            con=DriverManager.getConnection(url,usename,password);
            //创建命令行 写sql语句
            pstmt=con.prepareStatement("delete from Student where Sno=?");
            //问号 的值
            pstmt.setInt(1,Sno);
            //执行sql语句
            i=pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstmt!=null)
                    pstmt.close();
                if (con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;*/
    }

    @Override
    public Student queryone(int Sno) {
        return null;
    }
}
