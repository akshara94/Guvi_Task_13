package Task13;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) 
	{
		WriteExcel obj1 = new WriteExcel();
		try
		{
			obj1.writeExcelData();
			System.out.println("completed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
	public void writeExcelData() throws Exception
	{
		String filePath = "C:\\Users\\LENOVO\\Desktop\\WriteExcel3.xlsx";
		
		File file = new File(filePath);
		
	
			FileOutputStream OutStream = new FileOutputStream(file);
			XSSFWorkbook book = new XSSFWorkbook();
			XSSFSheet sheet2 = book.createSheet("Writeexcel ");
			
			sheet2.createRow(0).createCell(0).setCellValue("Name,Age,Email");
			
			sheet2.createRow(0).createCell(0).setCellValue("John Doe, 30, john@test.com");
			sheet2.createRow(1).createCell(1).setCellValue("Jane Doe, 28, john@test.com");
			sheet2.createRow(2).createCell(2).setCellValue("Bob Smith,35, jacky@example.com");
			sheet2.createRow(3).createCell(3).setCellValue("Swapnil, 37, Swapnil@example.com");
			
			book.write(OutStream);;
			book.close();
			OutStream.close();
		
		
	}

}
