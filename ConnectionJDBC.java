//import the sql packages

import java.sql.*;

class ConnectionJDBC{
  public static void main(String agrs[]){
    try{
        //load the driver
        // this url work for version 8 upper  if work on 5 below remove cj  or check on mysql.driver.com
        Class.forName("com.mysql.cj.jdbc.Driver");  
             
        //info database
         // 127.0.0.1  is localhost ip  & 3306 is port number of sql service   & mydb is database name
        String url = "jdbc:mysql://127.0.0.1:3306/mydb";
        // type your database user name
        String username = "root";
        // type your database password   
        String password="password";  
        // create a connection
        Connection con = DriverManager.getConnection(url, username, password);
        if(con.isClosed()){
          System.out.println("connection is band ahe");
        } else{
          System.out.println("connection chalu ahe");
        }
    }catch(Exception e){

      e.printStackTrace();

    }
  }
}