package university;

import java.sql.*;  
// program for connecting database to java program
public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///ums","root","Spacepunks@583");    
            s =c.createStatement();  // mysql--> root@localhost -- user , pass -- password
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
