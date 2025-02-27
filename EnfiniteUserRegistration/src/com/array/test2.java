package com.array;

public class test2  {
	
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
//		return ofGetResponseJson(responseDataJlist, "", "Success", ST0, "G", "common.success_msg")
//				.toString();
		

	} catch (SQLException sQLException) {
		ls_return= getExceptionMSg(sQLException, LOGGER, loggerImpl, "IN:getSelectData", "(ENP02
	*/

	public int getValue()
	{
		return 10;
	};
	
	
	public static void main(String arg[])
	{
		
	
		Drawable drawable = new Drawable()
				{

					@Override
					public int draw(int width) {
						// TODO Auto-generated method stub
						//System.out.println(width);
						return width;	
					}
			
				};
				drawable.draw(15);
				
				
				
				
				Drawable drawable1= (width) ->{System.out.println(width);
				return width;
				};		
				drawable1.draw(10);
	
	}



}
