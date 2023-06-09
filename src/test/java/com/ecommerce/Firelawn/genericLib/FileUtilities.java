package com.ecommerce.Firelawn.genericLib;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import com.mysql.cj.jdbc.Driver;


/**
 * 
 * @author Karthik Shivappa
 *
 */
public class FileUtilities {
	public static Connection con;
	/**
	 * It is used to read the data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertydata(String key) throws IOException
	{
		Properties p= new Properties();
		FileInputStream fis=new FileInputStream(AutoConstant.propertyFilePath);
		p.load(fis);
		return p.getProperty(key);
		
	}
	
	/**
	 * It is used to read the data from excel file
	 * @param Sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExceldata(String Sheetname, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream(AutoConstant.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		String s = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return s;
		
	}
	
	/**
	 * it is used to read the data from database
	 * @return
	 * @throws SQLException
	 */
	public static Connection getDataDb() throws SQLException {
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
	    return con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wcse15","root","root");
	    
	}
	
	/**
	 * It is execute the query
	 * @param query
	 * @param columnName
	 * @param ExceptedResults
	 * @return
	 * @throws SQLException
	 */
	
	public String queryExecution(int columnName,String ExceptedResults) throws SQLException {
		Statement statement = con.createStatement();
		
		 String query="select * from cardsdetails";
		 ResultSet result = statement.executeQuery(query);


		 while(result.next()) {
			 if(result.getString(columnName).equals(ExceptedResults)) {
				 break;
			 }
			 else
			 {
			System.out.println("Data not found");
			
			 }
		 }
		return ExceptedResults;
		
	}
	/**
	 * close the database connection
	 * @throws SQLException
	 */
	public static void closedb() throws SQLException {
		con.close();
	}

}
