/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disease_welcome;

import java.sql.*;
import java.util.*;

/**
 *
 * @author dell
 */
public class Call {

public Vector getstudent()throws Exception 
{
Vector<Vector<String>> studentVector = new Vector<Vector<String>>();
    
try{
connect ob = new connect();
    Connection con = ob.conn();
    
        PreparedStatement ps = con.prepareStatement("select * from pat_login");
        ResultSet rs = ps.executeQuery();

while(rs.next())
{
Vector<String> student = new Vector<String>();
student.add(rs.getString(1));
student.add(rs.getString(2));
studentVector.add(student);
}}
catch(Exception e)
{System.out.println(e);
}

return studentVector;
}}
