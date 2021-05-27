package InternAssignment.OpenCart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExcel {

	public  Object[][] testData() throws IOException {

		String projectpath = System.getProperty("user.dir");

		XSSFWorkbook datasheet = new XSSFWorkbook(projectpath+"\\excel\\internData.xlsx");
		XSSFSheet sheet = datasheet.getSheet("LoginPage");

		int rowcount = sheet.getPhysicalNumberOfRows();
		int columncount = sheet.getRow(0).getPhysicalNumberOfCells();

		//System.out.println(rowcount);
		//System.out.println(columncount);


		Object data[][] = new Object[rowcount-1][columncount];
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<columncount;j++)
			{
				String op = sheet.getRow(i).getCell(j).getStringCellValue();

				data[i-1][j]= op;
			}
		}
		return data;
	}
}
