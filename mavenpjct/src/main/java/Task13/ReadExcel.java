package Task13;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel
{
	public static void main(String[] args)
	{
		ReadExcel obj = new ReadExcel();
		try
		{
			obj.getReadexcel();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void getReadexcel() throws Exception
	{
		String filePath = "C:\\Users\\LENOVO\\Desktop\\ReadExcel.xlsx";
		
		FileInputStream inStream = new FileInputStream(filePath);
		
		XSSFWorkbook book = new XSSFWorkbook(inStream);
		//XSSFSheet sheet = book.getSheet("sheet1");
		
		DataFormatter format = new DataFormatter();
		String result = null;
		//int lastRow = book.getSheet("Sheet1").getLastRowNum();
		//System.out.println(lastRow);
		
		for(int i=0; i<=4; i++)
		{
			for(int j=0; j<=3; j++) {
				
				XSSFCell cell = book .getSheet("Sheet1").getRow(i).getCell(j);
				result = format.formatCellValue(cell);
				System.out.print(result +"--");
			}
			System.out.println();
		}
	
		book.close();
		inStream.close();
		
	}
}