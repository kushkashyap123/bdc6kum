package seldemos1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class morecomTest {
  //@Test
  public static Object[][] readData() throws IOException{
	  FileInputStream mk = new FileInputStream("C:\\Users\\Training_b6b.01.03\\Desktop\\kum.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(mk);
	  XSSFSheet sheet1 =wb.getSheetAt(0);
	  int rowCount = sheet1.getPhysicalNumberOfRows();
	  XSSFRow row1 = sheet1.getRow(0);
	  int cellcount = row1.getPhysicalNumberOfCells();
	  Object excelData[][]=new Object[rowCount][cellcount];
	  for(int i=0;i<rowCount;i++)
	  {
		  for(int j=0;j<cellcount;j++)
		  {
			  excelData[i][j]=sheet1.getRow(i).getCell(j).getStringCellValue();
		  }
	  }
	  return excelData;
  }
}

