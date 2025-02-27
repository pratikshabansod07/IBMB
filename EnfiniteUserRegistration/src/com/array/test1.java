package com.array;

import java.util.Arrays;

/*
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.easynet.impl.JSONArrayImpl;
import com.easynet.impl.LoggerImpl;
import com.easynet.util.common;

String ls_return = null;       
Connection connection = null;
PreparedStatement preparedStatement = null;
LoggerImpl loggerImpl=null;
JSONArrayImpl responseDataJlist = new JSONArrayImpl() ;
int parameterIndex=0;
ResultSet resultSet=null;

try {
	loggerImpl=new LoggerImpl();

	connection=getDbConnection();
	preparedStatement=connection.prepareStatement(Query);

	ofsetQueryParameter(parameterIndex, preparedStatement, as_input);

	resultSet =preparedStatement.executeQuery();

	responseDataJlist=getResultSetData(resultSet);

	return common.ofGetResponseJson(responseDataJlist, "", "", ST0,"G","").toString();
//	return ofGetResponseJson(responseDataJlist, "", "Success", ST0, "G", "common.success_msg")
//			.toString();
	

} catch (SQLException sQLException) {
	ls_return= getExceptionMSg(sQLException, LOGGER, loggerImpl, "IN:getSelectData", "(ENP02
*/


public class test1  {

	public static void main(String[]arg)
	{	
		
	int no=5;
	int m;
		for(int i=no;i<=no;i++) {
		
			for(int j=1+i;j<=10;j++)
			{
				 m=i*j;
				 System.out.println(m);
			}
			
			 String s1="Java";
			 String s2= new String();			 
			 s2="Java";
			
			 s1.equals(s2);
			 s1==(s2);
			 
			 
		input 1252
			 
			output= 2521
			
		}
		
		
	}
	
	
	

}